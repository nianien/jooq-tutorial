package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.*;

import java.util.*;

import static org.jooq.impl.DSL.val;

/**
 * 动态改写SQL，自动插入指定字段或追加字段匹配条件，支持多个字段<p/>
 * 可用于租户隔离或环境隔离等场景，能够自动根据上下文对SQL进行改写，保证数据安全性和隔离性
 * <p/>
 * 针对insert/update语句，自动追加或覆盖指定字段值，支持嵌套查询：如insert...select，update...where<p/>
 * 针对select/delete语句，自动追加或覆盖匹配条件，支持union/join/subquery等复杂场景
 */
@Slf4j
public class FieldCompleteListener extends DefaultVisitListener {

    /**
     * 避免重复处理，使用WeakHashMap,在SQL处理完被移除
     */
    private Map<VisitContext, Map<Integer, Boolean>> visitedMap = Collections.synchronizedMap(new WeakHashMap());
    /**
     * 需要自动补齐的字段
     */
    private Map<String, Field<String>> AUTO_FIELDS = new HashMap<>();
    private static final Map<String, ThreadLocal<Param<String>>> DEFAULT_VALUES = new HashMap<>();

    /**
     * 需要追加的字段和默认值
     *
     * @param fieldAndDefaultValues
     */
    public FieldCompleteListener(String[]... fieldAndDefaultValues) {
        for (String[] fieldAndDefaultValue : fieldAndDefaultValues) {
            String fieldName = fieldAndDefaultValue[0];
            String defaultValue = fieldAndDefaultValue[1];
            AUTO_FIELDS.put(fieldName, DSL.field(fieldName, String.class));
            DEFAULT_VALUES.put(fieldName, ThreadLocal.withInitial(() -> val(defaultValue)));
        }
    }

    @Override
    public void visitStart(VisitContext ctx) {
        QueryPart query = ctx.queryPart();
        if (query instanceof InsertQueryImpl
                || query instanceof UpdateQueryImpl
                || query instanceof DeleteQueryImpl
                || query instanceof SelectQueryImpl) {
            try {
                //在打印日志时会重复访问VisitContext,避免重复改写SQL
                if (visitedMap.computeIfAbsent(ctx, (k) -> new HashMap<>()).putIfAbsent(System.identityHashCode(query), true) == null) {
                    rewriteQuery(query, AUTO_FIELDS);
                }
            } catch (Exception e) {
                //ignore
            }
        }
    }


    /**
     * 重写SQL
     *
     * @param query
     */
    private void rewriteQuery(QueryPart query, Map<String, Field<String>> autoFields) {
        log.info("==>queryPart: {}@{}", query.getClass().getName(), Integer.toHexString(System.identityHashCode(query)));
        //插入时,自动插入tenant_code
        if (query instanceof InsertQueryImpl) {
            InsertQueryImpl insertQuery = (InsertQueryImpl) query;
            Table table = insertQuery.table();
            autoFields.forEach((k, v) -> {
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
            autoFields.forEach((k, v) -> {
                Field<String> field = table.field(v);
                if (field != null) {
                    //禁止手动更新
                    values.remove(field);
                }
                updateQuery.addConditions(field.eq(targetValue(field)));
            });
        }

        if (query instanceof DeleteQueryImpl) {
            DeleteQueryImpl deleteQuery = (DeleteQueryImpl) query;
            Table<?> table = deleteQuery.table();
            autoFields.forEach((k, v) -> {
                Field<String> field = table.field(v);
                if (field != null) {
                    deleteQuery.addConditions(field.eq(targetValue(field)));
                }
            });
        }
        //查询时, 增加tenant_code匹配
        if (query instanceof SelectQueryImpl) {
            SelectQueryImpl selectQuery = (SelectQueryImpl) query;
            TableList tables = selectQuery.getFrom();
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
                    autoFields.forEach((k, v) -> {
                        Field<String> field = t.field(v);
                        if (field != null) {
                            log.info("add condition to table[{}]:{} ", t, field.eq(targetValue(field)));
                            selectQuery.addConditions(field.eq(targetValue(field)));
                        }
                    });
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

}