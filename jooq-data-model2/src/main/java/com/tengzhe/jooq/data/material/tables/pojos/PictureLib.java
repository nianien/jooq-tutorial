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
public class PictureLib implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          userId;
    private String        imageUrl;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public PictureLib() {}

    public PictureLib(PictureLib value) {
        this.id = value.id;
        this.userId = value.userId;
        this.imageUrl = value.imageUrl;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public PictureLib(
        Long          id,
        Long          userId,
        String        imageUrl,
        Integer       logicState,
        Long          version,
        Integer       state,
        Integer       stateDetail,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.userId = userId;
        this.imageUrl = imageUrl;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.picture_lib.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.picture_lib.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.picture_lib.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.picture_lib.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.picture_lib.image_url</code>.
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * Setter for <code>material.picture_lib.image_url</code>.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for <code>material.picture_lib.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.picture_lib.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.picture_lib.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.picture_lib.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.picture_lib.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.picture_lib.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.picture_lib.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for <code>material.picture_lib.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for <code>material.picture_lib.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.picture_lib.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.picture_lib.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.picture_lib.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PictureLib (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(imageUrl);
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
