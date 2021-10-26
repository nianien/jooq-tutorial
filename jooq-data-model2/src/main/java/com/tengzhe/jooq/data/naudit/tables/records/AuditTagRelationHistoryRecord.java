/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.AuditTagRelationHistory;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class AuditTagRelationHistoryRecord extends UpdatableRecordImpl<AuditTagRelationHistoryRecord> implements Record11<Long, Integer, Long, Integer, String, String, String, String, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.audit_tag_relation_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.tag_type</code>.
     */
    public void setTagType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.tag_type</code>.
     */
    public Integer getTagType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.target_id</code>.
     */
    public void setTargetId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.target_id</code>.
     */
    public Long getTargetId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.target_type</code>.
     */
    public void setTargetType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.target_type</code>.
     */
    public Integer getTargetType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.biz_type</code>.
     */
    public void setBizType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.biz_type</code>.
     */
    public String getBizType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.code</code>.
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.code</code>.
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.score</code>.
     */
    public void setScore(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.score</code>.
     */
    public String getScore() {
        return (String) get(6);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.tag</code>.
     */
    public void setTag(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.tag</code>.
     */
    public String getTag() {
        return (String) get(7);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.creator</code>.
     */
    public void setCreator(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.creator</code>.
     */
    public Long getCreator() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>naudit.audit_tag_relation_history.add_time</code>.
     */
    public void setAddTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_relation_history.add_time</code>.
     */
    public LocalDateTime getAddTime() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Integer, Long, Integer, String, String, String, String, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Integer, Long, Integer, String, String, String, String, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.TAG_TYPE;
    }

    @Override
    public Field<Long> field3() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.TARGET_ID;
    }

    @Override
    public Field<Integer> field4() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.TARGET_TYPE;
    }

    @Override
    public Field<String> field5() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.BIZ_TYPE;
    }

    @Override
    public Field<String> field6() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.CODE;
    }

    @Override
    public Field<String> field7() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.SCORE;
    }

    @Override
    public Field<String> field8() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.TAG;
    }

    @Override
    public Field<Long> field9() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.CREATOR;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY.ADD_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getTagType();
    }

    @Override
    public Long component3() {
        return getTargetId();
    }

    @Override
    public Integer component4() {
        return getTargetType();
    }

    @Override
    public String component5() {
        return getBizType();
    }

    @Override
    public String component6() {
        return getCode();
    }

    @Override
    public String component7() {
        return getScore();
    }

    @Override
    public String component8() {
        return getTag();
    }

    @Override
    public Long component9() {
        return getCreator();
    }

    @Override
    public LocalDateTime component10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component11() {
        return getAddTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getTagType();
    }

    @Override
    public Long value3() {
        return getTargetId();
    }

    @Override
    public Integer value4() {
        return getTargetType();
    }

    @Override
    public String value5() {
        return getBizType();
    }

    @Override
    public String value6() {
        return getCode();
    }

    @Override
    public String value7() {
        return getScore();
    }

    @Override
    public String value8() {
        return getTag();
    }

    @Override
    public Long value9() {
        return getCreator();
    }

    @Override
    public LocalDateTime value10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value11() {
        return getAddTime();
    }

    @Override
    public AuditTagRelationHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value2(Integer value) {
        setTagType(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value3(Long value) {
        setTargetId(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value4(Integer value) {
        setTargetType(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value5(String value) {
        setBizType(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value6(String value) {
        setCode(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value7(String value) {
        setScore(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value8(String value) {
        setTag(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value9(Long value) {
        setCreator(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value10(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord value11(LocalDateTime value) {
        setAddTime(value);
        return this;
    }

    @Override
    public AuditTagRelationHistoryRecord values(Long value1, Integer value2, Long value3, Integer value4, String value5, String value6, String value7, String value8, Long value9, LocalDateTime value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditTagRelationHistoryRecord
     */
    public AuditTagRelationHistoryRecord() {
        super(AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY);
    }

    /**
     * Create a detached, initialised AuditTagRelationHistoryRecord
     */
    public AuditTagRelationHistoryRecord(Long id, Integer tagType, Long targetId, Integer targetType, String bizType, String code, String score, String tag, Long creator, LocalDateTime createTime, LocalDateTime addTime) {
        super(AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY);

        setId(id);
        setTagType(tagType);
        setTargetId(targetId);
        setTargetType(targetType);
        setBizType(bizType);
        setCode(code);
        setScore(score);
        setTag(tag);
        setCreator(creator);
        setCreateTime(createTime);
        setAddTime(addTime);
    }

    /**
     * Create a detached, initialised AuditTagRelationHistoryRecord
     */
    public AuditTagRelationHistoryRecord(com.tengzhe.jooq.data.naudit.tables.pojos.AuditTagRelationHistory value) {
        super(AuditTagRelationHistory.AUDIT_TAG_RELATION_HISTORY);

        if (value != null) {
            setId(value.getId());
            setTagType(value.getTagType());
            setTargetId(value.getTargetId());
            setTargetType(value.getTargetType());
            setBizType(value.getBizType());
            setCode(value.getCode());
            setScore(value.getScore());
            setTag(value.getTag());
            setCreator(value.getCreator());
            setCreateTime(value.getCreateTime());
            setAddTime(value.getAddTime());
        }
    }
}
