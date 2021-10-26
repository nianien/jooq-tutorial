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
public class AraHcCreativeRiskDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        tagName;
    private Integer       tagTarget;
    private Long          creativeId;
    private Integer       dt;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AraHcCreativeRiskDetail() {}

    public AraHcCreativeRiskDetail(AraHcCreativeRiskDetail value) {
        this.id = value.id;
        this.tagName = value.tagName;
        this.tagTarget = value.tagTarget;
        this.creativeId = value.creativeId;
        this.dt = value.dt;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AraHcCreativeRiskDetail(
        Long          id,
        String        tagName,
        Integer       tagTarget,
        Long          creativeId,
        Integer       dt,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.tagName = tagName;
        this.tagTarget = tagTarget;
        this.creativeId = creativeId;
        this.dt = dt;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.tag_name</code>.
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.tag_name</code>.
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.tag_target</code>.
     */
    public Integer getTagTarget() {
        return this.tagTarget;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.tag_target</code>.
     */
    public void setTagTarget(Integer tagTarget) {
        this.tagTarget = tagTarget;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.creative_id</code>.
     */
    public Long getCreativeId() {
        return this.creativeId;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.creative_id</code>.
     */
    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.dt</code>.
     */
    public Integer getDt() {
        return this.dt;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.dt</code>.
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.ara_hc_creative_risk_detail.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.ara_hc_creative_risk_detail.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AraHcCreativeRiskDetail (");

        sb.append(id);
        sb.append(", ").append(tagName);
        sb.append(", ").append(tagTarget);
        sb.append(", ").append(creativeId);
        sb.append(", ").append(dt);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
