package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.val;

@Slf4j
public class FieldAppendListener extends DefaultExecuteListener {


    private Field<String> TARGET_FIELD;
    private static final Map<String, ThreadLocal<Param<String>>> DEFAULT_VALUES = new HashMap<>();

    /**
     * 需要追加的字段和默认值
     *
     * @param fieldName
     * @param defaultValue
     */
    public FieldAppendListener(String fieldName, String defaultValue) {
        this.TARGET_FIELD = DSL.field(name(fieldName), String.class);
        DEFAULT_VALUES.put(fieldName, ThreadLocal.withInitial(() -> val(defaultValue)));
    }

    /**
     * 设置指定字段的当前值
     *
     * @param name
     * @param value
     * @return
     */
    public static String setFieldValue(String name, String value) {
        ThreadLocal<Param<String>> tl = DEFAULT_VALUES.get(name);
        Param<String> pre = tl.get();
        tl.set(val(value));
        if (pre != null) {
            return pre.getValue();
        }
        return null;
    }


    /**
     * 获取当前字段的当前值
     *
     * @return
     */
    private Param<String> targetValue() {
        ThreadLocal<Param<String>> tl = DEFAULT_VALUES.get(TARGET_FIELD.getName());
        return tl.get();
    }

    @Override
    public void renderStart(ExecuteContext ctx) {
        Query query = ctx.query();
        //插入时,自动插入tenant_code
        if (query instanceof InsertQueryImpl) {
            InsertQueryImpl insertQuery = (InsertQueryImpl) query;
            Table table = insertQuery.table();
            Field<String> field = table.field(TARGET_FIELD);
            FieldMapsForInsert insertMaps = insertQuery.getInsertMaps();
            //适配匹配插入的场景
            insertMaps.values.put(field, createFieldValues(insertMaps.rows));
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
            updateQuery.addConditions(table.field(TARGET_FIELD).eq(targetValue()));
        }

        //查询时, 增加tenant_code匹配
        if (query instanceof SelectQueryImpl) {
            SelectQueryImpl selectQuery = (SelectQueryImpl) query;
            TableList tables = selectQuery.getFrom();
            for (Table<?> table : tables.wrapped()) {
                Field<String> field = table.field(TARGET_FIELD);
                if (field != null) {
                    table.field(TARGET_FIELD).eq(targetValue());
                    selectQuery.addConditions(table.field(TARGET_FIELD).eq(targetValue()));
                }
            }
        }
        if (query instanceof DeleteQueryImpl) {
            DeleteQueryImpl deleteQuery = (DeleteQueryImpl) query;
            Table<?> table = deleteQuery.table();
            Field<String> field = table.field(TARGET_FIELD);
            if (field != null) {
                deleteQuery.addConditions(table.field(TARGET_FIELD).eq(targetValue()));
            }
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
            rows.add(targetValue());
        }
        return rows;
    }

}