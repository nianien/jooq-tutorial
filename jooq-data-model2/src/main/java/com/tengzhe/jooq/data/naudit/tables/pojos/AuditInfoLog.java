/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

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
public class AuditInfoLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Integer       date;
    private Integer       type;
    private Long          entityId;
    private String        bizType;
    private Integer       source;
    private String        companyName;
    private Long          agentId;
    private Integer       industry1;
    private Integer       industry2;
    private Integer       industry3;
    private String        auditResult;
    private Long          auditorId;
    private String        reasonCode;
    private Date          auditCostTime;
    private LocalDateTime createTime;

    public AuditInfoLog() {}

    public AuditInfoLog(AuditInfoLog value) {
        this.id = value.id;
        this.date = value.date;
        this.type = value.type;
        this.entityId = value.entityId;
        this.bizType = value.bizType;
        this.source = value.source;
        this.companyName = value.companyName;
        this.agentId = value.agentId;
        this.industry1 = value.industry1;
        this.industry2 = value.industry2;
        this.industry3 = value.industry3;
        this.auditResult = value.auditResult;
        this.auditorId = value.auditorId;
        this.reasonCode = value.reasonCode;
        this.auditCostTime = value.auditCostTime;
        this.createTime = value.createTime;
    }

    public AuditInfoLog(
        Long          id,
        Integer       date,
        Integer       type,
        Long          entityId,
        String        bizType,
        Integer       source,
        String        companyName,
        Long          agentId,
        Integer       industry1,
        Integer       industry2,
        Integer       industry3,
        String        auditResult,
        Long          auditorId,
        String        reasonCode,
        Date          auditCostTime,
        LocalDateTime createTime
    ) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.entityId = entityId;
        this.bizType = bizType;
        this.source = source;
        this.companyName = companyName;
        this.agentId = agentId;
        this.industry1 = industry1;
        this.industry2 = industry2;
        this.industry3 = industry3;
        this.auditResult = auditResult;
        this.auditorId = auditorId;
        this.reasonCode = reasonCode;
        this.auditCostTime = auditCostTime;
        this.createTime = createTime;
    }

    /**
     * Getter for <code>naudit.audit_info_log.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.audit_info_log.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.audit_info_log.date</code>.
     */
    public Integer getDate() {
        return this.date;
    }

    /**
     * Setter for <code>naudit.audit_info_log.date</code>.
     */
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * Getter for <code>naudit.audit_info_log.type</code>.
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>naudit.audit_info_log.type</code>.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>naudit.audit_info_log.entity_id</code>.
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>naudit.audit_info_log.entity_id</code>.
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * Getter for <code>naudit.audit_info_log.biz_type</code>.
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * Setter for <code>naudit.audit_info_log.biz_type</code>.
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * Getter for <code>naudit.audit_info_log.source</code>.
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * Setter for <code>naudit.audit_info_log.source</code>.
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * Getter for <code>naudit.audit_info_log.company_name</code>.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for <code>naudit.audit_info_log.company_name</code>.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for <code>naudit.audit_info_log.agent_id</code>.
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * Setter for <code>naudit.audit_info_log.agent_id</code>.
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Getter for <code>naudit.audit_info_log.industry1</code>.
     */
    public Integer getIndustry1() {
        return this.industry1;
    }

    /**
     * Setter for <code>naudit.audit_info_log.industry1</code>.
     */
    public void setIndustry1(Integer industry1) {
        this.industry1 = industry1;
    }

    /**
     * Getter for <code>naudit.audit_info_log.industry2</code>.
     */
    public Integer getIndustry2() {
        return this.industry2;
    }

    /**
     * Setter for <code>naudit.audit_info_log.industry2</code>.
     */
    public void setIndustry2(Integer industry2) {
        this.industry2 = industry2;
    }

    /**
     * Getter for <code>naudit.audit_info_log.industry3</code>.
     */
    public Integer getIndustry3() {
        return this.industry3;
    }

    /**
     * Setter for <code>naudit.audit_info_log.industry3</code>.
     */
    public void setIndustry3(Integer industry3) {
        this.industry3 = industry3;
    }

    /**
     * Getter for <code>naudit.audit_info_log.audit_result</code>.
     */
    public String getAuditResult() {
        return this.auditResult;
    }

    /**
     * Setter for <code>naudit.audit_info_log.audit_result</code>.
     */
    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    /**
     * Getter for <code>naudit.audit_info_log.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>naudit.audit_info_log.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>naudit.audit_info_log.reason_code</code>.
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * Setter for <code>naudit.audit_info_log.reason_code</code>.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for <code>naudit.audit_info_log.audit_cost_time</code>.
     */
    public Date getAuditCostTime() {
        return this.auditCostTime;
    }

    /**
     * Setter for <code>naudit.audit_info_log.audit_cost_time</code>.
     */
    public void setAuditCostTime(Date auditCostTime) {
        this.auditCostTime = auditCostTime;
    }

    /**
     * Getter for <code>naudit.audit_info_log.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>naudit.audit_info_log.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditInfoLog (");

        sb.append(id);
        sb.append(", ").append(date);
        sb.append(", ").append(type);
        sb.append(", ").append(entityId);
        sb.append(", ").append(bizType);
        sb.append(", ").append(source);
        sb.append(", ").append(companyName);
        sb.append(", ").append(agentId);
        sb.append(", ").append(industry1);
        sb.append(", ").append(industry2);
        sb.append(", ").append(industry3);
        sb.append(", ").append(auditResult);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(reasonCode);
        sb.append(", ").append(auditCostTime);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
