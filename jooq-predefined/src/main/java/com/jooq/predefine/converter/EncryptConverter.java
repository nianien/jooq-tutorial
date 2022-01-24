package com.jooq.predefine.converter;

import org.jooq.Converter;

import java.util.Base64;

/**
 * 自定义转换逻辑, 可用于加密脱敏等安全需求
 * Created on 2022/1/24
 *
 * @author liyifei
 */
public class EncryptConverter implements Converter<String, String> {
    @Override
    public String from(String databaseObject) {
        return databaseObject == null ? null : new String(Base64.getDecoder().decode(databaseObject));
    }

    @Override
    public String to(String userObject) {
        return userObject == null ? null : Base64.getEncoder().encodeToString(userObject.getBytes());
    }

    @Override
    public Class<String> fromType() {
        return String.class;
    }

    @Override
    public Class<String> toType() {
        return String.class;
    }


}
