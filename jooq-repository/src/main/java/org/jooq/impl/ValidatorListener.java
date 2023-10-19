package org.jooq.impl;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DataType;
import org.jooq.ExecuteContext;
import org.jooq.Field;
import org.jooq.Query;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 基于jooq的数据库执行性能监听器
 *
 * @author xujin.wxj
 */
@Slf4j
public class ValidatorListener extends DefaultExecuteListener {


    @PostConstruct
    public void init() {
    }

    @Override
    public void executeStart(ExecuteContext ctx) {
        Query query = ctx.query();
        if (query instanceof InsertQueryImpl) {
            InsertQueryImpl insertQuery = (InsertQueryImpl) query;
            FieldMapsForInsert insertMaps = insertQuery.getInsertMaps();
            Map<Field<?>, List<Field<?>>> values = insertMaps.values;
            for (Map.Entry<Field<?>, List<Field<?>>> entry : values.entrySet()) {
                Field<?> f = entry.getKey();
                validate(f, entry.getValue());
            }
        }
        //更新时, 禁止tenant_code更新,增加tenant_code匹配
        if (query instanceof UpdateQueryImpl) {
            UpdateQueryImpl updateQuery = (UpdateQueryImpl) query;
            FieldMapForUpdate values = updateQuery.getValues();
            Set<Map.Entry<Field<?>, Field<?>>> entries = values.entrySet();
            for (Map.Entry<Field<?>, Field<?>> entry : entries) {
                Field field = entry.getKey();
                Field<?> value = entry.getValue();
                validate(field, Arrays.asList(value));
            }
        }
    }


    @Override
    public void renderEnd(ExecuteContext ctx) {
        Query query = ctx.query();
        if (query instanceof UpdateQueryImpl) {
            UpdateQueryImpl updateQuery = (UpdateQueryImpl) query;
            if (!updateQuery.hasWhere()) {
                throw new IllegalArgumentException("update without condition is forbidden!!");
            }
        }
        if (query instanceof DeleteQueryImpl) {
            DeleteQueryImpl deleteQuery = (DeleteQueryImpl) query;
            if (!deleteQuery.hasWhere()) {
                throw new IllegalArgumentException("delete without condition is forbidden!!");
            }
        }
    }

    private void validate(Field<?> field, List<Field<?>> values) {
        DataType<?> dataType = field.getDataType();
        if (dataType.hasLength()) {
            int length = dataType.length();
            for (Field<?> f : values) {
                if (f instanceof Val) {
                    Object v = ((Val) f).value;
                    if (field.getType() == String.class && f.toString().length() - 2 > length) {
                        //Value too long for column "TENANT_CODE VARCHAR(8)": "'default_tenant' (14)";
                        throw new IllegalArgumentException("Value too long for column[" + field.getName() + " " + dataType.getCastTypeName() + "]: " + v + "(" + f + ")");
                    }

                }
            }
        }
    }

}
