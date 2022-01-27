package com.jooq.predefine.converter;

import org.jooq.Converter;

import java.sql.Timestamp;
import java.util.Date;

/**
 * {@link Date}与{@link Timestamp}互转
 *
 * @version jdk8
 */
public class SqlTimestampConverter implements Converter<Timestamp, Date> {

    @Override
    public Date from(Timestamp timestamp) {
        return timestamp;
    }

    @Override
    public Timestamp to(Date date) {
        return date == null ? null : new Timestamp(date.getTime());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}