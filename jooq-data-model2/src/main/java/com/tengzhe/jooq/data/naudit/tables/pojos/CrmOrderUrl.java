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
public class CrmOrderUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          orderId;
    private Long          urlId;
    private Integer       type;
    private Long          cid;
    private Long          agentId;
    private Integer       industry1;
    private Integer       industry2;
    private Integer       industry3;
    private String        companyName;
    private String        siteName;
    private String        siteUrl;
    private String        bizTypes;
    private String        content;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Integer       state;
    private Long          auditorId;
    private LocalDateTime auditTime;
    private LocalDateTime assignTime;
    private Integer       _Flag;

    public CrmOrderUrl() {}

    public CrmOrderUrl(CrmOrderUrl value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.urlId = value.urlId;
        this.type = value.type;
        this.cid = value.cid;
        this.agentId = value.agentId;
        this.industry1 = value.industry1;
        this.industry2 = value.industry2;
        this.industry3 = value.industry3;
        this.companyName = value.companyName;
        this.siteName = value.siteName;
        this.siteUrl = value.siteUrl;
        this.bizTypes = value.bizTypes;
        this.content = value.content;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.state = value.state;
        this.auditorId = value.auditorId;
        this.auditTime = value.auditTime;
        this.assignTime = value.assignTime;
        this._Flag = value._Flag;
    }

    public CrmOrderUrl(
        Long          id,
        Long          orderId,
        Long          urlId,
        Integer       type,
        Long          cid,
        Long          agentId,
        Integer       industry1,
        Integer       industry2,
        Integer       industry3,
        String        companyName,
        String        siteName,
        String        siteUrl,
        String        bizTypes,
        String        content,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Integer       state,
        Long          auditorId,
        LocalDateTime auditTime,
        LocalDateTime assignTime,
        Integer       _Flag
    ) {
        this.id = id;
        this.orderId = orderId;
        this.urlId = urlId;
        this.type = type;
        this.cid = cid;
        this.agentId = agentId;
        this.industry1 = industry1;
        this.industry2 = industry2;
        this.industry3 = industry3;
        this.companyName = companyName;
        this.siteName = siteName;
        this.siteUrl = siteUrl;
        this.bizTypes = bizTypes;
        this.content = content;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.auditorId = auditorId;
        this.auditTime = auditTime;
        this.assignTime = assignTime;
        this._Flag = _Flag;
    }

    /**
     * Getter for <code>naudit.crm_order_url.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.crm_order_url.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.crm_order_url.order_id</code>.
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>naudit.crm_order_url.order_id</code>.
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter for <code>naudit.crm_order_url.url_id</code>.
     */
    public Long getUrlId() {
        return this.urlId;
    }

    /**
     * Setter for <code>naudit.crm_order_url.url_id</code>.
     */
    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    /**
     * Getter for <code>naudit.crm_order_url.type</code>.
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>naudit.crm_order_url.type</code>.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>naudit.crm_order_url.cid</code>.
     */
    public Long getCid() {
        return this.cid;
    }

    /**
     * Setter for <code>naudit.crm_order_url.cid</code>.
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * Getter for <code>naudit.crm_order_url.agent_id</code>.
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * Setter for <code>naudit.crm_order_url.agent_id</code>.
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Getter for <code>naudit.crm_order_url.industry1</code>.
     */
    public Integer getIndustry1() {
        return this.industry1;
    }

    /**
     * Setter for <code>naudit.crm_order_url.industry1</code>.
     */
    public void setIndustry1(Integer industry1) {
        this.industry1 = industry1;
    }

    /**
     * Getter for <code>naudit.crm_order_url.industry2</code>.
     */
    public Integer getIndustry2() {
        return this.industry2;
    }

    /**
     * Setter for <code>naudit.crm_order_url.industry2</code>.
     */
    public void setIndustry2(Integer industry2) {
        this.industry2 = industry2;
    }

    /**
     * Getter for <code>naudit.crm_order_url.industry3</code>.
     */
    public Integer getIndustry3() {
        return this.industry3;
    }

    /**
     * Setter for <code>naudit.crm_order_url.industry3</code>.
     */
    public void setIndustry3(Integer industry3) {
        this.industry3 = industry3;
    }

    /**
     * Getter for <code>naudit.crm_order_url.company_name</code>.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for <code>naudit.crm_order_url.company_name</code>.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for <code>naudit.crm_order_url.site_name</code>.
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * Setter for <code>naudit.crm_order_url.site_name</code>.
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Getter for <code>naudit.crm_order_url.site_url</code>.
     */
    public String getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * Setter for <code>naudit.crm_order_url.site_url</code>.
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * Getter for <code>naudit.crm_order_url.biz_types</code>.
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * Setter for <code>naudit.crm_order_url.biz_types</code>.
     */
    public void setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
    }

    /**
     * Getter for <code>naudit.crm_order_url.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>naudit.crm_order_url.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>naudit.crm_order_url.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>naudit.crm_order_url.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>naudit.crm_order_url.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>naudit.crm_order_url.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>naudit.crm_order_url.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>naudit.crm_order_url.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * Getter for <code>naudit.crm_order_url.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>naudit.crm_order_url.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>naudit.crm_order_url.audit_time</code>.
     */
    public LocalDateTime getAuditTime() {
        return this.auditTime;
    }

    /**
     * Setter for <code>naudit.crm_order_url.audit_time</code>.
     */
    public void setAuditTime(LocalDateTime auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * Getter for <code>naudit.crm_order_url.assign_time</code>.
     */
    public LocalDateTime getAssignTime() {
        return this.assignTime;
    }

    /**
     * Setter for <code>naudit.crm_order_url.assign_time</code>.
     */
    public void setAssignTime(LocalDateTime assignTime) {
        this.assignTime = assignTime;
    }

    /**
     * Getter for <code>naudit.crm_order_url._flag</code>.
     */
    public Integer get_Flag() {
        return this._Flag;
    }

    /**
     * Setter for <code>naudit.crm_order_url._flag</code>.
     */
    public void set_Flag(Integer _Flag) {
        this._Flag = _Flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CrmOrderUrl (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(urlId);
        sb.append(", ").append(type);
        sb.append(", ").append(cid);
        sb.append(", ").append(agentId);
        sb.append(", ").append(industry1);
        sb.append(", ").append(industry2);
        sb.append(", ").append(industry3);
        sb.append(", ").append(companyName);
        sb.append(", ").append(siteName);
        sb.append(", ").append(siteUrl);
        sb.append(", ").append(bizTypes);
        sb.append(", ").append(content);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(state);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(auditTime);
        sb.append(", ").append(assignTime);
        sb.append(", ").append(_Flag);

        sb.append(")");
        return sb.toString();
    }
}
