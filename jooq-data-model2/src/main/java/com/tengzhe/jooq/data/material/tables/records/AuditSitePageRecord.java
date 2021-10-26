/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditSitePage;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class AuditSitePageRecord extends UpdatableRecordImpl<AuditSitePageRecord> implements Record15<Long, Long, Long, Integer, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_site_page.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_site_page.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_site_page.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_site_page.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.audit_site_page.version</code>.
     */
    public void setVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_site_page.version</code>.
     */
    public Long getVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.audit_site_page.audit_type</code>.
     */
    public void setAuditType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_site_page.audit_type</code>.
     */
    public Integer getAuditType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>material.audit_site_page.user_id</code>.
     */
    public void setUserId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_site_page.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>material.audit_site_page.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_site_page.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>material.audit_site_page.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_site_page.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>material.audit_site_page.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_site_page.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>material.audit_site_page.reason</code>.
     */
    public void setReason(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_site_page.reason</code>.
     */
    public String getReason() {
        return (String) get(8);
    }

    /**
     * Setter for <code>material.audit_site_page.audit_start_time</code>.
     */
    public void setAuditStartTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_site_page.audit_start_time</code>.
     */
    public LocalDateTime getAuditStartTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>material.audit_site_page.audit_end_time</code>.
     */
    public void setAuditEndTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.audit_site_page.audit_end_time</code>.
     */
    public LocalDateTime getAuditEndTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>material.audit_site_page.extend</code>.
     */
    public void setExtend(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_site_page.extend</code>.
     */
    public String getExtend() {
        return (String) get(11);
    }

    /**
     * Setter for <code>material.audit_site_page.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.audit_site_page.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>material.audit_site_page.modify_day_tag</code>.
     */
    public void setModifyDayTag(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.audit_site_page.modify_day_tag</code>.
     */
    public Integer getModifyDayTag() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>material.audit_site_page.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.audit_site_page.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Long, Integer, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Long, Long, Long, Integer, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditSitePage.AUDIT_SITE_PAGE.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditSitePage.AUDIT_SITE_PAGE.ENTITY_ID;
    }

    @Override
    public Field<Long> field3() {
        return AuditSitePage.AUDIT_SITE_PAGE.VERSION;
    }

    @Override
    public Field<Integer> field4() {
        return AuditSitePage.AUDIT_SITE_PAGE.AUDIT_TYPE;
    }

    @Override
    public Field<Long> field5() {
        return AuditSitePage.AUDIT_SITE_PAGE.USER_ID;
    }

    @Override
    public Field<Integer> field6() {
        return AuditSitePage.AUDIT_SITE_PAGE.AUDIT_STATE;
    }

    @Override
    public Field<Long> field7() {
        return AuditSitePage.AUDIT_SITE_PAGE.AUDITOR_ID;
    }

    @Override
    public Field<String> field8() {
        return AuditSitePage.AUDIT_SITE_PAGE.REASON_CODE;
    }

    @Override
    public Field<String> field9() {
        return AuditSitePage.AUDIT_SITE_PAGE.REASON;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AuditSitePage.AUDIT_SITE_PAGE.AUDIT_START_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditSitePage.AUDIT_SITE_PAGE.AUDIT_END_TIME;
    }

    @Override
    public Field<String> field12() {
        return AuditSitePage.AUDIT_SITE_PAGE.EXTEND;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return AuditSitePage.AUDIT_SITE_PAGE.MODIFY_TIME;
    }

    @Override
    public Field<Integer> field14() {
        return AuditSitePage.AUDIT_SITE_PAGE.MODIFY_DAY_TAG;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return AuditSitePage.AUDIT_SITE_PAGE.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getEntityId();
    }

    @Override
    public Long component3() {
        return getVersion();
    }

    @Override
    public Integer component4() {
        return getAuditType();
    }

    @Override
    public Long component5() {
        return getUserId();
    }

    @Override
    public Integer component6() {
        return getAuditState();
    }

    @Override
    public Long component7() {
        return getAuditorId();
    }

    @Override
    public String component8() {
        return getReasonCode();
    }

    @Override
    public String component9() {
        return getReason();
    }

    @Override
    public LocalDateTime component10() {
        return getAuditStartTime();
    }

    @Override
    public LocalDateTime component11() {
        return getAuditEndTime();
    }

    @Override
    public String component12() {
        return getExtend();
    }

    @Override
    public LocalDateTime component13() {
        return getModifyTime();
    }

    @Override
    public Integer component14() {
        return getModifyDayTag();
    }

    @Override
    public LocalDateTime component15() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getEntityId();
    }

    @Override
    public Long value3() {
        return getVersion();
    }

    @Override
    public Integer value4() {
        return getAuditType();
    }

    @Override
    public Long value5() {
        return getUserId();
    }

    @Override
    public Integer value6() {
        return getAuditState();
    }

    @Override
    public Long value7() {
        return getAuditorId();
    }

    @Override
    public String value8() {
        return getReasonCode();
    }

    @Override
    public String value9() {
        return getReason();
    }

    @Override
    public LocalDateTime value10() {
        return getAuditStartTime();
    }

    @Override
    public LocalDateTime value11() {
        return getAuditEndTime();
    }

    @Override
    public String value12() {
        return getExtend();
    }

    @Override
    public LocalDateTime value13() {
        return getModifyTime();
    }

    @Override
    public Integer value14() {
        return getModifyDayTag();
    }

    @Override
    public LocalDateTime value15() {
        return getCreateTime();
    }

    @Override
    public AuditSitePageRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value2(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value3(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value4(Integer value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value5(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value6(Integer value) {
        setAuditState(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value7(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value8(String value) {
        setReasonCode(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value9(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value10(LocalDateTime value) {
        setAuditStartTime(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value11(LocalDateTime value) {
        setAuditEndTime(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value12(String value) {
        setExtend(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value13(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value14(Integer value) {
        setModifyDayTag(value);
        return this;
    }

    @Override
    public AuditSitePageRecord value15(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditSitePageRecord values(Long value1, Long value2, Long value3, Integer value4, Long value5, Integer value6, Long value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11, String value12, LocalDateTime value13, Integer value14, LocalDateTime value15) {
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
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditSitePageRecord
     */
    public AuditSitePageRecord() {
        super(AuditSitePage.AUDIT_SITE_PAGE);
    }

    /**
     * Create a detached, initialised AuditSitePageRecord
     */
    public AuditSitePageRecord(Long id, Long entityId, Long version, Integer auditType, Long userId, Integer auditState, Long auditorId, String reasonCode, String reason, LocalDateTime auditStartTime, LocalDateTime auditEndTime, String extend, LocalDateTime modifyTime, Integer modifyDayTag, LocalDateTime createTime) {
        super(AuditSitePage.AUDIT_SITE_PAGE);

        setId(id);
        setEntityId(entityId);
        setVersion(version);
        setAuditType(auditType);
        setUserId(userId);
        setAuditState(auditState);
        setAuditorId(auditorId);
        setReasonCode(reasonCode);
        setReason(reason);
        setAuditStartTime(auditStartTime);
        setAuditEndTime(auditEndTime);
        setExtend(extend);
        setModifyTime(modifyTime);
        setModifyDayTag(modifyDayTag);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditSitePageRecord
     */
    public AuditSitePageRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditSitePage value) {
        super(AuditSitePage.AUDIT_SITE_PAGE);

        if (value != null) {
            setId(value.getId());
            setEntityId(value.getEntityId());
            setVersion(value.getVersion());
            setAuditType(value.getAuditType());
            setUserId(value.getUserId());
            setAuditState(value.getAuditState());
            setAuditorId(value.getAuditorId());
            setReasonCode(value.getReasonCode());
            setReason(value.getReason());
            setAuditStartTime(value.getAuditStartTime());
            setAuditEndTime(value.getAuditEndTime());
            setExtend(value.getExtend());
            setModifyTime(value.getModifyTime());
            setModifyDayTag(value.getModifyDayTag());
            setCreateTime(value.getCreateTime());
        }
    }
}
