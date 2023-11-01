package com.cudrania.jooq.converter;

import org.jooq.Converter;

import java.util.Date;

/**
 * {@link Date}与{@link java.sql.Date}互转
 * @version jdk8
 */
public class SqlDateConverter implements Converter<java.sql.Date, Date> {

    @Override
    public Date from(java.sql.Date date) {
        return date;
    }

    @Override
    public java.sql.Date to(Date date) {
        return date == null ? null : new java.sql.Date(date.getTime());
    }

    @Override
    public Class<java.sql.Date> fromType() {
        return java.sql.Date.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}