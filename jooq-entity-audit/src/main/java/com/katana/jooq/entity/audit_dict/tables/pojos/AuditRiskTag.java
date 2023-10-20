/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables.pojos;


import java.io.Serializable;
import java.util.Date;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditRiskTag implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private String  code;
    private Integer target;
    private String  reasonDetail;
    private Integer additional;
    private Integer strategyFlag;
    private Integer enabled;
    private String  remark;
    private Long    operatorId;
    private Integer seq;
    private Date    createTime;
    private Date    modifyTime;

    public AuditRiskTag() {}

    public AuditRiskTag(AuditRiskTag value) {
        this.id = value.id;
        this.code = value.code;
        this.target = value.target;
        this.reasonDetail = value.reasonDetail;
        this.additional = value.additional;
        this.strategyFlag = value.strategyFlag;
        this.enabled = value.enabled;
        this.remark = value.remark;
        this.operatorId = value.operatorId;
        this.seq = value.seq;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditRiskTag(
        Long    id,
        String  code,
        Integer target,
        String  reasonDetail,
        Integer additional,
        Integer strategyFlag,
        Integer enabled,
        String  remark,
        Long    operatorId,
        Integer seq,
        Date    createTime,
        Date    modifyTime
    ) {
        this.id = id;
        this.code = code;
        this.target = target;
        this.reasonDetail = reasonDetail;
        this.additional = additional;
        this.strategyFlag = strategyFlag;
        this.enabled = enabled;
        this.remark = remark;
        this.operatorId = operatorId;
        this.seq = seq;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.code</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.target</code>.
     */
    public Integer getTarget() {
        return this.target;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.target</code>.
     */
    public void setTarget(Integer target) {
        this.target = target;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.reason_detail</code>.
     */
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.reason_detail</code>.
     */
    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.additional</code>.
     */
    public Integer getAdditional() {
        return this.additional;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.additional</code>.
     */
    public void setAdditional(Integer additional) {
        this.additional = additional;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.strategy_flag</code>.
     */
    public Integer getStrategyFlag() {
        return this.strategyFlag;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.strategy_flag</code>.
     */
    public void setStrategyFlag(Integer strategyFlag) {
        this.strategyFlag = strategyFlag;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.enabled</code>.
     */
    public Integer getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.enabled</code>.
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.operator_id</code>.
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.operator_id</code>.
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.seq</code>.
     */
    public Integer getSeq() {
        return this.seq;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.seq</code>.
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.create_time</code>.
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.create_time</code>.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_dict.audit_risk_tag.modify_time</code>.
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_dict.audit_risk_tag.modify_time</code>.
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditRiskTag (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(target);
        sb.append(", ").append(reasonDetail);
        sb.append(", ").append(additional);
        sb.append(", ").append(strategyFlag);
        sb.append(", ").append(enabled);
        sb.append(", ").append(remark);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(seq);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
