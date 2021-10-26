/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditEntityDetailLog;

import java.time.LocalDateTime;
import java.util.Date;

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
public class AuditEntityDetailLogRecord extends UpdatableRecordImpl<AuditEntityDetailLogRecord> implements Record13<Long, Integer, Integer, Long, Integer, Long, Integer, Integer, Integer, Long, Date, Date, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_entity_detail_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.dt</code>.
     */
    public void setDt(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.dt</code>.
     */
    public Integer getDt() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.entity_type</code>.
     */
    public void setEntityType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.entity_type</code>.
     */
    public Integer getEntityType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.audit_type</code>.
     */
    public void setAuditType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.audit_type</code>.
     */
    public Integer getAuditType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.user_id</code>.
     */
    public void setUserId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.sme</code>.
     */
    public void setSme(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.sme</code>.
     */
    public Integer getSme() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.industry1</code>.
     */
    public void setIndustry1(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.industry1</code>.
     */
    public Integer getIndustry1() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>material.audit_entity_detail_log.audit_start_time</code>.
     */
    public void setAuditStartTime(Date value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>material.audit_entity_detail_log.audit_start_time</code>.
     */
    public Date getAuditStartTime() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.audit_end_time</code>.
     */
    public void setAuditEndTime(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.audit_end_time</code>.
     */
    public Date getAuditEndTime() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>material.audit_entity_detail_log.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.audit_entity_detail_log.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
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
    public Row13<Long, Integer, Integer, Long, Integer, Long, Integer, Integer, Integer, Long, Date, Date, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Integer, Integer, Long, Integer, Long, Integer, Integer, Integer, Long, Date, Date, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.DT;
    }

    @Override
    public Field<Integer> field3() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.ENTITY_TYPE;
    }

    @Override
    public Field<Long> field4() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.ENTITY_ID;
    }

    @Override
    public Field<Integer> field5() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.AUDIT_TYPE;
    }

    @Override
    public Field<Long> field6() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.USER_ID;
    }

    @Override
    public Field<Integer> field7() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.SME;
    }

    @Override
    public Field<Integer> field8() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.INDUSTRY1;
    }

    @Override
    public Field<Integer> field9() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.AUDIT_STATE;
    }

    @Override
    public Field<Long> field10() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.AUDITOR_ID;
    }

    @Override
    public Field<Date> field11() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.AUDIT_START_TIME;
    }

    @Override
    public Field<Date> field12() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.AUDIT_END_TIME;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getDt();
    }

    @Override
    public Integer component3() {
        return getEntityType();
    }

    @Override
    public Long component4() {
        return getEntityId();
    }

    @Override
    public Integer component5() {
        return getAuditType();
    }

    @Override
    public Long component6() {
        return getUserId();
    }

    @Override
    public Integer component7() {
        return getSme();
    }

    @Override
    public Integer component8() {
        return getIndustry1();
    }

    @Override
    public Integer component9() {
        return getAuditState();
    }

    @Override
    public Long component10() {
        return getAuditorId();
    }

    @Override
    public Date component11() {
        return getAuditStartTime();
    }

    @Override
    public Date component12() {
        return getAuditEndTime();
    }

    @Override
    public LocalDateTime component13() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getDt();
    }

    @Override
    public Integer value3() {
        return getEntityType();
    }

    @Override
    public Long value4() {
        return getEntityId();
    }

    @Override
    public Integer value5() {
        return getAuditType();
    }

    @Override
    public Long value6() {
        return getUserId();
    }

    @Override
    public Integer value7() {
        return getSme();
    }

    @Override
    public Integer value8() {
        return getIndustry1();
    }

    @Override
    public Integer value9() {
        return getAuditState();
    }

    @Override
    public Long value10() {
        return getAuditorId();
    }

    @Override
    public Date value11() {
        return getAuditStartTime();
    }

    @Override
    public Date value12() {
        return getAuditEndTime();
    }

    @Override
    public LocalDateTime value13() {
        return getCreateTime();
    }

    @Override
    public AuditEntityDetailLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value2(Integer value) {
        setDt(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value3(Integer value) {
        setEntityType(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value4(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value5(Integer value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value6(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value7(Integer value) {
        setSme(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value8(Integer value) {
        setIndustry1(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value9(Integer value) {
        setAuditState(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value10(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value11(Date value) {
        setAuditStartTime(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value12(Date value) {
        setAuditEndTime(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord value13(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditEntityDetailLogRecord values(Long value1, Integer value2, Integer value3, Long value4, Integer value5, Long value6, Integer value7, Integer value8, Integer value9, Long value10, Date value11, Date value12, LocalDateTime value13) {
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
     * Create a detached AuditEntityDetailLogRecord
     */
    public AuditEntityDetailLogRecord() {
        super(AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG);
    }

    /**
     * Create a detached, initialised AuditEntityDetailLogRecord
     */
    public AuditEntityDetailLogRecord(Long id, Integer dt, Integer entityType, Long entityId, Integer auditType, Long userId, Integer sme, Integer industry1, Integer auditState, Long auditorId, Date auditStartTime, Date auditEndTime, LocalDateTime createTime) {
        super(AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG);

        setId(id);
        setDt(dt);
        setEntityType(entityType);
        setEntityId(entityId);
        setAuditType(auditType);
        setUserId(userId);
        setSme(sme);
        setIndustry1(industry1);
        setAuditState(auditState);
        setAuditorId(auditorId);
        setAuditStartTime(auditStartTime);
        setAuditEndTime(auditEndTime);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditEntityDetailLogRecord
     */
    public AuditEntityDetailLogRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditEntityDetailLog value) {
        super(AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG);

        if (value != null) {
            setId(value.getId());
            setDt(value.getDt());
            setEntityType(value.getEntityType());
            setEntityId(value.getEntityId());
            setAuditType(value.getAuditType());
            setUserId(value.getUserId());
            setSme(value.getSme());
            setIndustry1(value.getIndustry1());
            setAuditState(value.getAuditState());
            setAuditorId(value.getAuditorId());
            setAuditStartTime(value.getAuditStartTime());
            setAuditEndTime(value.getAuditEndTime());
            setCreateTime(value.getCreateTime());
        }
    }
}
