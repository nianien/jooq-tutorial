/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.AuditComment;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class AuditCommentRecord extends UpdatableRecordImpl<AuditCommentRecord> implements Record12<Long, Integer, Long, Integer, String, String, LocalDateTime, Integer, Long, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.audit_comment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.audit_comment.comment_type</code>.
     */
    public void setCommentType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.comment_type</code>.
     */
    public Integer getCommentType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>naudit.audit_comment.target_id</code>.
     */
    public void setTargetId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.target_id</code>.
     */
    public Long getTargetId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>naudit.audit_comment.target_type</code>.
     */
    public void setTargetType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.target_type</code>.
     */
    public Integer getTargetType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>naudit.audit_comment.biz_type</code>.
     */
    public void setBizType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.biz_type</code>.
     */
    public String getBizType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>naudit.audit_comment.content</code>.
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.content</code>.
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>naudit.audit_comment.expire_time</code>.
     */
    public void setExpireTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.expire_time</code>.
     */
    public LocalDateTime getExpireTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>naudit.audit_comment.enabled</code>.
     */
    public void setEnabled(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.enabled</code>.
     */
    public Integer getEnabled() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>naudit.audit_comment.creator</code>.
     */
    public void setCreator(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.creator</code>.
     */
    public Long getCreator() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>naudit.audit_comment.operator</code>.
     */
    public void setOperator(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.operator</code>.
     */
    public Long getOperator() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>naudit.audit_comment.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>naudit.audit_comment.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>naudit.audit_comment.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Integer, Long, Integer, String, String, LocalDateTime, Integer, Long, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Integer, Long, Integer, String, String, LocalDateTime, Integer, Long, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditComment.AUDIT_COMMENT.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditComment.AUDIT_COMMENT.COMMENT_TYPE;
    }

    @Override
    public Field<Long> field3() {
        return AuditComment.AUDIT_COMMENT.TARGET_ID;
    }

    @Override
    public Field<Integer> field4() {
        return AuditComment.AUDIT_COMMENT.TARGET_TYPE;
    }

    @Override
    public Field<String> field5() {
        return AuditComment.AUDIT_COMMENT.BIZ_TYPE;
    }

    @Override
    public Field<String> field6() {
        return AuditComment.AUDIT_COMMENT.CONTENT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AuditComment.AUDIT_COMMENT.EXPIRE_TIME;
    }

    @Override
    public Field<Integer> field8() {
        return AuditComment.AUDIT_COMMENT.ENABLED;
    }

    @Override
    public Field<Long> field9() {
        return AuditComment.AUDIT_COMMENT.CREATOR;
    }

    @Override
    public Field<Long> field10() {
        return AuditComment.AUDIT_COMMENT.OPERATOR;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditComment.AUDIT_COMMENT.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return AuditComment.AUDIT_COMMENT.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCommentType();
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
        return getContent();
    }

    @Override
    public LocalDateTime component7() {
        return getExpireTime();
    }

    @Override
    public Integer component8() {
        return getEnabled();
    }

    @Override
    public Long component9() {
        return getCreator();
    }

    @Override
    public Long component10() {
        return getOperator();
    }

    @Override
    public LocalDateTime component11() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component12() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCommentType();
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
        return getContent();
    }

    @Override
    public LocalDateTime value7() {
        return getExpireTime();
    }

    @Override
    public Integer value8() {
        return getEnabled();
    }

    @Override
    public Long value9() {
        return getCreator();
    }

    @Override
    public Long value10() {
        return getOperator();
    }

    @Override
    public LocalDateTime value11() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value12() {
        return getModifyTime();
    }

    @Override
    public AuditCommentRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditCommentRecord value2(Integer value) {
        setCommentType(value);
        return this;
    }

    @Override
    public AuditCommentRecord value3(Long value) {
        setTargetId(value);
        return this;
    }

    @Override
    public AuditCommentRecord value4(Integer value) {
        setTargetType(value);
        return this;
    }

    @Override
    public AuditCommentRecord value5(String value) {
        setBizType(value);
        return this;
    }

    @Override
    public AuditCommentRecord value6(String value) {
        setContent(value);
        return this;
    }

    @Override
    public AuditCommentRecord value7(LocalDateTime value) {
        setExpireTime(value);
        return this;
    }

    @Override
    public AuditCommentRecord value8(Integer value) {
        setEnabled(value);
        return this;
    }

    @Override
    public AuditCommentRecord value9(Long value) {
        setCreator(value);
        return this;
    }

    @Override
    public AuditCommentRecord value10(Long value) {
        setOperator(value);
        return this;
    }

    @Override
    public AuditCommentRecord value11(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditCommentRecord value12(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditCommentRecord values(Long value1, Integer value2, Long value3, Integer value4, String value5, String value6, LocalDateTime value7, Integer value8, Long value9, Long value10, LocalDateTime value11, LocalDateTime value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditCommentRecord
     */
    public AuditCommentRecord() {
        super(AuditComment.AUDIT_COMMENT);
    }

    /**
     * Create a detached, initialised AuditCommentRecord
     */
    public AuditCommentRecord(Long id, Integer commentType, Long targetId, Integer targetType, String bizType, String content, LocalDateTime expireTime, Integer enabled, Long creator, Long operator, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditComment.AUDIT_COMMENT);

        setId(id);
        setCommentType(commentType);
        setTargetId(targetId);
        setTargetType(targetType);
        setBizType(bizType);
        setContent(content);
        setExpireTime(expireTime);
        setEnabled(enabled);
        setCreator(creator);
        setOperator(operator);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditCommentRecord
     */
    public AuditCommentRecord(com.tengzhe.jooq.data.naudit.tables.pojos.AuditComment value) {
        super(AuditComment.AUDIT_COMMENT);

        if (value != null) {
            setId(value.getId());
            setCommentType(value.getCommentType());
            setTargetId(value.getTargetId());
            setTargetType(value.getTargetType());
            setBizType(value.getBizType());
            setContent(value.getContent());
            setExpireTime(value.getExpireTime());
            setEnabled(value.getEnabled());
            setCreator(value.getCreator());
            setOperator(value.getOperator());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
