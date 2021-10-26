/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.records;


import com.tengzhe.jooq.data.audit_wolong.tables.AuditExcludeModelWord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class AuditExcludeModelWordRecord extends UpdatableRecordImpl<AuditExcludeModelWordRecord> implements Record7<Long, String, Integer, LocalDateTime, LocalDateTime, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_wolong.audit_exclude_model_word.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_model_word.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_model_word.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_model_word.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_exclude_model_word.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_exclude_model_word.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_exclude_model_word.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_exclude_model_word.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_exclude_model_word.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_exclude_model_word.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>audit_wolong.audit_exclude_model_word.risk_type</code>.
     */
    public void setRiskType(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_exclude_model_word.risk_type</code>.
     */
    public Long getRiskType() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_exclude_model_word.effect_end_time</code>.
     */
    public void setEffectEndTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_exclude_model_word.effect_end_time</code>.
     */
    public LocalDateTime getEffectEndTime() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Integer, LocalDateTime, LocalDateTime, Long, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Integer, LocalDateTime, LocalDateTime, Long, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.ID;
    }

    @Override
    public Field<String> field2() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.WORD;
    }

    @Override
    public Field<Integer> field3() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.LOGIC_STATE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.MODIFY_TIME;
    }

    @Override
    public Field<Long> field6() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.RISK_TYPE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD.EFFECT_END_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getWord();
    }

    @Override
    public Integer component3() {
        return getLogicState();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component5() {
        return getModifyTime();
    }

    @Override
    public Long component6() {
        return getRiskType();
    }

    @Override
    public LocalDateTime component7() {
        return getEffectEndTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getWord();
    }

    @Override
    public Integer value3() {
        return getLogicState();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value5() {
        return getModifyTime();
    }

    @Override
    public Long value6() {
        return getRiskType();
    }

    @Override
    public LocalDateTime value7() {
        return getEffectEndTime();
    }

    @Override
    public AuditExcludeModelWordRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value2(String value) {
        setWord(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value3(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value5(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value6(Long value) {
        setRiskType(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord value7(LocalDateTime value) {
        setEffectEndTime(value);
        return this;
    }

    @Override
    public AuditExcludeModelWordRecord values(Long value1, String value2, Integer value3, LocalDateTime value4, LocalDateTime value5, Long value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditExcludeModelWordRecord
     */
    public AuditExcludeModelWordRecord() {
        super(AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD);
    }

    /**
     * Create a detached, initialised AuditExcludeModelWordRecord
     */
    public AuditExcludeModelWordRecord(Long id, String word, Integer logicState, LocalDateTime createTime, LocalDateTime modifyTime, Long riskType, LocalDateTime effectEndTime) {
        super(AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD);

        setId(id);
        setWord(word);
        setLogicState(logicState);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setRiskType(riskType);
        setEffectEndTime(effectEndTime);
    }

    /**
     * Create a detached, initialised AuditExcludeModelWordRecord
     */
    public AuditExcludeModelWordRecord(com.tengzhe.jooq.data.audit_wolong.tables.pojos.AuditExcludeModelWord value) {
        super(AuditExcludeModelWord.AUDIT_EXCLUDE_MODEL_WORD);

        if (value != null) {
            setId(value.getId());
            setWord(value.getWord());
            setLogicState(value.getLogicState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
            setRiskType(value.getRiskType());
            setEffectEndTime(value.getEffectEndTime());
        }
    }
}
