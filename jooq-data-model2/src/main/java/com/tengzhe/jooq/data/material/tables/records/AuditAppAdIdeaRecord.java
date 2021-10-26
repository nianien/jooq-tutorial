/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditAppAdIdea;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class AuditAppAdIdeaRecord extends UpdatableRecordImpl<AuditAppAdIdeaRecord> implements Record16<Long, Long, Long, Integer, Long, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_app_ad_idea.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.version</code>.
     */
    public void setVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.version</code>.
     */
    public Long getVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.audit_type</code>.
     */
    public void setAuditType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.audit_type</code>.
     */
    public Integer getAuditType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.user_id</code>.
     */
    public void setUserId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.campaign_id</code>.
     */
    public void setCampaignId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.campaign_id</code>.
     */
    public Long getCampaignId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.reason</code>.
     */
    public void setReason(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.reason</code>.
     */
    public String getReason() {
        return (String) get(9);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.audit_start_time</code>.
     */
    public void setAuditStartTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.audit_start_time</code>.
     */
    public LocalDateTime getAuditStartTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.audit_end_time</code>.
     */
    public void setAuditEndTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.audit_end_time</code>.
     */
    public LocalDateTime getAuditEndTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.extend</code>.
     */
    public void setExtend(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.extend</code>.
     */
    public String getExtend() {
        return (String) get(12);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.modify_day_tag</code>.
     */
    public void setModifyDayTag(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.modify_day_tag</code>.
     */
    public Integer getModifyDayTag() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>material.audit_app_ad_idea.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>material.audit_app_ad_idea.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, Integer, Long, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, Long, Integer, Long, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.ENTITY_ID;
    }

    @Override
    public Field<Long> field3() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.VERSION;
    }

    @Override
    public Field<Integer> field4() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.AUDIT_TYPE;
    }

    @Override
    public Field<Long> field5() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.USER_ID;
    }

    @Override
    public Field<Long> field6() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.CAMPAIGN_ID;
    }

    @Override
    public Field<Integer> field7() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.AUDIT_STATE;
    }

    @Override
    public Field<Long> field8() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.AUDITOR_ID;
    }

    @Override
    public Field<String> field9() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.REASON_CODE;
    }

    @Override
    public Field<String> field10() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.REASON;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.AUDIT_START_TIME;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.AUDIT_END_TIME;
    }

    @Override
    public Field<String> field13() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.EXTEND;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.MODIFY_TIME;
    }

    @Override
    public Field<Integer> field15() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.MODIFY_DAY_TAG;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return AuditAppAdIdea.AUDIT_APP_AD_IDEA.CREATE_TIME;
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
    public Long component6() {
        return getCampaignId();
    }

    @Override
    public Integer component7() {
        return getAuditState();
    }

    @Override
    public Long component8() {
        return getAuditorId();
    }

    @Override
    public String component9() {
        return getReasonCode();
    }

    @Override
    public String component10() {
        return getReason();
    }

    @Override
    public LocalDateTime component11() {
        return getAuditStartTime();
    }

    @Override
    public LocalDateTime component12() {
        return getAuditEndTime();
    }

    @Override
    public String component13() {
        return getExtend();
    }

    @Override
    public LocalDateTime component14() {
        return getModifyTime();
    }

    @Override
    public Integer component15() {
        return getModifyDayTag();
    }

    @Override
    public LocalDateTime component16() {
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
    public Long value6() {
        return getCampaignId();
    }

    @Override
    public Integer value7() {
        return getAuditState();
    }

    @Override
    public Long value8() {
        return getAuditorId();
    }

    @Override
    public String value9() {
        return getReasonCode();
    }

    @Override
    public String value10() {
        return getReason();
    }

    @Override
    public LocalDateTime value11() {
        return getAuditStartTime();
    }

    @Override
    public LocalDateTime value12() {
        return getAuditEndTime();
    }

    @Override
    public String value13() {
        return getExtend();
    }

    @Override
    public LocalDateTime value14() {
        return getModifyTime();
    }

    @Override
    public Integer value15() {
        return getModifyDayTag();
    }

    @Override
    public LocalDateTime value16() {
        return getCreateTime();
    }

    @Override
    public AuditAppAdIdeaRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value2(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value3(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value4(Integer value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value5(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value6(Long value) {
        setCampaignId(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value7(Integer value) {
        setAuditState(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value8(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value9(String value) {
        setReasonCode(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value10(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value11(LocalDateTime value) {
        setAuditStartTime(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value12(LocalDateTime value) {
        setAuditEndTime(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value13(String value) {
        setExtend(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value14(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value15(Integer value) {
        setModifyDayTag(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord value16(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditAppAdIdeaRecord values(Long value1, Long value2, Long value3, Integer value4, Long value5, Long value6, Integer value7, Long value8, String value9, String value10, LocalDateTime value11, LocalDateTime value12, String value13, LocalDateTime value14, Integer value15, LocalDateTime value16) {
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
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditAppAdIdeaRecord
     */
    public AuditAppAdIdeaRecord() {
        super(AuditAppAdIdea.AUDIT_APP_AD_IDEA);
    }

    /**
     * Create a detached, initialised AuditAppAdIdeaRecord
     */
    public AuditAppAdIdeaRecord(Long id, Long entityId, Long version, Integer auditType, Long userId, Long campaignId, Integer auditState, Long auditorId, String reasonCode, String reason, LocalDateTime auditStartTime, LocalDateTime auditEndTime, String extend, LocalDateTime modifyTime, Integer modifyDayTag, LocalDateTime createTime) {
        super(AuditAppAdIdea.AUDIT_APP_AD_IDEA);

        setId(id);
        setEntityId(entityId);
        setVersion(version);
        setAuditType(auditType);
        setUserId(userId);
        setCampaignId(campaignId);
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
     * Create a detached, initialised AuditAppAdIdeaRecord
     */
    public AuditAppAdIdeaRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditAppAdIdea value) {
        super(AuditAppAdIdea.AUDIT_APP_AD_IDEA);

        if (value != null) {
            setId(value.getId());
            setEntityId(value.getEntityId());
            setVersion(value.getVersion());
            setAuditType(value.getAuditType());
            setUserId(value.getUserId());
            setCampaignId(value.getCampaignId());
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