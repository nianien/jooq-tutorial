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
public class AuditPair implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          entityId;
    private Integer       entityType;
    private Long          version;
    private Long          targetId;
    private String        word;
    private String        reason;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditPair() {}

    public AuditPair(AuditPair value) {
        this.id = value.id;
        this.entityId = value.entityId;
        this.entityType = value.entityType;
        this.version = value.version;
        this.targetId = value.targetId;
        this.word = value.word;
        this.reason = value.reason;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditPair(
        Long          id,
        Long          entityId,
        Integer       entityType,
        Long          version,
        Long          targetId,
        String        word,
        String        reason,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.entityId = entityId;
        this.entityType = entityType;
        this.version = version;
        this.targetId = targetId;
        this.word = word;
        this.reason = reason;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.audit_pair.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.audit_pair.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.audit_pair.entity_id</code>.
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>material.audit_pair.entity_id</code>.
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * Getter for <code>material.audit_pair.entity_type</code>.
     */
    public Integer getEntityType() {
        return this.entityType;
    }

    /**
     * Setter for <code>material.audit_pair.entity_type</code>.
     */
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    /**
     * Getter for <code>material.audit_pair.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.audit_pair.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.audit_pair.target_id</code>.
     */
    public Long getTargetId() {
        return this.targetId;
    }

    /**
     * Setter for <code>material.audit_pair.target_id</code>.
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * Getter for <code>material.audit_pair.word</code>.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Setter for <code>material.audit_pair.word</code>.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Getter for <code>material.audit_pair.reason</code>.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>material.audit_pair.reason</code>.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for <code>material.audit_pair.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.audit_pair.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.audit_pair.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.audit_pair.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditPair (");

        sb.append(id);
        sb.append(", ").append(entityId);
        sb.append(", ").append(entityType);
        sb.append(", ").append(version);
        sb.append(", ").append(targetId);
        sb.append(", ").append(word);
        sb.append(", ").append(reason);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
