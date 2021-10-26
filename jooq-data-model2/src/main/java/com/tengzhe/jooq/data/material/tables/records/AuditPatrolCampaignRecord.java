/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditPatrolCampaign;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class AuditPatrolCampaignRecord extends UpdatableRecordImpl<AuditPatrolCampaignRecord> implements Record17<Long, Integer, Long, Long, String, String, String, String, String, String, Integer, String, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_patrol_campaign.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.patrol_type</code>.
     */
    public void setPatrolType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.patrol_type</code>.
     */
    public Integer getPatrolType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.campaign_id</code>.
     */
    public void setCampaignId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.campaign_id</code>.
     */
    public Long getCampaignId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.user_id</code>.
     */
    public void setUserId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.target_url</code>.
     */
    public void setTargetUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.target_url</code>.
     */
    public String getTargetUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.effect_url</code>.
     */
    public void setEffectUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.effect_url</code>.
     */
    public String getEffectUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.hit_words</code>.
     */
    public void setHitWords(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.hit_words</code>.
     */
    public String getHitWords() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.risk_type</code>.
     */
    public void setRiskType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.risk_type</code>.
     */
    public String getRiskType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.risk_rate</code>.
     */
    public void setRiskRate(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.risk_rate</code>.
     */
    public String getRiskRate() {
        return (String) get(8);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.url_snapshot</code>.
     */
    public void setUrlSnapshot(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.url_snapshot</code>.
     */
    public String getUrlSnapshot() {
        return (String) get(9);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.operate</code>.
     */
    public void setOperate(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.operate</code>.
     */
    public Integer getOperate() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.audit_tag</code>.
     */
    public void setAuditTag(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.audit_tag</code>.
     */
    public String getAuditTag() {
        return (String) get(11);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.audit_time</code>.
     */
    public void setAuditTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.audit_time</code>.
     */
    public LocalDateTime getAuditTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.patrol_date</code>.
     */
    public void setPatrolDate(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.patrol_date</code>.
     */
    public Integer getPatrolDate() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>material.audit_patrol_campaign.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>material.audit_patrol_campaign.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Integer, Long, Long, String, String, String, String, String, String, Integer, String, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, Integer, Long, Long, String, String, String, String, String, String, Integer, String, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.PATROL_TYPE;
    }

    @Override
    public Field<Long> field3() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.CAMPAIGN_ID;
    }

    @Override
    public Field<Long> field4() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.USER_ID;
    }

    @Override
    public Field<String> field5() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.TARGET_URL;
    }

    @Override
    public Field<String> field6() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.EFFECT_URL;
    }

    @Override
    public Field<String> field7() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.HIT_WORDS;
    }

    @Override
    public Field<String> field8() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.RISK_TYPE;
    }

    @Override
    public Field<String> field9() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.RISK_RATE;
    }

    @Override
    public Field<String> field10() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.URL_SNAPSHOT;
    }

    @Override
    public Field<Integer> field11() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.OPERATE;
    }

    @Override
    public Field<String> field12() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.AUDIT_TAG;
    }

    @Override
    public Field<Long> field13() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.AUDITOR_ID;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.AUDIT_TIME;
    }

    @Override
    public Field<Integer> field15() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.PATROL_DATE;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPatrolType();
    }

    @Override
    public Long component3() {
        return getCampaignId();
    }

    @Override
    public Long component4() {
        return getUserId();
    }

    @Override
    public String component5() {
        return getTargetUrl();
    }

    @Override
    public String component6() {
        return getEffectUrl();
    }

    @Override
    public String component7() {
        return getHitWords();
    }

    @Override
    public String component8() {
        return getRiskType();
    }

    @Override
    public String component9() {
        return getRiskRate();
    }

    @Override
    public String component10() {
        return getUrlSnapshot();
    }

    @Override
    public Integer component11() {
        return getOperate();
    }

    @Override
    public String component12() {
        return getAuditTag();
    }

    @Override
    public Long component13() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime component14() {
        return getAuditTime();
    }

    @Override
    public Integer component15() {
        return getPatrolDate();
    }

    @Override
    public LocalDateTime component16() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component17() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPatrolType();
    }

    @Override
    public Long value3() {
        return getCampaignId();
    }

    @Override
    public Long value4() {
        return getUserId();
    }

    @Override
    public String value5() {
        return getTargetUrl();
    }

    @Override
    public String value6() {
        return getEffectUrl();
    }

    @Override
    public String value7() {
        return getHitWords();
    }

    @Override
    public String value8() {
        return getRiskType();
    }

    @Override
    public String value9() {
        return getRiskRate();
    }

    @Override
    public String value10() {
        return getUrlSnapshot();
    }

    @Override
    public Integer value11() {
        return getOperate();
    }

    @Override
    public String value12() {
        return getAuditTag();
    }

    @Override
    public Long value13() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime value14() {
        return getAuditTime();
    }

    @Override
    public Integer value15() {
        return getPatrolDate();
    }

    @Override
    public LocalDateTime value16() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value17() {
        return getModifyTime();
    }

    @Override
    public AuditPatrolCampaignRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value2(Integer value) {
        setPatrolType(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value3(Long value) {
        setCampaignId(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value4(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value5(String value) {
        setTargetUrl(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value6(String value) {
        setEffectUrl(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value7(String value) {
        setHitWords(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value8(String value) {
        setRiskType(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value9(String value) {
        setRiskRate(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value10(String value) {
        setUrlSnapshot(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value11(Integer value) {
        setOperate(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value12(String value) {
        setAuditTag(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value13(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value14(LocalDateTime value) {
        setAuditTime(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value15(Integer value) {
        setPatrolDate(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value16(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord value17(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditPatrolCampaignRecord values(Long value1, Integer value2, Long value3, Long value4, String value5, String value6, String value7, String value8, String value9, String value10, Integer value11, String value12, Long value13, LocalDateTime value14, Integer value15, LocalDateTime value16, LocalDateTime value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditPatrolCampaignRecord
     */
    public AuditPatrolCampaignRecord() {
        super(AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN);
    }

    /**
     * Create a detached, initialised AuditPatrolCampaignRecord
     */
    public AuditPatrolCampaignRecord(Long id, Integer patrolType, Long campaignId, Long userId, String targetUrl, String effectUrl, String hitWords, String riskType, String riskRate, String urlSnapshot, Integer operate, String auditTag, Long auditorId, LocalDateTime auditTime, Integer patrolDate, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN);

        setId(id);
        setPatrolType(patrolType);
        setCampaignId(campaignId);
        setUserId(userId);
        setTargetUrl(targetUrl);
        setEffectUrl(effectUrl);
        setHitWords(hitWords);
        setRiskType(riskType);
        setRiskRate(riskRate);
        setUrlSnapshot(urlSnapshot);
        setOperate(operate);
        setAuditTag(auditTag);
        setAuditorId(auditorId);
        setAuditTime(auditTime);
        setPatrolDate(patrolDate);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditPatrolCampaignRecord
     */
    public AuditPatrolCampaignRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditPatrolCampaign value) {
        super(AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN);

        if (value != null) {
            setId(value.getId());
            setPatrolType(value.getPatrolType());
            setCampaignId(value.getCampaignId());
            setUserId(value.getUserId());
            setTargetUrl(value.getTargetUrl());
            setEffectUrl(value.getEffectUrl());
            setHitWords(value.getHitWords());
            setRiskType(value.getRiskType());
            setRiskRate(value.getRiskRate());
            setUrlSnapshot(value.getUrlSnapshot());
            setOperate(value.getOperate());
            setAuditTag(value.getAuditTag());
            setAuditorId(value.getAuditorId());
            setAuditTime(value.getAuditTime());
            setPatrolDate(value.getPatrolDate());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}