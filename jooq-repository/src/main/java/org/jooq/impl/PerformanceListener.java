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

    private StopWatch stopWatch = new StopWatch();
    private List<String> sqlList = new ArrayList<>();


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
            sqlList.add(dslContext.renderInlined(ctx.query()));
        }
    }


    @Override
    public void executeEnd(ExecuteContext ctx) {
        if (SHOW_SQL) {
            log.info("jOOQ Meta executed:\n{}", sqlList);
        } else if (stopWatch.split() > TimeUnit.MILLISECONDS.toNanos(Long.parseLong(SLOW_QUERY_TIME))) {
            log.warn("jOOQ Meta executed a slow query:\n{}", sqlList);
        }
        sqlList = new ArrayList<>();
        stopWatch = new StopWatch();
    }


}
