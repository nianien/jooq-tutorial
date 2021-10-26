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
public class AuditRuleSet implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Integer       entityType;
    private Integer       auditType;
    private Long          version;
    private Integer       state;
    private String        rule;
    private Integer       defaultAuditState;
    private String        description;
    private Long          auditorId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditRuleSet() {}

    public AuditRuleSet(AuditRuleSet value) {
        this.id = value.id;
        this.entityType = value.entityType;
        this.auditType = value.auditType;
        this.version = value.version;
        this.state = value.state;
        this.rule = value.rule;
        this.defaultAuditState = value.defaultAuditState;
        this.description = value.description;
        this.auditorId = value.auditorId;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditRuleSet(
        Long          id,
        Integer       entityType,
        Integer       auditType,
        Long          version,
        Integer       state,
        String        rule,
        Integer       defaultAuditState,
        String        description,
        Long          auditorId,
        LocalDateTime startTime,
        LocalDateTime endTime,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.entityType = entityType;
        this.auditType = auditType;
        this.version = version;
        this.state = state;
        this.rule = rule;
        this.defaultAuditState = defaultAuditState;
        this.description = description;
        this.auditorId = auditorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.audit_rule_set.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.audit_rule_set.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.audit_rule_set.entity_type</code>.
     */
    public Integer getEntityType() {
        return this.entityType;
    }

    /**
     * Setter for <code>material.audit_rule_set.entity_type</code>.
     */
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    /**
     * Getter for <code>material.audit_rule_set.audit_type</code>.
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * Setter for <code>material.audit_rule_set.audit_type</code>.
     */
    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    /**
     * Getter for <code>material.audit_rule_set.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.audit_rule_set.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.audit_rule_set.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.audit_rule_set.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.audit_rule_set.rule</code>.
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * Setter for <code>material.audit_rule_set.rule</code>.
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * Getter for <code>material.audit_rule_set.default_audit_state</code>.
     */
    public Integer getDefaultAuditState() {
        return this.defaultAuditState;
    }

    /**
     * Setter for <code>material.audit_rule_set.default_audit_state</code>.
     */
    public void setDefaultAuditState(Integer defaultAuditState) {
        this.defaultAuditState = defaultAuditState;
    }

    /**
     * Getter for <code>material.audit_rule_set.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>material.audit_rule_set.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>material.audit_rule_set.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>material.audit_rule_set.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>material.audit_rule_set.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Setter for <code>material.audit_rule_set.start_time</code>.
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for <code>material.audit_rule_set.end_time</code>.
     */
    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Setter for <code>material.audit_rule_set.end_time</code>.
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Getter for <code>material.audit_rule_set.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.audit_rule_set.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.audit_rule_set.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.audit_rule_set.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditRuleSet (");

        sb.append(id);
        sb.append(", ").append(entityType);
        sb.append(", ").append(auditType);
        sb.append(", ").append(version);
        sb.append(", ").append(state);
        sb.append(", ").append(rule);
        sb.append(", ").append(defaultAuditState);
        sb.append(", ").append(description);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}