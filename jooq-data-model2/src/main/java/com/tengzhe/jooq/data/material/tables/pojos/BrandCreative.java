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
public class BrandCreative implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          userId;
    private String        name;
    private Integer       media;
    private Integer       resourceType;
    private Integer       adStyleId;
    private Integer       adStyleType;
    private String        content;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private Long          createUserId;
    private LocalDateTime createTime;
    private Long          modifyUserId;
    private LocalDateTime modifyTime;

    public BrandCreative() {}

    public BrandCreative(BrandCreative value) {
        this.id = value.id;
        this.userId = value.userId;
        this.name = value.name;
        this.media = value.media;
        this.resourceType = value.resourceType;
        this.adStyleId = value.adStyleId;
        this.adStyleType = value.adStyleType;
        this.content = value.content;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.createUserId = value.createUserId;
        this.createTime = value.createTime;
        this.modifyUserId = value.modifyUserId;
        this.modifyTime = value.modifyTime;
    }

    public BrandCreative(
        Long          id,
        Long          userId,
        String        name,
        Integer       media,
        Integer       resourceType,
        Integer       adStyleId,
        Integer       adStyleType,
        String        content,
        Integer       logicState,
        Long          version,
        Integer       state,
        Integer       stateDetail,
        Long          createUserId,
        LocalDateTime createTime,
        Long          modifyUserId,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.media = media;
        this.resourceType = resourceType;
        this.adStyleId = adStyleId;
        this.adStyleType = adStyleType;
        this.content = content;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.modifyUserId = modifyUserId;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.brand_creative.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.brand_creative.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.brand_creative.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.brand_creative.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.brand_creative.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>material.brand_creative.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>material.brand_creative.media</code>.
     */
    public Integer getMedia() {
        return this.media;
    }

    /**
     * Setter for <code>material.brand_creative.media</code>.
     */
    public void setMedia(Integer media) {
        this.media = media;
    }

    /**
     * Getter for <code>material.brand_creative.resource_type</code>.
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * Setter for <code>material.brand_creative.resource_type</code>.
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Getter for <code>material.brand_creative.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return this.adStyleId;
    }

    /**
     * Setter for <code>material.brand_creative.ad_style_id</code>.
     */
    public void setAdStyleId(Integer adStyleId) {
        this.adStyleId = adStyleId;
    }

    /**
     * Getter for <code>material.brand_creative.ad_style_type</code>.
     */
    public Integer getAdStyleType() {
        return this.adStyleType;
    }

    /**
     * Setter for <code>material.brand_creative.ad_style_type</code>.
     */
    public void setAdStyleType(Integer adStyleType) {
        this.adStyleType = adStyleType;
    }

    /**
     * Getter for <code>material.brand_creative.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>material.brand_creative.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>material.brand_creative.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.brand_creative.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.brand_creative.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.brand_creative.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.brand_creative.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.brand_creative.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.brand_creative.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for <code>material.brand_creative.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for <code>material.brand_creative.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return this.createUserId;
    }

    /**
     * Setter for <code>material.brand_creative.create_user_id</code>.
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * Getter for <code>material.brand_creative.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.brand_creative.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.brand_creative.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * Setter for <code>material.brand_creative.modify_user_id</code>.
     */
    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    /**
     * Getter for <code>material.brand_creative.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.brand_creative.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BrandCreative (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(name);
        sb.append(", ").append(media);
        sb.append(", ").append(resourceType);
        sb.append(", ").append(adStyleId);
        sb.append(", ").append(adStyleType);
        sb.append(", ").append(content);
        sb.append(", ").append(logicState);
        sb.append(", ").append(version);
        sb.append(", ").append(state);
        sb.append(", ").append(stateDetail);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyUserId);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
