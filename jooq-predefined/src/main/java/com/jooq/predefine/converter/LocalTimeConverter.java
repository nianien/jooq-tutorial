package com.jooq.predefine.converter;

import org.jooq.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * {@link Date}与{@link LocalTime}互转
 *
 * @since jdk11
 */
public class LocalTimeConverter implements Converter<LocalTime, Date> {
    private static ZoneId zone = ZoneId.systemDefault();

    @Override
    public Date from(LocalTime localTime) {
        return Date.from(LocalDateTime.of(LocalDate.now(), localTime).atZone(zone).toInstant());
    }

    @Override
    public LocalTime to(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), zone).toLocalTime();
    }

    @Override
    public Class<LocalTime> fromType() {
        return LocalTime.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}