package org.jooq.x.converter;

import org.jooq.Converter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * {@link Date}与{@link LocalDateTime}互转
 * @since jdk11
 */
public class LocalDateTimeConverter implements Converter<LocalDateTime, Date> {
    private static ZoneId zone = ZoneId.systemDefault();

    @Override
    public Date from(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(zone).toInstant());
    }

    @Override
    public LocalDateTime to(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), zone);
    }

    @Override
    public Class<LocalDateTime> fromType() {
        return LocalDateTime.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}