/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.pojos;


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
public class AuditWhitelistConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          cid;
    private String        siteUrl;
    private Long          ucId;
    private String        bizTypes;
    private Integer       targetType;
    private Integer       dimension;
    private Long          auditorId;
    private Integer       status;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditWhitelistConfig() {}

    public AuditWhitelistConfig(AuditWhitelistConfig value) {
        this.id = value.id;
        this.cid = value.cid;
        this.siteUrl = value.siteUrl;
        this.ucId = value.ucId;
        this.bizTypes = value.bizTypes;
        this.targetType = value.targetType;
        this.dimension = value.dimension;
        this.auditorId = value.auditorId;
        this.status = value.status;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditWhitelistConfig(
        Long          id,
        Long          cid,
        String        siteUrl,
        Long          ucId,
        String        bizTypes,
        Integer       targetType,
        Integer       dimension,
        Long          auditorId,
        Integer       status,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.cid = cid;
        this.siteUrl = siteUrl;
        this.ucId = ucId;
        this.bizTypes = bizTypes;
        this.targetType = targetType;
        this.dimension = dimension;
        this.auditorId = auditorId;
        this.status = status;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.cid</code>.
     */
    public Long getCid() {
        return this.cid;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.cid</code>.
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.site_url</code>.
     */
    public String getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.site_url</code>.
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.uc_id</code>.
     */
    public Long getUcId() {
        return this.ucId;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.uc_id</code>.
     */
    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.biz_types</code>.
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.biz_types</code>.
     */
    public void setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.target_type</code>.
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.target_type</code>.
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.dimension</code>.
     */
    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.dimension</code>.
     */
    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.status</code>.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.status</code>.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditWhitelistConfig (");

        sb.append(id);
        sb.append(", ").append(cid);
        sb.append(", ").append(siteUrl);
        sb.append(", ").append(ucId);
        sb.append(", ").append(bizTypes);
        sb.append(", ").append(targetType);
        sb.append(", ").append(dimension);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
