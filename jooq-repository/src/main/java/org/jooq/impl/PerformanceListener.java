package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.ExecuteContext;
import org.jooq.conf.SettingsTools;
import org.jooq.tools.StopWatch;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 基于jooq的数据库执行性能监听器
 *
 * @author xujin.wxj
 */
@Slf4j
public class PerformanceListener extends DefaultExecuteListener {

    private static boolean SHOW_SQL = Boolean.valueOf(System.getProperty("jooq.show-sql", "true"));

    private static String SLOW_QUERY_TIME = System.getProperty("jooq.slow-query-time", "5000");

    private static ThreadLocal<List<String>> sqlList = ThreadLocal.withInitial(() -> new ArrayList<>());
    private static ThreadLocal<StopWatch> stopWatch = ThreadLocal.withInitial(() -> new StopWatch());


    @PostConstruct
    public void init() {
    }

    @Override
    public void start(ExecuteContext ctx) {
    }

    @Override
    public void renderEnd(ExecuteContext ctx) {

        // Create a new DSLContext for logging rendering purposes
        DSLContext dslContext = DSL.using(ctx.dialect(),
                SettingsTools.clone(ctx.settings()).withRenderFormatted(false));
        if (ctx.query() != null) {
            String sql = dslContext.renderInlined(ctx.query());
            try {
                if (sql.contains("liyifei")) {
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sqlList.get().add(sql);
        }
    }


    @Override
    public void executeEnd(ExecuteContext ctx) {
        if (SHOW_SQL) {
            log.info("jOOQ Meta executed:\n{}", sqlList.get());
        } else if (stopWatch.get().split() > TimeUnit.MILLISECONDS.toNanos(Long.parseLong(SLOW_QUERY_TIME))) {
            log.warn("jOOQ Meta executed a slow query:\n{}", sqlList);
        }
    }


}
