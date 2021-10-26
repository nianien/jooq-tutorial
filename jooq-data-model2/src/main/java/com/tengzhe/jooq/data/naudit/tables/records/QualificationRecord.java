/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.Qualification;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QualificationRecord extends UpdatableRecordImpl<QualificationRecord> implements Record9<Long, Integer, Integer, String, String, String, LocalDate, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.qualification.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.qualification.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.qualification.source</code>.
     */
    public void setSource(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.qualification.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>naudit.qualification.qual_type</code>.
     */
    public void setQualType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.qualification.qual_type</code>.
     */
    public Integer getQualType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>naudit.qualification.qual_name</code>.
     */
    public void setQualName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.qualification.qual_name</code>.
     */
    public String getQualName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>naudit.qualification.qual_url</code>.
     */
    public void setQualUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.qualification.qual_url</code>.
     */
    public String getQualUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>naudit.qualification.qual_md5</code>.
     */
    public void setQualMd5(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.qualification.qual_md5</code>.
     */
    public String getQualMd5() {
        return (String) get(5);
    }

    /**
     * Setter for <code>naudit.qualification.expired_date</code>.
     */
    public void setExpiredDate(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.qualification.expired_date</code>.
     */
    public LocalDate getExpiredDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>naudit.qualification.version</code>.
     */
    public void setVersion(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.qualification.version</code>.
     */
    public Long getVersion() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>naudit.qualification.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.qualification.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Integer, Integer, String, String, String, LocalDate, Long, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Integer, Integer, String, String, String, LocalDate, Long, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Qualification.QUALIFICATION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Qualification.QUALIFICATION.SOURCE;
    }

    @Override
    public Field<Integer> field3() {
        return Qualification.QUALIFICATION.QUAL_TYPE;
    }

    @Override
    public Field<String> field4() {
        return Qualification.QUALIFICATION.QUAL_NAME;
    }

    @Override
    public Field<String> field5() {
        return Qualification.QUALIFICATION.QUAL_URL;
    }

    @Override
    public Field<String> field6() {
        return Qualification.QUALIFICATION.QUAL_MD5;
    }

    @Override
    public Field<LocalDate> field7() {
        return Qualification.QUALIFICATION.EXPIRED_DATE;
    }

    @Override
    public Field<Long> field8() {
        return Qualification.QUALIFICATION.VERSION;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Qualification.QUALIFICATION.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getSource();
    }

    @Override
    public Integer component3() {
        return getQualType();
    }

    @Override
    public String component4() {
        return getQualName();
    }

    @Override
    public String component5() {
        return getQualUrl();
    }

    @Override
    public String component6() {
        return getQualMd5();
    }

    @Override
    public LocalDate component7() {
        return getExpiredDate();
    }

    @Override
    public Long component8() {
        return getVersion();
    }

    @Override
    public LocalDateTime component9() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getSource();
    }

    @Override
    public Integer value3() {
        return getQualType();
    }

    @Override
    public String value4() {
        return getQualName();
    }

    @Override
    public String value5() {
        return getQualUrl();
    }

    @Override
    public String value6() {
        return getQualMd5();
    }

    @Override
    public LocalDate value7() {
        return getExpiredDate();
    }

    @Override
    public Long value8() {
        return getVersion();
    }

    @Override
    public LocalDateTime value9() {
        return getCreateTime();
    }

    @Override
    public QualificationRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public QualificationRecord value2(Integer value) {
        setSource(value);
        return this;
    }

    @Override
    public QualificationRecord value3(Integer value) {
        setQualType(value);
        return this;
    }

    @Override
    public QualificationRecord value4(String value) {
        setQualName(value);
        return this;
    }

    @Override
    public QualificationRecord value5(String value) {
        setQualUrl(value);
        return this;
    }

    @Override
    public QualificationRecord value6(String value) {
        setQualMd5(value);
        return this;
    }

    @Override
    public QualificationRecord value7(LocalDate value) {
        setExpiredDate(value);
        return this;
    }

    @Override
    public QualificationRecord value8(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public QualificationRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public QualificationRecord values(Long value1, Integer value2, Integer value3, String value4, String value5, String value6, LocalDate value7, Long value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QualificationRecord
     */
    public QualificationRecord() {
        super(Qualification.QUALIFICATION);
    }

    /**
     * Create a detached, initialised QualificationRecord
     */
    public QualificationRecord(Long id, Integer source, Integer qualType, String qualName, String qualUrl, String qualMd5, LocalDate expiredDate, Long version, LocalDateTime createTime) {
        super(Qualification.QUALIFICATION);

        setId(id);
        setSource(source);
        setQualType(qualType);
        setQualName(qualName);
        setQualUrl(qualUrl);
        setQualMd5(qualMd5);
        setExpiredDate(expiredDate);
        setVersion(version);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised QualificationRecord
     */
    public QualificationRecord(com.tengzhe.jooq.data.naudit.tables.pojos.Qualification value) {
        super(Qualification.QUALIFICATION);

        if (value != null) {
            setId(value.getId());
            setSource(value.getSource());
            setQualType(value.getQualType());
            setQualName(value.getQualName());
            setQualUrl(value.getQualUrl());
            setQualMd5(value.getQualMd5());
            setExpiredDate(value.getExpiredDate());
            setVersion(value.getVersion());
            setCreateTime(value.getCreateTime());
        }
    }
}