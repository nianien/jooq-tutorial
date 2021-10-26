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
public class AuditBrandCreativeLogHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          creativeId;
    private Long          userId;
    private String        name;
    private Integer       media;
    private Integer       resourceType;
    private Integer       adStyleId;
    private Integer       adStyleType;
    private String        content;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private String        auditType;
    private String        auditDetail;
    private LocalDateTime createTime;

    public AuditBrandCreativeLogHistory() {}

    public AuditBrandCreativeLogHistory(AuditBrandCreativeLogHistory value) {
        this.id = value.id;
        this.creativeId = value.creativeId;
        this.userId = value.userId;
        this.name = value.name;
        this.media = value.media;
        this.resourceType = value.resourceType;
        this.adStyleId = value.adStyleId;
        this.adStyleType = value.adStyleType;
        this.content = value.content;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.auditType = value.auditType;
        this.auditDetail = value.auditDetail;
        this.createTime = value.createTime;
    }

    public AuditBrandCreativeLogHistory(
        Long          id,
        Long          creativeId,
        Long          userId,
        String        name,
        Integer       media,
        Integer       resourceType,
        Integer       adStyleId,
        Integer       adStyleType,
        String        content,
        Integer       logicState,
        Long          version,
        Integer       state,
        Integer       stateDetail,
        String        auditType,
        String        auditDetail,
        LocalDateTime createTime
    ) {
        this.id = id;
        this.creativeId = creativeId;
        this.userId = userId;
        this.name = name;
        this.media = media;
        this.resourceType = resourceType;
        this.adStyleId = adStyleId;
        this.adStyleType = adStyleType;
        this.content = content;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.auditType = auditType;
        this.auditDetail = auditDetail;
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.creative_id</code>.
     */
    public Long getCreativeId() {
        return this.creativeId;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.creative_id</code>.
     */
    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.media</code>.
     */
    public Integer getMedia() {
        return this.media;
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.media</code>.
     */
    public void setMedia(Integer media) {
        this.media = media;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.resource_type</code>.
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.resource_type</code>.
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return this.adStyleId;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.ad_style_id</code>.
     */
    public void setAdStyleId(Integer adStyleId) {
        this.adStyleId = adStyleId;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.ad_style_type</code>.
     */
    public Integer getAdStyleType() {
        return this.adStyleType;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.ad_style_type</code>.
     */
    public void setAdStyleType(Integer adStyleType) {
        this.adStyleType = adStyleType;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.audit_type</code>.
     */
    public String getAuditType() {
        return this.auditType;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.audit_type</code>.
     */
    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.audit_detail</code>.
     */
    public String getAuditDetail() {
        return this.auditDetail;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.audit_detail</code>.
     */
    public void setAuditDetail(String auditDetail) {
        this.auditDetail = auditDetail;
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditBrandCreativeLogHistory (");

        sb.append(id);
        sb.append(", ").append(creativeId);
        sb.append(", ").append(userId);
        sb.append(", ").append(name);
        sb.append(", ").append(media);
        sb.append(", ").append(resourceType);
        sb.append(", ").append(adStyleId);
        sb.append(", ").append(adStyleType);
        sb.append(", ").append(content);
        sb.append(", ").append(logicState);
        sb.append(", ").append(version);
        sb.append(", ").append(state);
        sb.append(", ").append(stateDetail);
        sb.append(", ").append(auditType);
        sb.append(", ").append(auditDetail);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}