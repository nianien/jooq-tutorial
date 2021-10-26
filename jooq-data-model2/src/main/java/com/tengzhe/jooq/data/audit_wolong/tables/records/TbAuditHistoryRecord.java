/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.records;


import com.tengzhe.jooq.data.audit_wolong.tables.TbAuditHistory;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TbAuditHistoryRecord extends UpdatableRecordImpl<TbAuditHistoryRecord> implements Record10<Long, Long, LocalDateTime, String, Integer, Integer, Integer, Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_wolong.tb_audit_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.auditid</code>.
     */
    public void setAuditid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.auditid</code>.
     */
    public Long getAuditid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.time</code>.
     */
    public void setTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.time</code>.
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.detail</code>.
     */
    public void setDetail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.detail</code>.
     */
    public String getDetail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.event_type</code>.
     */
    public void setEventType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.event_type</code>.
     */
    public Integer getEventType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.level</code>.
     */
    public void setLevel(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.state</code>.
     */
    public void setState(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.state</code>.
     */
    public Integer getState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.targetid</code>.
     */
    public void setTargetid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.targetid</code>.
     */
    public Long getTargetid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>audit_wolong.tb_audit_history.userid</code>.
     */
    public void setUserid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>audit_wolong.tb_audit_history.userid</code>.
     */
    public Long getUserid() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, LocalDateTime, String, Integer, Integer, Integer, Long, String, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, LocalDateTime, String, Integer, Integer, Integer, Long, String, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TbAuditHistory.TB_AUDIT_HISTORY.ID;
    }

    @Override
    public Field<Long> field2() {
        return TbAuditHistory.TB_AUDIT_HISTORY.AUDITID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return TbAuditHistory.TB_AUDIT_HISTORY.TIME;
    }

    @Override
    public Field<String> field4() {
        return TbAuditHistory.TB_AUDIT_HISTORY.DETAIL;
    }

    @Override
    public Field<Integer> field5() {
        return TbAuditHistory.TB_AUDIT_HISTORY.EVENT_TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return TbAuditHistory.TB_AUDIT_HISTORY.LEVEL;
    }

    @Override
    public Field<Integer> field7() {
        return TbAuditHistory.TB_AUDIT_HISTORY.STATE;
    }

    @Override
    public Field<Long> field8() {
        return TbAuditHistory.TB_AUDIT_HISTORY.TARGETID;
    }

    @Override
    public Field<String> field9() {
        return TbAuditHistory.TB_AUDIT_HISTORY.REASON_CODE;
    }

    @Override
    public Field<Long> field10() {
        return TbAuditHistory.TB_AUDIT_HISTORY.USERID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getAuditid();
    }

    @Override
    public LocalDateTime component3() {
        return getTime();
    }

    @Override
    public String component4() {
        return getDetail();
    }

    @Override
    public Integer component5() {
        return getEventType();
    }

    @Override
    public Integer component6() {
        return getLevel();
    }

    @Override
    public Integer component7() {
        return getState();
    }

    @Override
    public Long component8() {
        return getTargetid();
    }

    @Override
    public String component9() {
        return getReasonCode();
    }

    @Override
    public Long component10() {
        return getUserid();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getAuditid();
    }

    @Override
    public LocalDateTime value3() {
        return getTime();
    }

    @Override
    public String value4() {
        return getDetail();
    }

    @Override
    public Integer value5() {
        return getEventType();
    }

    @Override
    public Integer value6() {
        return getLevel();
    }

    @Override
    public Integer value7() {
        return getState();
    }

    @Override
    public Long value8() {
        return getTargetid();
    }

    @Override
    public String value9() {
        return getReasonCode();
    }

    @Override
    public Long value10() {
        return getUserid();
    }

    @Override
    public TbAuditHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value2(Long value) {
        setAuditid(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value3(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value4(String value) {
        setDetail(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value5(Integer value) {
        setEventType(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value6(Integer value) {
        setLevel(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value7(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value8(Long value) {
        setTargetid(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value9(String value) {
        setReasonCode(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord value10(Long value) {
        setUserid(value);
        return this;
    }

    @Override
    public TbAuditHistoryRecord values(Long value1, Long value2, LocalDateTime value3, String value4, Integer value5, Integer value6, Integer value7, Long value8, String value9, Long value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbAuditHistoryRecord
     */
    public TbAuditHistoryRecord() {
        super(TbAuditHistory.TB_AUDIT_HISTORY);
    }

    /**
     * Create a detached, initialised TbAuditHistoryRecord
     */
    public TbAuditHistoryRecord(Long id, Long auditid, LocalDateTime time, String detail, Integer eventType, Integer level, Integer state, Long targetid, String reasonCode, Long userid) {
        super(TbAuditHistory.TB_AUDIT_HISTORY);

        setId(id);
        setAuditid(auditid);
        setTime(time);
        setDetail(detail);
        setEventType(eventType);
        setLevel(level);
        setState(state);
        setTargetid(targetid);
        setReasonCode(reasonCode);
        setUserid(userid);
    }

    /**
     * Create a detached, initialised TbAuditHistoryRecord
     */
    public TbAuditHistoryRecord(com.tengzhe.jooq.data.audit_wolong.tables.pojos.TbAuditHistory value) {
        super(TbAuditHistory.TB_AUDIT_HISTORY);

        if (value != null) {
            setId(value.getId());
            setAuditid(value.getAuditid());
            setTime(value.getTime());
            setDetail(value.getDetail());
            setEventType(value.getEventType());
            setLevel(value.getLevel());
            setState(value.getState());
            setTargetid(value.getTargetid());
            setReasonCode(value.getReasonCode());
            setUserid(value.getUserid());
        }
    }
}