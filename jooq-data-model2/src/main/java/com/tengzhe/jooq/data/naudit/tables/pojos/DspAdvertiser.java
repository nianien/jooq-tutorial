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
public class DspAdvertiser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        name;
    private Long          userId;
    private String        userName;
    private Double        riskSampleRate;
    private Integer       riskSampleMax;
    private Double        nonRiskSampleRate;
    private Integer       nonRiskSampleMax;
    private String        sale;
    private String        saleEmail;
    private Long          operatorId;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public DspAdvertiser() {}

    public DspAdvertiser(DspAdvertiser value) {
        this.id = value.id;
        this.name = value.name;
        this.userId = value.userId;
        this.userName = value.userName;
        this.riskSampleRate = value.riskSampleRate;
        this.riskSampleMax = value.riskSampleMax;
        this.nonRiskSampleRate = value.nonRiskSampleRate;
        this.nonRiskSampleMax = value.nonRiskSampleMax;
        this.sale = value.sale;
        this.saleEmail = value.saleEmail;
        this.operatorId = value.operatorId;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public DspAdvertiser(
        Long          id,
        String        name,
        Long          userId,
        String        userName,
        Double        riskSampleRate,
        Integer       riskSampleMax,
        Double        nonRiskSampleRate,
        Integer       nonRiskSampleMax,
        String        sale,
        String        saleEmail,
        Long          operatorId,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.userName = userName;
        this.riskSampleRate = riskSampleRate;
        this.riskSampleMax = riskSampleMax;
        this.nonRiskSampleRate = nonRiskSampleRate;
        this.nonRiskSampleMax = nonRiskSampleMax;
        this.sale = sale;
        this.saleEmail = saleEmail;
        this.operatorId = operatorId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.user_name</code>.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.user_name</code>.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.risk_sample_rate</code>.
     */
    public Double getRiskSampleRate() {
        return this.riskSampleRate;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.risk_sample_rate</code>.
     */
    public void setRiskSampleRate(Double riskSampleRate) {
        this.riskSampleRate = riskSampleRate;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.risk_sample_max</code>.
     */
    public Integer getRiskSampleMax() {
        return this.riskSampleMax;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.risk_sample_max</code>.
     */
    public void setRiskSampleMax(Integer riskSampleMax) {
        this.riskSampleMax = riskSampleMax;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.non_risk_sample_rate</code>.
     */
    public Double getNonRiskSampleRate() {
        return this.nonRiskSampleRate;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.non_risk_sample_rate</code>.
     */
    public void setNonRiskSampleRate(Double nonRiskSampleRate) {
        this.nonRiskSampleRate = nonRiskSampleRate;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.non_risk_sample_max</code>.
     */
    public Integer getNonRiskSampleMax() {
        return this.nonRiskSampleMax;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.non_risk_sample_max</code>.
     */
    public void setNonRiskSampleMax(Integer nonRiskSampleMax) {
        this.nonRiskSampleMax = nonRiskSampleMax;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.sale</code>.
     */
    public String getSale() {
        return this.sale;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.sale</code>.
     */
    public void setSale(String sale) {
        this.sale = sale;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.sale_email</code>.
     */
    public String getSaleEmail() {
        return this.saleEmail;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.sale_email</code>.
     */
    public void setSaleEmail(String saleEmail) {
        this.saleEmail = saleEmail;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.operator_id</code>.
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.operator_id</code>.
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DspAdvertiser (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(riskSampleRate);
        sb.append(", ").append(riskSampleMax);
        sb.append(", ").append(nonRiskSampleRate);
        sb.append(", ").append(nonRiskSampleMax);
        sb.append(", ").append(sale);
        sb.append(", ").append(saleEmail);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}