package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.jooq.impl.*;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;

@Slf4j
public class TenantListener extends DefaultExecuteListener {

    private final static Field<String> TARGET_FIELD = DSL.field(name("tenant_code"), String.class);
    private final static ThreadLocal<Param<String>> TARGET_VALUE = ThreadLocal.withInitial(() -> DSL.val("default"));
    private final static boolean DEBUG_ENABLE = Boolean.valueOf(System.getProperty("jooq.debug", "true"));


    @Override
    public void renderStart(ExecuteContext ctx) {
        Query query = ctx.query();
        //插入时,自动插入tenant_code
        if (query instanceof InsertQueryImpl) {
            InsertQueryImpl insertQuery = (InsertQueryImpl) query;
            Table table = insertQuery.table();
            Field<String> field = table.field(TARGET_FIELD);
            if (field != null) {
                insertQuery.addValue(field, TARGET_VALUE.get());
            }
        }
        //更新时, 禁止tenant_code更新,增加tenant_code匹配
        if (query instanceof UpdateQueryImpl) {
            UpdateQueryImpl updateQuery = (UpdateQueryImpl) query;
            FieldMapForUpdate values = updateQuery.getValues();
            Table<?> table = updateQuery.table();
            Field<String> field = table.field(TARGET_FIELD);
            if (field != null) {
                values.remove(field);
            }
            updateQuery.addConditions(table.field(TARGET_FIELD).eq(TARGET_VALUE.get()));
        }

        //查询时, 增加tenant_code匹配
        if (query instanceof SelectQueryImpl) {
            SelectQueryImpl selectQuery = (SelectQueryImpl) query;
            TableList tables = selectQuery.getFrom();
            for (Table<?> table : tables.wrapped()) {
                Field<String> field = table.field(TARGET_FIELD);
                if (field != null) {
                    table.field(TARGET_FIELD).eq(TARGET_VALUE.get());
                    selectQuery.addConditions(table.field(TARGET_FIELD).eq(TARGET_VALUE.get()));
                }
            }
        }
        if (query instanceof DeleteQueryImpl) {
            DeleteQueryImpl deleteQuery = (DeleteQueryImpl) query;
            Table<?> table = deleteQuery.table();
            Field<String> field = table.field(TARGET_FIELD);
            if (field != null) {
                deleteQuery.addConditions(table.field(TARGET_FIELD).eq(TARGET_VALUE.get()));
            }
        }
        if (DEBUG_ENABLE) {
//            log.info("==>query start:{}", query.getClass());
        }
    }


    /**
     * 更新某一列的多条写入记录
     *
     * @param n
     * @return
     */
    private List createFieldValues(int n) {
        List rows = new ArrayList();
        for (int i = 0; i < n; i++) {
            rows.add(TARGET_VALUE.get());
        }
        return rows;
    }

}