/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.pojos;


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
public class UcContact implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          userid;
    private String        userName;
    private String        companyName;
    private String        siteName;
    private String        siteUrl;
    private String        contactName;
    private String        contactPhone;
    private String        mobile;
    private String        contactEmail;
    private String        qq;
    private String        fax;
    private String        province;
    private String        city;
    private String        address;
    private String        zipCode;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Integer       deleted;

    public UcContact() {}

    public UcContact(UcContact value) {
        this.userid = value.userid;
        this.userName = value.userName;
        this.companyName = value.companyName;
        this.siteName = value.siteName;
        this.siteUrl = value.siteUrl;
        this.contactName = value.contactName;
        this.contactPhone = value.contactPhone;
        this.mobile = value.mobile;
        this.contactEmail = value.contactEmail;
        this.qq = value.qq;
        this.fax = value.fax;
        this.province = value.province;
        this.city = value.city;
        this.address = value.address;
        this.zipCode = value.zipCode;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.deleted = value.deleted;
    }

    public UcContact(
        Long          userid,
        String        userName,
        String        companyName,
        String        siteName,
        String        siteUrl,
        String        contactName,
        String        contactPhone,
        String        mobile,
        String        contactEmail,
        String        qq,
        String        fax,
        String        province,
        String        city,
        String        address,
        String        zipCode,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Integer       deleted
    ) {
        this.userid = userid;
        this.userName = userName;
        this.companyName = companyName;
        this.siteName = siteName;
        this.siteUrl = siteUrl;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.mobile = mobile;
        this.contactEmail = contactEmail;
        this.qq = qq;
        this.fax = fax;
        this.province = province;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.deleted = deleted;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.userid</code>.
     */
    public Long getUserid() {
        return this.userid;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.userid</code>.
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.user_name</code>.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.user_name</code>.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.company_name</code>.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.company_name</code>.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.site_name</code>.
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.site_name</code>.
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.site_url</code>.
     */
    public String getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.site_url</code>.
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.contact_name</code>.
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.contact_name</code>.
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.contact_phone</code>.
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.contact_phone</code>.
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.mobile</code>.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.mobile</code>.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.contact_email</code>.
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.contact_email</code>.
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.qq</code>.
     */
    public String getQq() {
        return this.qq;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.qq</code>.
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.fax</code>.
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.fax</code>.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.province</code>.
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.province</code>.
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.city</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.city</code>.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.address</code>.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.zip_code</code>.
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.zip_code</code>.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_wolong.uc_contact.deleted</code>.
     */
    public Integer getDeleted() {
        return this.deleted;
    }

    /**
     * Setter for <code>audit_wolong.uc_contact.deleted</code>.
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UcContact (");

        sb.append(userid);
        sb.append(", ").append(userName);
        sb.append(", ").append(companyName);
        sb.append(", ").append(siteName);
        sb.append(", ").append(siteUrl);
        sb.append(", ").append(contactName);
        sb.append(", ").append(contactPhone);
        sb.append(", ").append(mobile);
        sb.append(", ").append(contactEmail);
        sb.append(", ").append(qq);
        sb.append(", ").append(fax);
        sb.append(", ").append(province);
        sb.append(", ").append(city);
        sb.append(", ").append(address);
        sb.append(", ").append(zipCode);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(deleted);

        sb.append(")");
        return sb.toString();
    }
}
