/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.pojos;


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
public class AuditSpecialAgent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          userId;
    private String        agentCsName;
    private Integer       state;
    private Long          operatorId;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditSpecialAgent() {}

    public AuditSpecialAgent(AuditSpecialAgent value) {
        this.id = value.id;
        this.userId = value.userId;
        this.agentCsName = value.agentCsName;
        this.state = value.state;
        this.operatorId = value.operatorId;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditSpecialAgent(
        Long          id,
        Long          userId,
        String        agentCsName,
        Integer       state,
        Long          operatorId,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.userId = userId;
        this.agentCsName = agentCsName;
        this.state = state;
        this.operatorId = operatorId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.agent_cs_name</code>.
     */
    public String getAgentCsName() {
        return this.agentCsName;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.agent_cs_name</code>.
     */
    public void setAgentCsName(String agentCsName) {
        this.agentCsName = agentCsName;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.operator_id</code>.
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.operator_id</code>.
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>naudit.audit_special_agent.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>naudit.audit_special_agent.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditSpecialAgent (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(agentCsName);
        sb.append(", ").append(state);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}