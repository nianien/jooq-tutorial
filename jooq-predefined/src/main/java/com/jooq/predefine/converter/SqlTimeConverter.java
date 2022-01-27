package com.jooq.predefine.converter;

import org.jooq.Converter;

import java.sql.Time;
import java.util.Date;

/**
 * {@link Date}与{@link Time}互转
 * @version jdk8
 */
public class SqlTimeConverter implements Converter<Time, Date> {

    @Override
    public Date from(Time timestamp) {
        return timestamp;
    }

    @Override
    public Time to(Date date) {
        return date == null ? null : new Time(date.getTime());
    }

    @Override
    public Class<Time> fromType() {
        return Time.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}