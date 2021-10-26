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
public class AttachCreative implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          ucId;
    private Long          userId;
    private Long          groupId;
    private Long          campaignId;
    private String        description;
    private Integer       extraStyleId;
    private Long          componentId;
    private String        content;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AttachCreative() {}

    public AttachCreative(AttachCreative value) {
        this.id = value.id;
        this.ucId = value.ucId;
        this.userId = value.userId;
        this.groupId = value.groupId;
        this.campaignId = value.campaignId;
        this.description = value.description;
        this.extraStyleId = value.extraStyleId;
        this.componentId = value.componentId;
        this.content = value.content;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AttachCreative(
        Long          id,
        Long          ucId,
        Long          userId,
        Long          groupId,
        Long          campaignId,
        String        description,
        Integer       extraStyleId,
        Long          componentId,
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
        this.groupId = groupId;
        this.campaignId = campaignId;
        this.description = description;
        this.extraStyleId = extraStyleId;
        this.componentId = componentId;
        this.content = content;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.attach_creative.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.attach_creative.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.attach_creative.uc_id</code>.
     */
    public Long getUcId() {
        return this.ucId;
    }

    /**
     * Setter for <code>material.attach_creative.uc_id</code>.
     */
    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    /**
     * Getter for <code>material.attach_creative.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.attach_creative.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.attach_creative.group_id</code>.
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>material.attach_creative.group_id</code>.
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * Getter for <code>material.attach_creative.campaign_id</code>.
     */
    public Long getCampaignId() {
        return this.campaignId;
    }

    /**
     * Setter for <code>material.attach_creative.campaign_id</code>.
     */
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for <code>material.attach_creative.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>material.attach_creative.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>material.attach_creative.extra_style_id</code>.
     */
    public Integer getExtraStyleId() {
        return this.extraStyleId;
    }

    /**
     * Setter for <code>material.attach_creative.extra_style_id</code>.
     */
    public void setExtraStyleId(Integer extraStyleId) {
        this.extraStyleId = extraStyleId;
    }

    /**
     * Getter for <code>material.attach_creative.component_id</code>.
     */
    public Long getComponentId() {
        return this.componentId;
    }

    /**
     * Setter for <code>material.attach_creative.component_id</code>.
     */
    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for <code>material.attach_creative.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>material.attach_creative.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>material.attach_creative.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.attach_creative.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.attach_creative.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.attach_creative.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.attach_creative.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.attach_creative.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.attach_creative.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for <code>material.attach_creative.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for <code>material.attach_creative.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.attach_creative.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.attach_creative.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.attach_creative.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AttachCreative (");

        sb.append(id);
        sb.append(", ").append(ucId);
        sb.append(", ").append(userId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(campaignId);
        sb.append(", ").append(description);
        sb.append(", ").append(extraStyleId);
        sb.append(", ").append(componentId);
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