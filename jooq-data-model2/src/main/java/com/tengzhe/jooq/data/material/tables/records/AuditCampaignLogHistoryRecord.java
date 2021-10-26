/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditCampaignLogHistory;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class AuditCampaignLogHistoryRecord extends UpdatableRecordImpl<AuditCampaignLogHistoryRecord> implements Record21<Long, Long, String, Long, Long, Long, Integer, Integer, Integer, Long, String, String, String, Integer, Integer, Long, Integer, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_campaign_log_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.campaign_id</code>.
     */
    public void setCampaignId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.campaign_id</code>.
     */
    public Long getCampaignId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>material.audit_campaign_log_history.campaign_name</code>.
     */
    public void setCampaignName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>material.audit_campaign_log_history.campaign_name</code>.
     */
    public String getCampaignName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.uc_id</code>.
     */
    public void setUcId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.uc_id</code>.
     */
    public Long getUcId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.user_id</code>.
     */
    public void setUserId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.group_id</code>.
     */
    public void setGroupId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.group_id</code>.
     */
    public Long getGroupId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.type</code>.
     */
    public void setType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.type</code>.
     */
    public Integer getType() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>material.audit_campaign_log_history.ad_resource_id</code>.
     */
    public void setAdResourceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>material.audit_campaign_log_history.ad_resource_id</code>.
     */
    public Integer getAdResourceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.platform</code>.
     */
    public void setPlatform(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.platform</code>.
     */
    public Integer getPlatform() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.site_id</code>.
     */
    public void setSiteId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.site_id</code>.
     */
    public Long getSiteId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.target_url</code>.
     */
    public void setTargetUrl(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.target_url</code>.
     */
    public String getTargetUrl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.download_url</code>.
     */
    public void setDownloadUrl(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.download_url</code>.
     */
    public String getDownloadUrl() {
        return (String) get(11);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.content</code>.
     */
    public void setContent(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.content</code>.
     */
    public String getContent() {
        return (String) get(12);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.paused</code>.
     */
    public void setPaused(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.paused</code>.
     */
    public Integer getPaused() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.version</code>.
     */
    public void setVersion(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.version</code>.
     */
    public Long getVersion() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.state</code>.
     */
    public void setState(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.state</code>.
     */
    public Integer getState() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.audit_type</code>.
     */
    public void setAuditType(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.audit_type</code>.
     */
    public String getAuditType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.audit_detail</code>.
     */
    public void setAuditDetail(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.audit_detail</code>.
     */
    public String getAuditDetail() {
        return (String) get(19);
    }

    /**
     * Setter for <code>material.audit_campaign_log_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>material.audit_campaign_log_history.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, String, Long, Long, Long, Integer, Integer, Integer, Long, String, String, String, Integer, Integer, Long, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, Long, String, Long, Long, Long, Integer, Integer, Integer, Long, String, String, String, Integer, Integer, Long, Integer, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.CAMPAIGN_ID;
    }

    @Override
    public Field<String> field3() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.CAMPAIGN_NAME;
    }

    @Override
    public Field<Long> field4() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.UC_ID;
    }

    @Override
    public Field<Long> field5() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.USER_ID;
    }

    @Override
    public Field<Long> field6() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.GROUP_ID;
    }

    @Override
    public Field<Integer> field7() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.TYPE;
    }

    @Override
    public Field<Integer> field8() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.AD_RESOURCE_ID;
    }

    @Override
    public Field<Integer> field9() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.PLATFORM;
    }

    @Override
    public Field<Long> field10() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.SITE_ID;
    }

    @Override
    public Field<String> field11() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.TARGET_URL;
    }

    @Override
    public Field<String> field12() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.DOWNLOAD_URL;
    }

    @Override
    public Field<String> field13() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.CONTENT;
    }

    @Override
    public Field<Integer> field14() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.PAUSED;
    }

    @Override
    public Field<Integer> field15() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.LOGIC_STATE;
    }

    @Override
    public Field<Long> field16() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.VERSION;
    }

    @Override
    public Field<Integer> field17() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.STATE;
    }

    @Override
    public Field<Integer> field18() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.STATE_DETAIL;
    }

    @Override
    public Field<String> field19() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.AUDIT_TYPE;
    }

    @Override
    public Field<String> field20() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.AUDIT_DETAIL;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCampaignId();
    }

    @Override
    public String component3() {
        return getCampaignName();
    }

    @Override
    public Long component4() {
        return getUcId();
    }

    @Override
    public Long component5() {
        return getUserId();
    }

    @Override
    public Long component6() {
        return getGroupId();
    }

    @Override
    public Integer component7() {
        return getType();
    }

    @Override
    public Integer component8() {
        return getAdResourceId();
    }

    @Override
    public Integer component9() {
        return getPlatform();
    }

    @Override
    public Long component10() {
        return getSiteId();
    }

    @Override
    public String component11() {
        return getTargetUrl();
    }

    @Override
    public String component12() {
        return getDownloadUrl();
    }

    @Override
    public String component13() {
        return getContent();
    }

    @Override
    public Integer component14() {
        return getPaused();
    }

    @Override
    public Integer component15() {
        return getLogicState();
    }

    @Override
    public Long component16() {
        return getVersion();
    }

    @Override
    public Integer component17() {
        return getState();
    }

    @Override
    public Integer component18() {
        return getStateDetail();
    }

    @Override
    public String component19() {
        return getAuditType();
    }

    @Override
    public String component20() {
        return getAuditDetail();
    }

    @Override
    public LocalDateTime component21() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCampaignId();
    }

    @Override
    public String value3() {
        return getCampaignName();
    }

    @Override
    public Long value4() {
        return getUcId();
    }

    @Override
    public Long value5() {
        return getUserId();
    }

    @Override
    public Long value6() {
        return getGroupId();
    }

    @Override
    public Integer value7() {
        return getType();
    }

    @Override
    public Integer value8() {
        return getAdResourceId();
    }

    @Override
    public Integer value9() {
        return getPlatform();
    }

    @Override
    public Long value10() {
        return getSiteId();
    }

    @Override
    public String value11() {
        return getTargetUrl();
    }

    @Override
    public String value12() {
        return getDownloadUrl();
    }

    @Override
    public String value13() {
        return getContent();
    }

    @Override
    public Integer value14() {
        return getPaused();
    }

    @Override
    public Integer value15() {
        return getLogicState();
    }

    @Override
    public Long value16() {
        return getVersion();
    }

    @Override
    public Integer value17() {
        return getState();
    }

    @Override
    public Integer value18() {
        return getStateDetail();
    }

    @Override
    public String value19() {
        return getAuditType();
    }

    @Override
    public String value20() {
        return getAuditDetail();
    }

    @Override
    public LocalDateTime value21() {
        return getCreateTime();
    }

    @Override
    public AuditCampaignLogHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value2(Long value) {
        setCampaignId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value3(String value) {
        setCampaignName(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value4(Long value) {
        setUcId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value5(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value6(Long value) {
        setGroupId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value7(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value8(Integer value) {
        setAdResourceId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value9(Integer value) {
        setPlatform(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value10(Long value) {
        setSiteId(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value11(String value) {
        setTargetUrl(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value12(String value) {
        setDownloadUrl(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value13(String value) {
        setContent(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value14(Integer value) {
        setPaused(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value15(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value16(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value17(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value18(Integer value) {
        setStateDetail(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value19(String value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value20(String value) {
        setAuditDetail(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord value21(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditCampaignLogHistoryRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Long value6, Integer value7, Integer value8, Integer value9, Long value10, String value11, String value12, String value13, Integer value14, Integer value15, Long value16, Integer value17, Integer value18, String value19, String value20, LocalDateTime value21) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditCampaignLogHistoryRecord
     */
    public AuditCampaignLogHistoryRecord() {
        super(AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY);
    }

    /**
     * Create a detached, initialised AuditCampaignLogHistoryRecord
     */
    public AuditCampaignLogHistoryRecord(Long id, Long campaignId, String campaignName, Long ucId, Long userId, Long groupId, Integer type, Integer adResourceId, Integer platform, Long siteId, String targetUrl, String downloadUrl, String content, Integer paused, Integer logicState, Long version, Integer state, Integer stateDetail, String auditType, String auditDetail, LocalDateTime createTime) {
        super(AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY);

        setId(id);
        setCampaignId(campaignId);
        setCampaignName(campaignName);
        setUcId(ucId);
        setUserId(userId);
        setGroupId(groupId);
        setType(type);
        setAdResourceId(adResourceId);
        setPlatform(platform);
        setSiteId(siteId);
        setTargetUrl(targetUrl);
        setDownloadUrl(downloadUrl);
        setContent(content);
        setPaused(paused);
        setLogicState(logicState);
        setVersion(version);
        setState(state);
        setStateDetail(stateDetail);
        setAuditType(auditType);
        setAuditDetail(auditDetail);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditCampaignLogHistoryRecord
     */
    public AuditCampaignLogHistoryRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditCampaignLogHistory value) {
        super(AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY);

        if (value != null) {
            setId(value.getId());
            setCampaignId(value.getCampaignId());
            setCampaignName(value.getCampaignName());
            setUcId(value.getUcId());
            setUserId(value.getUserId());
            setGroupId(value.getGroupId());
            setType(value.getType());
            setAdResourceId(value.getAdResourceId());
            setPlatform(value.getPlatform());
            setSiteId(value.getSiteId());
            setTargetUrl(value.getTargetUrl());
            setDownloadUrl(value.getDownloadUrl());
            setContent(value.getContent());
            setPaused(value.getPaused());
            setLogicState(value.getLogicState());
            setVersion(value.getVersion());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setAuditType(value.getAuditType());
            setAuditDetail(value.getAuditDetail());
            setCreateTime(value.getCreateTime());
        }
    }
}