/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.records;


import com.tengzhe.jooq.data.audit_wolong.tables.AuditExcludeUser;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class AuditExcludeUserRecord extends UpdatableRecordImpl<AuditExcludeUserRecord> implements Record6<Integer, Long, Long, Integer, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.userid</code>.
     */
    public void setUserid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.userid</code>.
     */
    public Long getUserid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.targetid</code>.
     */
    public void setTargetid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.targetid</code>.
     */
    public Long getTargetid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.word_type</code>.
     */
    public void setWordType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.word_type</code>.
     */
    public Integer getWordType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.event_type</code>.
     */
    public void setEventType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.event_type</code>.
     */
    public Integer getEventType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_user.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_user.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Long, Long, Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Long, Long, Integer, Integer, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.USERID;
    }

    @Override
    public Field<Long> field3() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.TARGETID;
    }

    @Override
    public Field<Integer> field4() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.WORD_TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.EVENT_TYPE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return AuditExcludeUser.AUDIT_EXCLUDE_USER.CREATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserid();
    }

    @Override
    public Long component3() {
        return getTargetid();
    }

    @Override
    public Integer component4() {
        return getWordType();
    }

    @Override
    public Integer component5() {
        return getEventType();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserid();
    }

    @Override
    public Long value3() {
        return getTargetid();
    }

    @Override
    public Integer value4() {
        return getWordType();
    }

    @Override
    public Integer value5() {
        return getEventType();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    @Override
    public AuditExcludeUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord value2(Long value) {
        setUserid(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord value3(Long value) {
        setTargetid(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord value4(Integer value) {
        setWordType(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord value5(Integer value) {
        setEventType(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditExcludeUserRecord values(Integer value1, Long value2, Long value3, Integer value4, Integer value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditExcludeUserRecord
     */
    public AuditExcludeUserRecord() {
        super(AuditExcludeUser.AUDIT_EXCLUDE_USER);
    }

    /**
     * Create a detached, initialised AuditExcludeUserRecord
     */
    public AuditExcludeUserRecord(Integer id, Long userid, Long targetid, Integer wordType, Integer eventType, LocalDateTime createTime) {
        super(AuditExcludeUser.AUDIT_EXCLUDE_USER);

        setId(id);
        setUserid(userid);
        setTargetid(targetid);
        setWordType(wordType);
        setEventType(eventType);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditExcludeUserRecord
     */
    public AuditExcludeUserRecord(com.tengzhe.jooq.data.audit_wolong.tables.pojos.AuditExcludeUser value) {
        super(AuditExcludeUser.AUDIT_EXCLUDE_USER);

        if (value != null) {
            setId(value.getId());
            setUserid(value.getUserid());
            setTargetid(value.getTargetid());
            setWordType(value.getWordType());
            setEventType(value.getEventType());
            setCreateTime(value.getCreateTime());
        }
    }
}
