/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit.tables.records;


import com.tengzhe.jooq.data.audit.tables.UserInfo;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserInfoRecord extends UpdatableRecordImpl<UserInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit.user_info.userid</code>.
     */
    public void setUserid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit.user_info.userid</code>.
     */
    public Long getUserid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit.user_info.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit.user_info.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit.user_info.ad_resource</code>.
     */
    public void setAdResource(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit.user_info.ad_resource</code>.
     */
    public Long getAdResource() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>audit.user_info.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit.user_info.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit.user_info.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit.user_info.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>audit.user_info.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit.user_info.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>audit.user_info.refuse_reason</code>.
     */
    public void setRefuseReason(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit.user_info.refuse_reason</code>.
     */
    public String getRefuseReason() {
        return (String) get(6);
    }

    /**
     * Setter for <code>audit.user_info.version</code>.
     */
    public void setVersion(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit.user_info.version</code>.
     */
    public LocalDateTime getVersion() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>audit.user_info.balance</code>.
     */
    public void setBalance(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit.user_info.balance</code>.
     */
    public Long getBalance() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>audit.user_info.finance_state</code>.
     */
    public void setFinanceState(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>audit.user_info.finance_state</code>.
     */
    public Integer getFinanceState() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>audit.user_info.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>audit.user_info.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>audit.user_info.site_name</code>.
     */
    public void setSiteName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>audit.user_info.site_name</code>.
     */
    public String getSiteName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>audit.user_info.site_url</code>.
     */
    public void setSiteUrl(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>audit.user_info.site_url</code>.
     */
    public String getSiteUrl() {
        return (String) get(12);
    }

    /**
     * Setter for <code>audit.user_info.industry1</code>.
     */
    public void setIndustry1(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>audit.user_info.industry1</code>.
     */
    public Integer getIndustry1() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>audit.user_info.industry2</code>.
     */
    public void setIndustry2(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>audit.user_info.industry2</code>.
     */
    public Integer getIndustry2() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>audit.user_info.industry3</code>.
     */
    public void setIndustry3(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>audit.user_info.industry3</code>.
     */
    public Integer getIndustry3() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>audit.user_info.telephone</code>.
     */
    public void setTelephone(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>audit.user_info.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>audit.user_info.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>audit.user_info.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>audit.user_info.modify_user</code>.
     */
    public void setModifyUser(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>audit.user_info.modify_user</code>.
     */
    public Long getModifyUser() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>audit.user_info.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>audit.user_info.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>audit.user_info.audit_start_time</code>.
     */
    public void setAuditStartTime(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>audit.user_info.audit_start_time</code>.
     */
    public LocalDateTime getAuditStartTime() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>audit.user_info.audit_end_time</code>.
     */
    public void setAuditEndTime(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>audit.user_info.audit_end_time</code>.
     */
    public LocalDateTime getAuditEndTime() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>audit.user_info.province</code>.
     */
    public void setProvince(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>audit.user_info.province</code>.
     */
    public String getProvince() {
        return (String) get(22);
    }

    /**
     * Setter for <code>audit.user_info.city</code>.
     */
    public void setCity(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>audit.user_info.city</code>.
     */
    public String getCity() {
        return (String) get(23);
    }

    /**
     * Setter for <code>audit.user_info.address</code>.
     */
    public void setAddress(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>audit.user_info.address</code>.
     */
    public String getAddress() {
        return (String) get(24);
    }

    /**
     * Setter for <code>audit.user_info.regist_url</code>.
     */
    public void setRegistUrl(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>audit.user_info.regist_url</code>.
     */
    public String getRegistUrl() {
        return (String) get(25);
    }

    /**
     * Setter for <code>audit.user_info.open_url</code>.
     */
    public void setOpenUrl(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>audit.user_info.open_url</code>.
     */
    public String getOpenUrl() {
        return (String) get(26);
    }

    /**
     * Setter for <code>audit.user_info.source</code>.
     */
    public void setSource(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>audit.user_info.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(27);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserInfoRecord
     */
    public UserInfoRecord() {
        super(UserInfo.USER_INFO);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(Long userid, String name, Long adResource, Integer auditState, Long auditorId, String reasonCode, String refuseReason, LocalDateTime version, Long balance, Integer financeState, String companyName, String siteName, String siteUrl, Integer industry1, Integer industry2, Integer industry3, String telephone, LocalDateTime createTime, Long modifyUser, LocalDateTime modifyTime, LocalDateTime auditStartTime, LocalDateTime auditEndTime, String province, String city, String address, String registUrl, String openUrl, Integer source) {
        super(UserInfo.USER_INFO);

        setUserid(userid);
        setName(name);
        setAdResource(adResource);
        setAuditState(auditState);
        setAuditorId(auditorId);
        setReasonCode(reasonCode);
        setRefuseReason(refuseReason);
        setVersion(version);
        setBalance(balance);
        setFinanceState(financeState);
        setCompanyName(companyName);
        setSiteName(siteName);
        setSiteUrl(siteUrl);
        setIndustry1(industry1);
        setIndustry2(industry2);
        setIndustry3(industry3);
        setTelephone(telephone);
        setCreateTime(createTime);
        setModifyUser(modifyUser);
        setModifyTime(modifyTime);
        setAuditStartTime(auditStartTime);
        setAuditEndTime(auditEndTime);
        setProvince(province);
        setCity(city);
        setAddress(address);
        setRegistUrl(registUrl);
        setOpenUrl(openUrl);
        setSource(source);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(com.tengzhe.jooq.data.audit.tables.pojos.UserInfo value) {
        super(UserInfo.USER_INFO);

        if (value != null) {
            setUserid(value.getUserid());
            setName(value.getName());
            setAdResource(value.getAdResource());
            setAuditState(value.getAuditState());
            setAuditorId(value.getAuditorId());
            setReasonCode(value.getReasonCode());
            setRefuseReason(value.getRefuseReason());
            setVersion(value.getVersion());
            setBalance(value.getBalance());
            setFinanceState(value.getFinanceState());
            setCompanyName(value.getCompanyName());
            setSiteName(value.getSiteName());
            setSiteUrl(value.getSiteUrl());
            setIndustry1(value.getIndustry1());
            setIndustry2(value.getIndustry2());
            setIndustry3(value.getIndustry3());
            setTelephone(value.getTelephone());
            setCreateTime(value.getCreateTime());
            setModifyUser(value.getModifyUser());
            setModifyTime(value.getModifyTime());
            setAuditStartTime(value.getAuditStartTime());
            setAuditEndTime(value.getAuditEndTime());
            setProvince(value.getProvince());
            setCity(value.getCity());
            setAddress(value.getAddress());
            setRegistUrl(value.getRegistUrl());
            setOpenUrl(value.getOpenUrl());
            setSource(value.getSource());
        }
    }
}