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
public class SitePage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          userId;
    private String        name;
    private String        title;
    private String        snapshot;
    private String        innerUrl;
    private Integer       appid;
    private Integer       logicState;
    private Long          version;
    private Integer       state;
    private Integer       stateDetail;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public SitePage() {}

    public SitePage(SitePage value) {
        this.id = value.id;
        this.userId = value.userId;
        this.name = value.name;
        this.title = value.title;
        this.snapshot = value.snapshot;
        this.innerUrl = value.innerUrl;
        this.appid = value.appid;
        this.logicState = value.logicState;
        this.version = value.version;
        this.state = value.state;
        this.stateDetail = value.stateDetail;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public SitePage(
        Long          id,
        Long          userId,
        String        name,
        String        title,
        String        snapshot,
        String        innerUrl,
        Integer       appid,
        Integer       logicState,
        Long          version,
        Integer       state,
        Integer       stateDetail,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.title = title;
        this.snapshot = snapshot;
        this.innerUrl = innerUrl;
        this.appid = appid;
        this.logicState = logicState;
        this.version = version;
        this.state = state;
        this.stateDetail = stateDetail;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.site_page.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.site_page.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.site_page.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.site_page.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.site_page.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>material.site_page.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>material.site_page.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>material.site_page.title</code>.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for <code>material.site_page.snapshot</code>.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Setter for <code>material.site_page.snapshot</code>.
     */
    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * Getter for <code>material.site_page.inner_url</code>.
     */
    public String getInnerUrl() {
        return this.innerUrl;
    }

    /**
     * Setter for <code>material.site_page.inner_url</code>.
     */
    public void setInnerUrl(String innerUrl) {
        this.innerUrl = innerUrl;
    }

    /**
     * Getter for <code>material.site_page.appid</code>.
     */
    public Integer getAppid() {
        return this.appid;
    }

    /**
     * Setter for <code>material.site_page.appid</code>.
     */
    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    /**
     * Getter for <code>material.site_page.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.site_page.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.site_page.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>material.site_page.version</code>.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Getter for <code>material.site_page.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>material.site_page.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>material.site_page.state_detail</code>.
     */
    public Integer getStateDetail() {
        return this.stateDetail;
    }

    /**
     * Setter for <code>material.site_page.state_detail</code>.
     */
    public void setStateDetail(Integer stateDetail) {
        this.stateDetail = stateDetail;
    }

    /**
     * Getter for <code>material.site_page.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.site_page.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.site_page.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.site_page.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SitePage (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(name);
        sb.append(", ").append(title);
        sb.append(", ").append(snapshot);
        sb.append(", ").append(innerUrl);
        sb.append(", ").append(appid);
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