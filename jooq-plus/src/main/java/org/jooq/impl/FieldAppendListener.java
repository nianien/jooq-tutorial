package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.val;

@Slf4j
public class FieldAppendListener extends DefaultExecuteListener {


    /**
     * 需要追加的字段
     */
    private Map<String, Field<String>> TARGET_FIELDS = new HashMap<>();
    private static final Map<String, ThreadLocal<Param<String>>> DEFAULT_VALUES = new HashMap<>();

    /**
     * 需要追加的字段和默认值
     *
     * @param fieldAndDefaultValues
     */
    public FieldAppendListener(String[]... fieldAndDefaultValues) {
        for (String[] fieldAndDefaultValue : fieldAndDefaultValues) {
            String fieldName = fieldAndDefaultValue[0];
            String defaultValue = fieldAndDefaultValue[1];
            TARGET_FIELDS.put(fieldName, DSL.field(fieldName, String.class));
            DEFAULT_VALUES.put(fieldName, ThreadLocal.withInitial(() -> val(defaultValue)));
        }
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

    @Override
    public void renderStart(ExecuteContext ctx) {
        try {
            Query query = ctx.query();
            //插入时,自动插入tenant_code
            if (query instanceof InsertQueryImpl) {
                InsertQueryImpl insertQuery = (InsertQueryImpl) query;
                Table table = insertQuery.table();
                TARGET_FIELDS.forEach((k, v) -> {
                    Field<String> field = table.field(v);
                    if (field != null) {
                        FieldMapsForInsert insertMaps = insertQuery.getInsertMaps();
                        //适配匹配插入的场景
                        insertMaps.values.put(field, createFieldValues(field, insertMaps.rows));
                    }
                });
            }
            //更新时, 禁止tenant_code更新,增加tenant_code匹配
            if (query instanceof UpdateQueryImpl) {
                UpdateQueryImpl updateQuery = (UpdateQueryImpl) query;
                FieldMapForUpdate values = updateQuery.getValues();
                Table<?> table = updateQuery.table();
                TARGET_FIELDS.forEach((k, v) -> {
                    Field<String> field = table.field(v);
                    if (field != null) {
                        //禁止手动更新
                        values.remove(field);
                    }
                    updateQuery.addConditions(field.eq(targetValue(field)));
                });
            }

            //查询时, 增加tenant_code匹配
            if (query instanceof SelectQueryImpl) {
                handle((SelectQueryImpl) query);
            }
            if (query instanceof DeleteQueryImpl) {
                DeleteQueryImpl deleteQuery = (DeleteQueryImpl) query;
                Table<?> table = deleteQuery.table();
                TARGET_FIELDS.forEach((k, v) -> {
                    Field<String> field = table.field(v);
                    if (field != null) {
                        deleteQuery.addConditions(field.eq(targetValue(field)));
                    }
                });
            }
        } catch (Exception e) {
            //ignore
        }
    }


    private void handle(SelectQueryImpl selectQuery) {
        TableList tables = selectQuery.getFrom();
        handle(selectQuery.getWhere().getWhere());
        for (Table<?> table : tables.wrapped()) {
            List<Table> targetTables = new ArrayList<>();
            //如果是join表,则需要分别匹配
            if (table instanceof JoinTable) {
                JoinTable jt = (JoinTable) table;
                targetTables.add(jt.lhs);
                targetTables.add(jt.rhs);
            } else {
                targetTables.add(table);
            }
            for (Table t : targetTables) {
                TARGET_FIELDS.forEach((k, v) -> {
                    Field<String> field = t.field(v);
                    if (field != null) {
                        selectQuery.addConditions(field.eq(targetValue(field)));

                    }
                });
            }
        }
    }

    private void handle(Condition condition) {
        if (condition instanceof CombinedCondition) {
            CombinedCondition cc = (CombinedCondition) condition;
            for (Condition sc : cc.conditions) {
                handle(sc);
            }
        } else if (condition instanceof CompareCondition) {
            CompareCondition cc = (CompareCondition) condition;
            Field[] fields = new Field[]{cc.field1, cc.field2};
            for (Field field : fields) {
                if (field instanceof ScalarSubquery) {
                    ScalarSubquery ss = (ScalarSubquery) field;
                    if (ss.query instanceof SelectImpl) {
                        SelectImpl query = (SelectImpl) ss.query;
                        Query delegate = query.getDelegate();
                        if (delegate instanceof SelectQueryImpl) {
                            handle((SelectQueryImpl) delegate);
                        }
                    }
                }
            }
        }
    }


    /**
     * 获取当前字段的当前值
     *
     * @return
     */
    private Param<String> targetValue(Field field) {
        return DEFAULT_VALUES.get(field.getName()).get();
    }


    /**
     * 生成指定字段的默认值
     *
     * @param field 需要生成默认值的字段
     * @param rows  行数
     * @return
     */
    private List createFieldValues(Field field, int rows) {
        List<Field<?>> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            list.add(targetValue(field));
        }
        return list;
    }

}