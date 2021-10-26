/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.records;


import com.tengzhe.jooq.data.audit_dict.tables.SyncWordRule;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class SyncWordRuleRecord extends UpdatableRecordImpl<SyncWordRuleRecord> implements Record9<Long, Integer, String, String, String, Integer, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.sync_word_rule.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.sync_type</code>.
     */
    public void setSyncType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.sync_type</code>.
     */
    public Integer getSyncType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.word_type</code>.
     */
    public void setWordType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.word_type</code>.
     */
    public String getWordType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.source_id</code>.
     */
    public void setSourceId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.source_id</code>.
     */
    public String getSourceId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.target_id</code>.
     */
    public void setTargetId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.target_id</code>.
     */
    public String getTargetId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.status</code>.
     */
    public void setStatus(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.operator_id</code>.
     */
    public void setOperatorId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.operator_id</code>.
     */
    public Long getOperatorId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>audit_dict.sync_word_rule.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit_dict.sync_word_rule.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Integer, String, String, String, Integer, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Integer, String, String, String, Integer, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SyncWordRule.SYNC_WORD_RULE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SyncWordRule.SYNC_WORD_RULE.SYNC_TYPE;
    }

    @Override
    public Field<String> field3() {
        return SyncWordRule.SYNC_WORD_RULE.WORD_TYPE;
    }

    @Override
    public Field<String> field4() {
        return SyncWordRule.SYNC_WORD_RULE.SOURCE_ID;
    }

    @Override
    public Field<String> field5() {
        return SyncWordRule.SYNC_WORD_RULE.TARGET_ID;
    }

    @Override
    public Field<Integer> field6() {
        return SyncWordRule.SYNC_WORD_RULE.STATUS;
    }

    @Override
    public Field<Long> field7() {
        return SyncWordRule.SYNC_WORD_RULE.OPERATOR_ID;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return SyncWordRule.SYNC_WORD_RULE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return SyncWordRule.SYNC_WORD_RULE.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getSyncType();
    }

    @Override
    public String component3() {
        return getWordType();
    }

    @Override
    public String component4() {
        return getSourceId();
    }

    @Override
    public String component5() {
        return getTargetId();
    }

    @Override
    public Integer component6() {
        return getStatus();
    }

    @Override
    public Long component7() {
        return getOperatorId();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component9() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getSyncType();
    }

    @Override
    public String value3() {
        return getWordType();
    }

    @Override
    public String value4() {
        return getSourceId();
    }

    @Override
    public String value5() {
        return getTargetId();
    }

    @Override
    public Integer value6() {
        return getStatus();
    }

    @Override
    public Long value7() {
        return getOperatorId();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value9() {
        return getModifyTime();
    }

    @Override
    public SyncWordRuleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value2(Integer value) {
        setSyncType(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value3(String value) {
        setWordType(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value4(String value) {
        setSourceId(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value5(String value) {
        setTargetId(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value6(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value7(Long value) {
        setOperatorId(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public SyncWordRuleRecord values(Long value1, Integer value2, String value3, String value4, String value5, Integer value6, Long value7, LocalDateTime value8, LocalDateTime value9) {
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
     * Create a detached SyncWordRuleRecord
     */
    public SyncWordRuleRecord() {
        super(SyncWordRule.SYNC_WORD_RULE);
    }

    /**
     * Create a detached, initialised SyncWordRuleRecord
     */
    public SyncWordRuleRecord(Long id, Integer syncType, String wordType, String sourceId, String targetId, Integer status, Long operatorId, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(SyncWordRule.SYNC_WORD_RULE);

        setId(id);
        setSyncType(syncType);
        setWordType(wordType);
        setSourceId(sourceId);
        setTargetId(targetId);
        setStatus(status);
        setOperatorId(operatorId);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised SyncWordRuleRecord
     */
    public SyncWordRuleRecord(com.tengzhe.jooq.data.audit_dict.tables.pojos.SyncWordRule value) {
        super(SyncWordRule.SYNC_WORD_RULE);

        if (value != null) {
            setId(value.getId());
            setSyncType(value.getSyncType());
            setWordType(value.getWordType());
            setSourceId(value.getSourceId());
            setTargetId(value.getTargetId());
            setStatus(value.getStatus());
            setOperatorId(value.getOperatorId());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
