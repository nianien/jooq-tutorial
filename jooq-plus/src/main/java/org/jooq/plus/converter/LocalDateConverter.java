package org.jooq.plus.converter;

import org.jooq.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * {@link Date}与{@link LocalDate}互转
 * @since jdk11
 */
public class LocalDateConverter implements Converter<LocalDate, Date> {
    private static ZoneId zone = ZoneId.systemDefault();

    @Override
    public Date from(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(zone).toInstant());
    }

    @Override
    public LocalDate to(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), zone).toLocalDate();
    }

    @Override
    public Class<LocalDate> fromType() {
        return LocalDate.class;
    }

    @Override
    public Class<Date> toType() {
        return Date.class;
    }
}