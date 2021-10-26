/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.WordPackageDetail;

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
public class WordPackageDetailRecord extends UpdatableRecordImpl<WordPackageDetailRecord> implements Record9<Long, Long, Integer, String, Long, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.word_package_detail.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.word_package_detail.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.word_package_detail.package_id</code>.
     */
    public void setPackageId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.word_package_detail.package_id</code>.
     */
    public Long getPackageId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.word_package_detail.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.word_package_detail.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>material.word_package_detail.word</code>.
     */
    public void setWord(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.word_package_detail.word</code>.
     */
    public String getWord() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.word_package_detail.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.word_package_detail.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>material.word_package_detail.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.word_package_detail.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.word_package_detail.reason</code>.
     */
    public void setReason(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.word_package_detail.reason</code>.
     */
    public String getReason() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.word_package_detail.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.word_package_detail.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>material.word_package_detail.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.word_package_detail.modify_time</code>.
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
    public Row9<Long, Long, Integer, String, Long, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Integer, String, Long, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.ID;
    }

    @Override
    public Field<Long> field2() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.PACKAGE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.AUDIT_STATE;
    }

    @Override
    public Field<String> field4() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.WORD;
    }

    @Override
    public Field<Long> field5() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.AUDITOR_ID;
    }

    @Override
    public Field<String> field6() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.REASON_CODE;
    }

    @Override
    public Field<String> field7() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.REASON;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return WordPackageDetail.WORD_PACKAGE_DETAIL.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getPackageId();
    }

    @Override
    public Integer component3() {
        return getAuditState();
    }

    @Override
    public String component4() {
        return getWord();
    }

    @Override
    public Long component5() {
        return getAuditorId();
    }

    @Override
    public String component6() {
        return getReasonCode();
    }

    @Override
    public String component7() {
        return getReason();
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
    public Long value2() {
        return getPackageId();
    }

    @Override
    public Integer value3() {
        return getAuditState();
    }

    @Override
    public String value4() {
        return getWord();
    }

    @Override
    public Long value5() {
        return getAuditorId();
    }

    @Override
    public String value6() {
        return getReasonCode();
    }

    @Override
    public String value7() {
        return getReason();
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
    public WordPackageDetailRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value2(Long value) {
        setPackageId(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value3(Integer value) {
        setAuditState(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value4(String value) {
        setWord(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value5(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value6(String value) {
        setReasonCode(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value7(String value) {
        setReason(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public WordPackageDetailRecord values(Long value1, Long value2, Integer value3, String value4, Long value5, String value6, String value7, LocalDateTime value8, LocalDateTime value9) {
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
     * Create a detached WordPackageDetailRecord
     */
    public WordPackageDetailRecord() {
        super(WordPackageDetail.WORD_PACKAGE_DETAIL);
    }

    /**
     * Create a detached, initialised WordPackageDetailRecord
     */
    public WordPackageDetailRecord(Long id, Long packageId, Integer auditState, String word, Long auditorId, String reasonCode, String reason, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(WordPackageDetail.WORD_PACKAGE_DETAIL);

        setId(id);
        setPackageId(packageId);
        setAuditState(auditState);
        setWord(word);
        setAuditorId(auditorId);
        setReasonCode(reasonCode);
        setReason(reason);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised WordPackageDetailRecord
     */
    public WordPackageDetailRecord(com.tengzhe.jooq.data.material.tables.pojos.WordPackageDetail value) {
        super(WordPackageDetail.WORD_PACKAGE_DETAIL);

        if (value != null) {
            setId(value.getId());
            setPackageId(value.getPackageId());
            setAuditState(value.getAuditState());
            setWord(value.getWord());
            setAuditorId(value.getAuditorId());
            setReasonCode(value.getReasonCode());
            setReason(value.getReason());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
