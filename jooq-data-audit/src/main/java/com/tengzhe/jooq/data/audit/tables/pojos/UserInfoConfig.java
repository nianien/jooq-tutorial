/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit.tables.pojos;


import java.io.Serializable;
import java.util.Date;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long userid;
    private Long priority;
    private Long maxVersion;
    private Long minVersion;
    private Date createTime;
    private Date modifyTime;
    private Long auditorId;

    public UserInfoConfig() {}

    public UserInfoConfig(UserInfoConfig value) {
        this.id = value.id;
        this.userid = value.userid;
        this.priority = value.priority;
        this.maxVersion = value.maxVersion;
        this.minVersion = value.minVersion;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.auditorId = value.auditorId;
    }

    public UserInfoConfig(
        Long id,
        Long userid,
        Long priority,
        Long maxVersion,
        Long minVersion,
        Date createTime,
        Date modifyTime,
        Long auditorId
    ) {
        this.id = id;
        this.userid = userid;
        this.priority = priority;
        this.maxVersion = maxVersion;
        this.minVersion = minVersion;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>audit.user_info_config.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit.user_info_config.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit.user_info_config.userid</code>.
     */
    public Long getUserid() {
        return this.userid;
    }

    /**
     * Setter for <code>audit.user_info_config.userid</code>.
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * Getter for <code>audit.user_info_config.priority</code>.
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * Setter for <code>audit.user_info_config.priority</code>.
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * Getter for <code>audit.user_info_config.max_version</code>.
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * Setter for <code>audit.user_info_config.max_version</code>.
     */
    public void setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
     * Getter for <code>audit.user_info_config.min_version</code>.
     */
    public Long getMinVersion() {
        return this.minVersion;
    }

    /**
     * Setter for <code>audit.user_info_config.min_version</code>.
     */
    public void setMinVersion(Long minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * Getter for <code>audit.user_info_config.create_time</code>.
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit.user_info_config.create_time</code>.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit.user_info_config.modify_time</code>.
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit.user_info_config.modify_time</code>.
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit.user_info_config.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>audit.user_info_config.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfoConfig (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(priority);
        sb.append(", ").append(maxVersion);
        sb.append(", ").append(minVersion);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(auditorId);

        sb.append(")");
        return sb.toString();
    }
}
