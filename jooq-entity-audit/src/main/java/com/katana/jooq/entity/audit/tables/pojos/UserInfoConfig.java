/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit.tables.pojos;


import java.io.Serializable;
import java.util.Date;


/**
 * 用户配置表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoConfig implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    private Long   id;

    /**
     * 用户id
     */
    private Long   userid;

    /**
     * 优先级：-1表示搁置、0正常、&gt;0表示优审，优审账户的物料会被优先领取（priority desc）
     */
    private Long   priority;

    /**
     * 最大版本号
     */
    private Long   maxVersion;

    /**
     * 最小版本，主要是在领单时用，min_version越小表示需要优先领取
     */
    private Long   minVersion;

    /**
     * 创建时间
     */
    private Date   createTime;

    /**
     * 修改时间
     */
    private Date   modifyTime;

    /**
     * 审核员id:-1表示未被任何审核员修改优先级，&gt;0表示最后修改优先级的审核员id
     */
    private Long   auditorId;

    /**
     * 环境
     */
    private String env;

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
        this.env = value.env;
    }

    public UserInfoConfig(
        Long   id,
        Long   userid,
        Long   priority,
        Long   maxVersion,
        Long   minVersion,
        Date   createTime,
        Date   modifyTime,
        Long   auditorId,
        String env
    ) {
        this.id = id;
        this.userid = userid;
        this.priority = priority;
        this.maxVersion = maxVersion;
        this.minVersion = minVersion;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.auditorId = auditorId;
        this.env = env;
    }

    /**
     * Getter for <code>audit.user_info_config.id</code>. 主键
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit.user_info_config.id</code>. 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit.user_info_config.userid</code>. 用户id
     */
    public Long getUserid() {
        return this.userid;
    }

    /**
     * Setter for <code>audit.user_info_config.userid</code>. 用户id
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * Getter for <code>audit.user_info_config.priority</code>.
     * 优先级：-1表示搁置、0正常、&gt;0表示优审，优审账户的物料会被优先领取（priority desc）
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * Setter for <code>audit.user_info_config.priority</code>.
     * 优先级：-1表示搁置、0正常、&gt;0表示优审，优审账户的物料会被优先领取（priority desc）
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * Getter for <code>audit.user_info_config.max_version</code>. 最大版本号
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * Setter for <code>audit.user_info_config.max_version</code>. 最大版本号
     */
    public void setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
     * Getter for <code>audit.user_info_config.min_version</code>.
     * 最小版本，主要是在领单时用，min_version越小表示需要优先领取
     */
    public Long getMinVersion() {
        return this.minVersion;
    }

    /**
     * Setter for <code>audit.user_info_config.min_version</code>.
     * 最小版本，主要是在领单时用，min_version越小表示需要优先领取
     */
    public void setMinVersion(Long minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * Getter for <code>audit.user_info_config.create_time</code>. 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit.user_info_config.create_time</code>. 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit.user_info_config.modify_time</code>. 修改时间
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit.user_info_config.modify_time</code>. 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit.user_info_config.auditor_id</code>.
     * 审核员id:-1表示未被任何审核员修改优先级，&gt;0表示最后修改优先级的审核员id
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>audit.user_info_config.auditor_id</code>.
     * 审核员id:-1表示未被任何审核员修改优先级，&gt;0表示最后修改优先级的审核员id
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>audit.user_info_config.env</code>. 环境
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * Setter for <code>audit.user_info_config.env</code>. 环境
     */
    public void setEnv(String env) {
        this.env = env;
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
        sb.append(", ").append(env);

        sb.append(")");
        return sb.toString();
    }
}
