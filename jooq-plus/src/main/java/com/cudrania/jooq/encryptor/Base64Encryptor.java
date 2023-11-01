package com.cudrania.jooq.encryptor;

import java.util.Base64;


/**
 * 基于Base64加密
 * Created on 2022/2/18
 *
 * @author liyifei
 */
public class Base64Encryptor implements Encryptor {

    @Override
    public int order() {
        return Byte.MAX_VALUE;
    }

    @Override
    public String encrypt(String src) {
        return src == null ? null : Base64.getEncoder().encodeToString(src.getBytes());
    }

    @Override
    public String decrypt(String src) {
        try {
            return src == null ? null : new String(Base64.getDecoder().decode(src));
        } catch (IllegalArgumentException e) { //非Base64格式，返回原值。不处理其他类型的异常
            return src;
        }
    }


}
