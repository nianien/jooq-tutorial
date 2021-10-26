/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


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
public class AuditAppAdIdeaLogHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          ideaId;
    private Long          ucId;
    private Long          userId;
    private Long          groupId;
    private Long          campaignId;
    private Integer       adStyleId;
    private String        appName;
    private String        content;
    private Integer       platform;
    private Long          version;
    private Integer       logicState;
    private Integer       state;
    private Integer       stateDetail;
    private String        auditType;
    private Long          auditorId;
    private String        auditDetail;
    private LocalDateTime createTime;

    public AuditAppAdIdeaLogHistory() {}

    public AuditAppAdIdeaLogHistory(AuditAppAdIdeaLogHistory value) {
        this.id = value.id;
        this.ideaId = value.ideaId;
        this.ucId = value.ucId;
        this.userId = value.userId;
        this.groupId = value.groupId;
        this.campaignId = value.campaignId;
        this.adStyleId = value.adStyleId;
        this.appName = value.appName;
        this.content = value.content;
        this.platform = value.platform;
        this.version = value.version;
        this.logicState = value.logicState;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.auditType = value.auditType;
        this.auditorId = value.auditorId;
        this.auditDetail = value.auditDetail;
        this.createTime = value.createTime;
    }

    public AuditAppAdIdeaLogHistory(
        Long          id,
        Long          ideaId,
        Long          ucId,
        Long          userId,
        Long          groupId,
        Long          campaignId,
        Integer       adStyleId,
        String        appName,
        String        content,
        Integer       platform,
        Long          version,
        Integer       logicState,
        Integer       state,
        Integer       stateDetail,
        String        auditType,
        Long          auditorId,
        String        auditDetail,
        LocalDateTime createTime
    ) {
        this.id = id;
        this.ideaId = ideaId;
        this.ucId = ucId;
        this.userId = userId;
        this.groupId = groupId;
        this.campaignId = campaignId;
        this.adStyleId = adStyleId;
        this.appName = appName;
        this.content = content;
        this.platform = platform;
        this.version = version;
        this.logicState = logicState;
        this.state = state;
        this.stateDetail = stateDetail;
        this.auditType = auditType;
        this.auditorId = auditorId;
        this.auditDetail = auditDetail;
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.idea_id</code>.
     */
    public Long getIdeaId() {
        return this.ideaId;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.idea_id</code>.
     */
    public void setIdeaId(Long ideaId) {
        this.ideaId = ideaId;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.uc_id</code>.
     */
    public Long getUcId() {
        return this.ucId;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.uc_id</code>.
     */
    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.group_id</code>.
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.group_id</code>.
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.campaign_id</code>.
     */
    public Long getCampaignId() {
        return this.campaignId;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.campaign_id</code>.
     */
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return this.adStyleId;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.ad_style_id</code>.
     */
    public void setAdStyleId(Integer adStyleId) {
        this.adStyleId = adStyleId;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.app_name</code>.
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.app_name</code>.
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.platform</code>.
     */
    public Integer getPlatform() {
        return this.platform;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.platform</code>.
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.audit_app_ad_idea_log_history.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.audit_app_ad_idea_log_history.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.audit_type</code>.
     */
    public String getAuditType() {
        return this.auditType;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.audit_type</code>.
     */
    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.audit_detail</code>.
     */
    public String getAuditDetail() {
        return this.auditDetail;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.audit_detail</code>.
     */
    public void setAuditDetail(String auditDetail) {
        this.auditDetail = auditDetail;
    }

    /**
     * Getter for
     * <code>material.audit_app_ad_idea_log_history.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for
     * <code>material.audit_app_ad_idea_log_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditAppAdIdeaLogHistory (");

        sb.append(id);
        sb.append(", ").append(ideaId);
        sb.append(", ").append(ucId);
        sb.append(", ").append(userId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(campaignId);
        sb.append(", ").append(adStyleId);
        sb.append(", ").append(appName);
        sb.append(", ").append(content);
        sb.append(", ").append(platform);
        sb.append(", ").append(version);
        sb.append(", ").append(logicState);
        sb.append(", ").append(state);
        sb.append(", ").append(stateDetail);
        sb.append(", ").append(auditType);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(auditDetail);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}