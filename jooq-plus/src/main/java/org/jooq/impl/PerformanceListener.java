package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.ExecuteContext;
import org.jooq.conf.SettingsTools;
import org.jooq.tools.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 基于jooq的数据库执行性能监听器，支持批量SQL
 *
 * @author liyifei
 */
@Slf4j
public class PerformanceListener implements DefaultListener {

    /**
     * 是否显示执行的SQL
     */
    private static final boolean SHOW_SQL = Boolean.valueOf(System.getProperty("jooq.show-sql", "true"));

    /**
     * 慢SQL的阈值
     */
    private static final long SLOW_QUERY_TIME = Long.valueOf(System.getProperty("jooq.slow-query-time", "1000"));

    /**
     * 存储当前执行的SQL列表
     */
    private static final ThreadLocal<List<String>> SQL_QUERIES = ThreadLocal.withInitial(() -> new ArrayList<>());
    /**
     * 整体SQL请求的计时器
     */
    private static final ThreadLocal<StopWatch> STOP_WATCH = ThreadLocal.withInitial(() -> new StopWatch());

    @Override
    public void start(ExecuteContext ctx) {
        //init for every outer call on this thread, not every invocation of this method
        SQL_QUERIES.get();
        STOP_WATCH.get();
    }

    @Override
    public void renderEnd(ExecuteContext ctx) {
        try {
            // Create a new DSLContext for logging rendering purposes
            DSLContext dslContext = DSL.using(ctx.dialect(),
                    SettingsTools.clone(ctx.settings()).withRenderFormatted(false));
            if (ctx.query() != null) {
                String sql = dslContext.renderInlined(ctx.query());
                SQL_QUERIES.get().add(sql);
            }
        } catch (Exception e) {
            //ignore
        }
    }


    @Override
    public void executeEnd(ExecuteContext ctx) {
        try {
            StopWatch sw = STOP_WATCH.get();
            String format = StopWatch.format(sw.split());
            //enable show-sql or exists slow-query
            if (SHOW_SQL || sw.split() > TimeUnit.MILLISECONDS.toNanos(SLOW_QUERY_TIME)) {
                List<String> list = SQL_QUERIES.get();
                if (list.size() > 0) {
                    log.info("sql query by jooq cost {}:\n{}", format, list);
                }
            }
            SQL_QUERIES.remove();
            STOP_WATCH.remove();
        } catch (Exception e) {
            //ignore
        }
    }


    @Override
    public void exception(ExecuteContext ctx) {
        try {
            StopWatch sw = STOP_WATCH.get();
            List<String> sqlList = SQL_QUERIES.get();
            List<String> failedList = new ArrayList<>();
            if (sqlList.size() > 0) {
                failedList.add(sqlList.remove(sqlList.size() - 1));
            }
            String format = StopWatch.format(sw.split());
            //enable show-sql or exists slow-query
            if (SHOW_SQL || sw.split() > TimeUnit.MILLISECONDS.toNanos(SLOW_QUERY_TIME)) {
                log.info("sql query by jooq cost {}:\nsucceed:{}\nfailed:{}", format, sqlList, failedList);
            }
            SQL_QUERIES.remove();
            STOP_WATCH.remove();
        } catch (Exception e) {
            //ignore
        }
    }

}
