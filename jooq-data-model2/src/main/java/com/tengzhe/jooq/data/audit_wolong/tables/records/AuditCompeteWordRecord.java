/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.records;


import com.tengzhe.jooq.data.audit_wolong.tables.AuditCompeteWord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class AuditCompeteWordRecord extends UpdatableRecordImpl<AuditCompeteWordRecord> implements Record13<Long, Long, String, Integer, String, LocalDateTime, LocalDateTime, String, Integer, Long, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_wolong.audit_compete_word.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.operatorid</code>.
     */
    public void setOperatorid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.operatorid</code>.
     */
    public Long getOperatorid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.keyword</code>.
     */
    public void setKeyword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.keyword</code>.
     */
    public String getKeyword() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_compete_word.creative_confine_type</code>.
     */
    public void setCreativeConfineType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_compete_word.creative_confine_type</code>.
     */
    public Integer getCreativeConfineType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.remark</code>.
     */
    public void setRemark(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.remark</code>.
     */
    public String getRemark() {
        return (String) get(4);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.indus_ids</code>.
     */
    public void setIndusIds(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.indus_ids</code>.
     */
    public String getIndusIds() {
        return (String) get(7);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.status</code>.
     */
    public void setStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.ref_id</code>.
     */
    public void setRefId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.ref_id</code>.
     */
    public Long getRefId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.city_hash</code>.
     */
    public void setCityHash(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.city_hash</code>.
     */
    public Long getCityHash() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.effective_time</code>.
     */
    public void setEffectiveTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.effective_time</code>.
     */
    public LocalDateTime getEffectiveTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>audit_wolong.audit_compete_word.ineffective_time</code>.
     */
    public void setIneffectiveTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_compete_word.ineffective_time</code>.
     */
    public LocalDateTime getIneffectiveTime() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, Integer, String, LocalDateTime, LocalDateTime, String, Integer, Long, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, String, Integer, String, LocalDateTime, LocalDateTime, String, Integer, Long, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.OPERATORID;
    }

    @Override
    public Field<String> field3() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.KEYWORD;
    }

    @Override
    public Field<Integer> field4() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.CREATIVE_CONFINE_TYPE;
    }

    @Override
    public Field<String> field5() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.REMARK;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.MODIFY_TIME;
    }

    @Override
    public Field<String> field8() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.INDUS_IDS;
    }

    @Override
    public Field<Integer> field9() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.STATUS;
    }

    @Override
    public Field<Long> field10() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.REF_ID;
    }

    @Override
    public Field<Long> field11() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.CITY_HASH;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.EFFECTIVE_TIME;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return AuditCompeteWord.AUDIT_COMPETE_WORD.INEFFECTIVE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getOperatorid();
    }

    @Override
    public String component3() {
        return getKeyword();
    }

    @Override
    public Integer component4() {
        return getCreativeConfineType();
    }

    @Override
    public String component5() {
        return getRemark();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component7() {
        return getModifyTime();
    }

    @Override
    public String component8() {
        return getIndusIds();
    }

    @Override
    public Integer component9() {
        return getStatus();
    }

    @Override
    public Long component10() {
        return getRefId();
    }

    @Override
    public Long component11() {
        return getCityHash();
    }

    @Override
    public LocalDateTime component12() {
        return getEffectiveTime();
    }

    @Override
    public LocalDateTime component13() {
        return getIneffectiveTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getOperatorid();
    }

    @Override
    public String value3() {
        return getKeyword();
    }

    @Override
    public Integer value4() {
        return getCreativeConfineType();
    }

    @Override
    public String value5() {
        return getRemark();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value7() {
        return getModifyTime();
    }

    @Override
    public String value8() {
        return getIndusIds();
    }

    @Override
    public Integer value9() {
        return getStatus();
    }

    @Override
    public Long value10() {
        return getRefId();
    }

    @Override
    public Long value11() {
        return getCityHash();
    }

    @Override
    public LocalDateTime value12() {
        return getEffectiveTime();
    }

    @Override
    public LocalDateTime value13() {
        return getIneffectiveTime();
    }

    @Override
    public AuditCompeteWordRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value2(Long value) {
        setOperatorid(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value3(String value) {
        setKeyword(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value4(Integer value) {
        setCreativeConfineType(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value5(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value7(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value8(String value) {
        setIndusIds(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value10(Long value) {
        setRefId(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value11(Long value) {
        setCityHash(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value12(LocalDateTime value) {
        setEffectiveTime(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord value13(LocalDateTime value) {
        setIneffectiveTime(value);
        return this;
    }

    @Override
    public AuditCompeteWordRecord values(Long value1, Long value2, String value3, Integer value4, String value5, LocalDateTime value6, LocalDateTime value7, String value8, Integer value9, Long value10, Long value11, LocalDateTime value12, LocalDateTime value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditCompeteWordRecord
     */
    public AuditCompeteWordRecord() {
        super(AuditCompeteWord.AUDIT_COMPETE_WORD);
    }

    /**
     * Create a detached, initialised AuditCompeteWordRecord
     */
    public AuditCompeteWordRecord(Long id, Long operatorid, String keyword, Integer creativeConfineType, String remark, LocalDateTime createTime, LocalDateTime modifyTime, String indusIds, Integer status, Long refId, Long cityHash, LocalDateTime effectiveTime, LocalDateTime ineffectiveTime) {
        super(AuditCompeteWord.AUDIT_COMPETE_WORD);

        setId(id);
        setOperatorid(operatorid);
        setKeyword(keyword);
        setCreativeConfineType(creativeConfineType);
        setRemark(remark);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setIndusIds(indusIds);
        setStatus(status);
        setRefId(refId);
        setCityHash(cityHash);
        setEffectiveTime(effectiveTime);
        setIneffectiveTime(ineffectiveTime);
    }

    /**
     * Create a detached, initialised AuditCompeteWordRecord
     */
    public AuditCompeteWordRecord(com.tengzhe.jooq.data.audit_wolong.tables.pojos.AuditCompeteWord value) {
        super(AuditCompeteWord.AUDIT_COMPETE_WORD);

        if (value != null) {
            setId(value.getId());
            setOperatorid(value.getOperatorid());
            setKeyword(value.getKeyword());
            setCreativeConfineType(value.getCreativeConfineType());
            setRemark(value.getRemark());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
            setIndusIds(value.getIndusIds());
            setStatus(value.getStatus());
            setRefId(value.getRefId());
            setCityHash(value.getCityHash());
            setEffectiveTime(value.getEffectiveTime());
            setIneffectiveTime(value.getIneffectiveTime());
        }
    }
}