/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.pojos;


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
public class AccountLogoStateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          userId;
    private Integer       state;
    private Long          auditorId;
    private LocalDateTime auditTime;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Integer       manualState;
    private String        manualReason;
    private Long          manualAuditorId;
    private LocalDateTime manualAuditTime;
    private Long          manualVersion;

    public AccountLogoStateInfo() {}

    public AccountLogoStateInfo(AccountLogoStateInfo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.state = value.state;
        this.auditorId = value.auditorId;
        this.auditTime = value.auditTime;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.manualState = value.manualState;
        this.manualReason = value.manualReason;
        this.manualAuditorId = value.manualAuditorId;
        this.manualAuditTime = value.manualAuditTime;
        this.manualVersion = value.manualVersion;
    }

    public AccountLogoStateInfo(
        Long          id,
        Long          userId,
        Integer       state,
        Long          auditorId,
        LocalDateTime auditTime,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Integer       manualState,
        String        manualReason,
        Long          manualAuditorId,
        LocalDateTime manualAuditTime,
        Long          manualVersion
    ) {
        this.id = id;
        this.userId = userId;
        this.state = state;
        this.auditorId = auditorId;
        this.auditTime = auditTime;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.manualState = manualState;
        this.manualReason = manualReason;
        this.manualAuditorId = manualAuditorId;
        this.manualAuditTime = manualAuditTime;
        this.manualVersion = manualVersion;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.audit_time</code>.
     */
    public LocalDateTime getAuditTime() {
        return this.auditTime;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.audit_time</code>.
     */
    public void setAuditTime(LocalDateTime auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_wolong.account_logo_state_info.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_wolong.account_logo_state_info.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for
     * <code>audit_wolong.account_logo_state_info.manual_state</code>.
     */
    public Integer getManualState() {
        return this.manualState;
    }

    /**
     * Setter for
     * <code>audit_wolong.account_logo_state_info.manual_state</code>.
     */
    public void setManualState(Integer manualState) {
        this.manualState = manualState;
    }

    /**
     * Getter for
     * <code>audit_wolong.account_logo_state_info.manual_reason</code>.
     */
    public String getManualReason() {
        return this.manualReason;
    }

    /**
     * Setter for
     * <code>audit_wolong.account_logo_state_info.manual_reason</code>.
     */
    public void setManualReason(String manualReason) {
        this.manualReason = manualReason;
    }

    /**
     * Getter for
     * <code>audit_wolong.account_logo_state_info.manual_auditor_id</code>.
     */
    public Long getManualAuditorId() {
        return this.manualAuditorId;
    }

    /**
     * Setter for
     * <code>audit_wolong.account_logo_state_info.manual_auditor_id</code>.
     */
    public void setManualAuditorId(Long manualAuditorId) {
        this.manualAuditorId = manualAuditorId;
    }

    /**
     * Getter for
     * <code>audit_wolong.account_logo_state_info.manual_audit_time</code>.
     */
    public LocalDateTime getManualAuditTime() {
        return this.manualAuditTime;
    }

    /**
     * Setter for
     * <code>audit_wolong.account_logo_state_info.manual_audit_time</code>.
     */
    public void setManualAuditTime(LocalDateTime manualAuditTime) {
        this.manualAuditTime = manualAuditTime;
    }

    /**
     * Getter for
     * <code>audit_wolong.account_logo_state_info.manual_version</code>.
     */
    public Long getManualVersion() {
        return this.manualVersion;
    }

    /**
     * Setter for
     * <code>audit_wolong.account_logo_state_info.manual_version</code>.
     */
    public void setManualVersion(Long manualVersion) {
        this.manualVersion = manualVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AccountLogoStateInfo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(state);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(auditTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(manualState);
        sb.append(", ").append(manualReason);
        sb.append(", ").append(manualAuditorId);
        sb.append(", ").append(manualAuditTime);
        sb.append(", ").append(manualVersion);

        sb.append(")");
        return sb.toString();
    }
}
