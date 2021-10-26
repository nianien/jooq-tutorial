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
public class AuditVideo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          entityId;
    private Long          version;
    private Integer       auditType;
    private Long          userId;
    private Integer       auditState;
    private Long          auditorId;
    private String        reasonCode;
    private String        reason;
    private LocalDateTime auditStartTime;
    private LocalDateTime auditEndTime;
    private String        extend;
    private LocalDateTime modifyTime;
    private Integer       modifyDayTag;
    private LocalDateTime createTime;

    public AuditVideo() {}

    public AuditVideo(AuditVideo value) {
        this.id = value.id;
        this.entityId = value.entityId;
        this.version = value.version;
        this.auditType = value.auditType;
        this.userId = value.userId;
        this.auditState = value.auditState;
        this.auditorId = value.auditorId;
        this.reasonCode = value.reasonCode;
        this.reason = value.reason;
        this.auditStartTime = value.auditStartTime;
        this.auditEndTime = value.auditEndTime;
        this.extend = value.extend;
        this.modifyTime = value.modifyTime;
        this.modifyDayTag = value.modifyDayTag;
        this.createTime = value.createTime;
    }

    public AuditVideo(
        Long          id,
        Long          entityId,
        Long          version,
        Integer       auditType,
        Long          userId,
        Integer       auditState,
        Long          auditorId,
        String        reasonCode,
        String        reason,
        LocalDateTime auditStartTime,
        LocalDateTime auditEndTime,
        String        extend,
        LocalDateTime modifyTime,
        Integer       modifyDayTag,
        LocalDateTime createTime
    ) {
        this.id = id;
        this.entityId = entityId;
        this.version = version;
        this.auditType = auditType;
        this.userId = userId;
        this.auditState = auditState;
        this.auditorId = auditorId;
        this.reasonCode = reasonCode;
        this.reason = reason;
        this.auditStartTime = auditStartTime;
        this.auditEndTime = auditEndTime;
        this.extend = extend;
        this.modifyTime = modifyTime;
        this.modifyDayTag = modifyDayTag;
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.audit_video.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.audit_video.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.audit_video.entity_id</code>.
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>material.audit_video.entity_id</code>.
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * Getter for <code>material.audit_video.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.audit_video.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.audit_video.audit_type</code>.
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * Setter for <code>material.audit_video.audit_type</code>.
     */
    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    /**
     * Getter for <code>material.audit_video.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.audit_video.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.audit_video.audit_state</code>.
     */
    public Integer getAuditState() {
        return this.auditState;
    }

    /**
     * Setter for <code>material.audit_video.audit_state</code>.
     */
    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    /**
     * Getter for <code>material.audit_video.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>material.audit_video.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>material.audit_video.reason_code</code>.
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * Setter for <code>material.audit_video.reason_code</code>.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for <code>material.audit_video.reason</code>.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>material.audit_video.reason</code>.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for <code>material.audit_video.audit_start_time</code>.
     */
    public LocalDateTime getAuditStartTime() {
        return this.auditStartTime;
    }

    /**
     * Setter for <code>material.audit_video.audit_start_time</code>.
     */
    public void setAuditStartTime(LocalDateTime auditStartTime) {
        this.auditStartTime = auditStartTime;
    }

    /**
     * Getter for <code>material.audit_video.audit_end_time</code>.
     */
    public LocalDateTime getAuditEndTime() {
        return this.auditEndTime;
    }

    /**
     * Setter for <code>material.audit_video.audit_end_time</code>.
     */
    public void setAuditEndTime(LocalDateTime auditEndTime) {
        this.auditEndTime = auditEndTime;
    }

    /**
     * Getter for <code>material.audit_video.extend</code>.
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * Setter for <code>material.audit_video.extend</code>.
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }

    /**
     * Getter for <code>material.audit_video.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.audit_video.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.audit_video.modify_day_tag</code>.
     */
    public Integer getModifyDayTag() {
        return this.modifyDayTag;
    }

    /**
     * Setter for <code>material.audit_video.modify_day_tag</code>.
     */
    public void setModifyDayTag(Integer modifyDayTag) {
        this.modifyDayTag = modifyDayTag;
    }

    /**
     * Getter for <code>material.audit_video.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.audit_video.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditVideo (");

        sb.append(id);
        sb.append(", ").append(entityId);
        sb.append(", ").append(version);
        sb.append(", ").append(auditType);
        sb.append(", ").append(userId);
        sb.append(", ").append(auditState);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(reasonCode);
        sb.append(", ").append(reason);
        sb.append(", ").append(auditStartTime);
        sb.append(", ").append(auditEndTime);
        sb.append(", ").append(extend);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(modifyDayTag);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
