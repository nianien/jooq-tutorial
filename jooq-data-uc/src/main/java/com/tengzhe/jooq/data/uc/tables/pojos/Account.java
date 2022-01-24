/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.uc.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private String  name;
    private Long    userId;
    private String  shortName;
    private Integer appId;
    private Integer createSource;
    private String  productName;
    private String  webSite;
    private Integer licenseType;
    private String  contact;
    private String  phone;
    private String  email;
    private Long    corpId;
    private Long    signCorpId;
    private Long    adCorpId;
    private Integer status;
    private Long    agentId;
    private Long    shopUserId;

    public Account() {}

    public Account(Account value) {
        this.id = value.id;
        this.name = value.name;
        this.userId = value.userId;
        this.shortName = value.shortName;
        this.appId = value.appId;
        this.createSource = value.createSource;
        this.productName = value.productName;
        this.webSite = value.webSite;
        this.licenseType = value.licenseType;
        this.contact = value.contact;
        this.phone = value.phone;
        this.email = value.email;
        this.corpId = value.corpId;
        this.signCorpId = value.signCorpId;
        this.adCorpId = value.adCorpId;
        this.status = value.status;
        this.agentId = value.agentId;
        this.shopUserId = value.shopUserId;
    }

    public Account(
        Long    id,
        String  name,
        Long    userId,
        String  shortName,
        Integer appId,
        Integer createSource,
        String  productName,
        String  webSite,
        Integer licenseType,
        String  contact,
        String  phone,
        String  email,
        Long    corpId,
        Long    signCorpId,
        Long    adCorpId,
        Integer status,
        Long    agentId,
        Long    shopUserId
    ) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.shortName = shortName;
        this.appId = appId;
        this.createSource = createSource;
        this.productName = productName;
        this.webSite = webSite;
        this.licenseType = licenseType;
        this.contact = contact;
        this.phone = phone;
        this.email = email;
        this.corpId = corpId;
        this.signCorpId = signCorpId;
        this.adCorpId = adCorpId;
        this.status = status;
        this.agentId = agentId;
        this.shopUserId = shopUserId;
    }

    /**
     * Getter for <code>uc.account.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>uc.account.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>uc.account.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>uc.account.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>uc.account.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>uc.account.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>uc.account.short_name</code>.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for <code>uc.account.short_name</code>.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Getter for <code>uc.account.app_id</code>.
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>uc.account.app_id</code>.
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * Getter for <code>uc.account.create_source</code>.
     */
    public Integer getCreateSource() {
        return this.createSource;
    }

    /**
     * Setter for <code>uc.account.create_source</code>.
     */
    public void setCreateSource(Integer createSource) {
        this.createSource = createSource;
    }

    /**
     * Getter for <code>uc.account.product_name</code>.
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Setter for <code>uc.account.product_name</code>.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for <code>uc.account.web_site</code>.
     */
    public String getWebSite() {
        return this.webSite;
    }

    /**
     * Setter for <code>uc.account.web_site</code>.
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    /**
     * Getter for <code>uc.account.license_type</code>.
     */
    public Integer getLicenseType() {
        return this.licenseType;
    }

    /**
     * Setter for <code>uc.account.license_type</code>.
     */
    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Getter for <code>uc.account.contact</code>.
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * Setter for <code>uc.account.contact</code>.
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * Getter for <code>uc.account.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>uc.account.phone</code>.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for <code>uc.account.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>uc.account.email</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>uc.account.corp_id</code>.
     */
    public Long getCorpId() {
        return this.corpId;
    }

    /**
     * Setter for <code>uc.account.corp_id</code>.
     */
    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    /**
     * Getter for <code>uc.account.sign_corp_id</code>.
     */
    public Long getSignCorpId() {
        return this.signCorpId;
    }

    /**
     * Setter for <code>uc.account.sign_corp_id</code>.
     */
    public void setSignCorpId(Long signCorpId) {
        this.signCorpId = signCorpId;
    }

    /**
     * Getter for <code>uc.account.ad_corp_id</code>.
     */
    public Long getAdCorpId() {
        return this.adCorpId;
    }

    /**
     * Setter for <code>uc.account.ad_corp_id</code>.
     */
    public void setAdCorpId(Long adCorpId) {
        this.adCorpId = adCorpId;
    }

    /**
     * Getter for <code>uc.account.status</code>.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>uc.account.status</code>.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Getter for <code>uc.account.agent_id</code>.
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * Setter for <code>uc.account.agent_id</code>.
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Getter for <code>uc.account.shop_user_id</code>.
     */
    public Long getShopUserId() {
        return this.shopUserId;
    }

    /**
     * Setter for <code>uc.account.shop_user_id</code>.
     */
    public void setShopUserId(Long shopUserId) {
        this.shopUserId = shopUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Account (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(userId);
        sb.append(", ").append(shortName);
        sb.append(", ").append(appId);
        sb.append(", ").append(createSource);
        sb.append(", ").append(productName);
        sb.append(", ").append(webSite);
        sb.append(", ").append(licenseType);
        sb.append(", ").append(contact);
        sb.append(", ").append(phone);
        sb.append(", ").append(email);
        sb.append(", ").append(corpId);
        sb.append(", ").append(signCorpId);
        sb.append(", ").append(adCorpId);
        sb.append(", ").append(status);
        sb.append(", ").append(agentId);
        sb.append(", ").append(shopUserId);

        sb.append(")");
        return sb.toString();
    }
}
