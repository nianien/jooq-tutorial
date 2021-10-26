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
public class CptQmxingIdea implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          ucId;
    private Long          userId;
    private Long          contractId;
    private Long          planId;
    private Integer       styleType;
    private String        brandName;
    private String        corpName;
    private String        keywords;
    private String        regions;
    private String        expectDeployTime;
    private String        realDeployTime;
    private String        content;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public CptQmxingIdea() {}

    public CptQmxingIdea(CptQmxingIdea value) {
        this.id = value.id;
        this.ucId = value.ucId;
        this.userId = value.userId;
        this.contractId = value.contractId;
        this.planId = value.planId;
        this.styleType = value.styleType;
        this.brandName = value.brandName;
        this.corpName = value.corpName;
        this.keywords = value.keywords;
        this.regions = value.regions;
        this.expectDeployTime = value.expectDeployTime;
        this.realDeployTime = value.realDeployTime;
        this.content = value.content;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public CptQmxingIdea(
        Long          id,
        Long          ucId,
        Long          userId,
        Long          contractId,
        Long          planId,
        Integer       styleType,
        String        brandName,
        String        corpName,
        String        keywords,
        String        regions,
        String        expectDeployTime,
        String        realDeployTime,
        String        content,
        Integer       logicState,
        Long          version,
        Integer       state,
        Integer       stateDetail,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.ucId = ucId;
        this.userId = userId;
        this.contractId = contractId;
        this.planId = planId;
        this.styleType = styleType;
        this.brandName = brandName;
        this.corpName = corpName;
        this.keywords = keywords;
        this.regions = regions;
        this.expectDeployTime = expectDeployTime;
        this.realDeployTime = realDeployTime;
        this.content = content;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.uc_id</code>.
     */
    public Long getUcId() {
        return this.ucId;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.uc_id</code>.
     */
    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.contract_id</code>.
     */
    public Long getContractId() {
        return this.contractId;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.contract_id</code>.
     */
    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.plan_id</code>.
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.plan_id</code>.
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.style_type</code>.
     */
    public Integer getStyleType() {
        return this.styleType;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.style_type</code>.
     */
    public void setStyleType(Integer styleType) {
        this.styleType = styleType;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.brand_name</code>.
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.brand_name</code>.
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.corp_name</code>.
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.corp_name</code>.
     */
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.keywords</code>.
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.keywords</code>.
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.regions</code>.
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.regions</code>.
     */
    public void setRegions(String regions) {
        this.regions = regions;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.expect_deploy_time</code>.
     */
    public String getExpectDeployTime() {
        return this.expectDeployTime;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.expect_deploy_time</code>.
     */
    public void setExpectDeployTime(String expectDeployTime) {
        this.expectDeployTime = expectDeployTime;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.real_deploy_time</code>.
     */
    public String getRealDeployTime() {
        return this.realDeployTime;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.real_deploy_time</code>.
     */
    public void setRealDeployTime(String realDeployTime) {
        this.realDeployTime = realDeployTime;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.cpt_qmxing_idea.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.cpt_qmxing_idea.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CptQmxingIdea (");

        sb.append(id);
        sb.append(", ").append(ucId);
        sb.append(", ").append(userId);
        sb.append(", ").append(contractId);
        sb.append(", ").append(planId);
        sb.append(", ").append(styleType);
        sb.append(", ").append(brandName);
        sb.append(", ").append(corpName);
        sb.append(", ").append(keywords);
        sb.append(", ").append(regions);
        sb.append(", ").append(expectDeployTime);
        sb.append(", ").append(realDeployTime);
        sb.append(", ").append(content);
        sb.append(", ").append(logicState);
        sb.append(", ").append(version);
        sb.append(", ").append(state);
        sb.append(", ").append(stateDetail);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}