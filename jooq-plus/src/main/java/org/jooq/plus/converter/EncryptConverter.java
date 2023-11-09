package org.jooq.plus.converter;

import org.jooq.plus.encryptor.Encryptor;
import org.jooq.plus.encryptor.EncryptorProvider;
import org.jooq.Converter;

/**
 * 自定义转换逻辑, 可用于加密脱敏等安全需求
 * Created on 2022/1/24
 *
 * @author liyifei
 */
public class EncryptConverter implements Converter<String, String> {

    private Encryptor encryptor = EncryptorProvider.get();

    @Override
    public String from(String databaseObject) {
        return encryptor.decrypt(databaseObject);
    }

    @Override
    public String to(String userObject) {
        return encryptor.encrypt(userObject);
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
