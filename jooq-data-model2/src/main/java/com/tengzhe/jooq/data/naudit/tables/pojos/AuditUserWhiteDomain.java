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
public class AuditUserWhiteDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       type;
    private Long          userId;
    private String        domain;
    private String        url;
    private String        urlMd5;
    private Integer       state;
    private Long          operatorId;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditUserWhiteDomain() {}

    public AuditUserWhiteDomain(AuditUserWhiteDomain value) {
        this.id = value.id;
        this.type = value.type;
        this.userId = value.userId;
        this.domain = value.domain;
        this.url = value.url;
        this.urlMd5 = value.urlMd5;
        this.state = value.state;
        this.operatorId = value.operatorId;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditUserWhiteDomain(
        Integer       id,
        Integer       type,
        Long          userId,
        String        domain,
        String        url,
        String        urlMd5,
        Integer       state,
        Long          operatorId,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.type = type;
        this.userId = userId;
        this.domain = domain;
        this.url = url;
        this.urlMd5 = urlMd5;
        this.state = state;
        this.operatorId = operatorId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.type</code>.
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.type</code>.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.domain</code>.
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.domain</code>.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.url</code>.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.url</code>.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.url_md5</code>.
     */
    public String getUrlMd5() {
        return this.urlMd5;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.url_md5</code>.
     */
    public void setUrlMd5(String urlMd5) {
        this.urlMd5 = urlMd5;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.operator_id</code>.
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.operator_id</code>.
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>naudit.audit_user_white_domain.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>naudit.audit_user_white_domain.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditUserWhiteDomain (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(userId);
        sb.append(", ").append(domain);
        sb.append(", ").append(url);
        sb.append(", ").append(urlMd5);
        sb.append(", ").append(state);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
