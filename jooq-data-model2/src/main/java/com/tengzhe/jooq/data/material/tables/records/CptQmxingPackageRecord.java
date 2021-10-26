/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.CptQmxingPackage;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class CptQmxingPackageRecord extends UpdatableRecordImpl<CptQmxingPackageRecord> implements Record19<Long, Long, Long, String, String, String, String, String, String, String, String, String, Long, Long, Integer, Integer, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.cpt_qmxing_package.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.uc_id</code>.
     */
    public void setUcId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.uc_id</code>.
     */
    public Long getUcId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.package_name</code>.
     */
    public void setPackageName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.package_name</code>.
     */
    public String getPackageName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.brand_name</code>.
     */
    public void setBrandName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.brand_name</code>.
     */
    public String getBrandName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.launch_region</code>.
     */
    public void setLaunchRegion(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.launch_region</code>.
     */
    public String getLaunchRegion() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.attachments</code>.
     */
    public void setAttachments(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.attachments</code>.
     */
    public String getAttachments() {
        return (String) get(7);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.site_url</code>.
     */
    public void setSiteUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.site_url</code>.
     */
    public String getSiteUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.audit_word_file</code>.
     */
    public void setAuditWordFile(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.audit_word_file</code>.
     */
    public String getAuditWordFile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.pass_word_file</code>.
     */
    public void setPassWordFile(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.pass_word_file</code>.
     */
    public String getPassWordFile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.reject_word_file</code>.
     */
    public void setRejectWordFile(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.reject_word_file</code>.
     */
    public String getRejectWordFile() {
        return (String) get(11);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.version</code>.
     */
    public void setVersion(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.state</code>.
     */
    public void setState(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.state</code>.
     */
    public Integer getState() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>material.cpt_qmxing_package.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>material.cpt_qmxing_package.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Long, Long, String, String, String, String, String, String, String, String, String, Long, Long, Integer, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Long, Long, Long, String, String, String, String, String, String, String, String, String, Long, Long, Integer, Integer, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.ID;
    }

    @Override
    public Field<Long> field2() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.UC_ID;
    }

    @Override
    public Field<Long> field3() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.PACKAGE_NAME;
    }

    @Override
    public Field<String> field5() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.COMPANY_NAME;
    }

    @Override
    public Field<String> field6() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.BRAND_NAME;
    }

    @Override
    public Field<String> field7() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.LAUNCH_REGION;
    }

    @Override
    public Field<String> field8() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.ATTACHMENTS;
    }

    @Override
    public Field<String> field9() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.SITE_URL;
    }

    @Override
    public Field<String> field10() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.AUDIT_WORD_FILE;
    }

    @Override
    public Field<String> field11() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.PASS_WORD_FILE;
    }

    @Override
    public Field<String> field12() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.REJECT_WORD_FILE;
    }

    @Override
    public Field<Long> field13() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.VERSION;
    }

    @Override
    public Field<Long> field14() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.CREATE_USER_ID;
    }

    @Override
    public Field<Integer> field15() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.LOGIC_STATE;
    }

    @Override
    public Field<Integer> field16() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.STATE;
    }

    @Override
    public Field<Integer> field17() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.STATE_DETAIL;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return CptQmxingPackage.CPT_QMXING_PACKAGE.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUcId();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getPackageName();
    }

    @Override
    public String component5() {
        return getCompanyName();
    }

    @Override
    public String component6() {
        return getBrandName();
    }

    @Override
    public String component7() {
        return getLaunchRegion();
    }

    @Override
    public String component8() {
        return getAttachments();
    }

    @Override
    public String component9() {
        return getSiteUrl();
    }

    @Override
    public String component10() {
        return getAuditWordFile();
    }

    @Override
    public String component11() {
        return getPassWordFile();
    }

    @Override
    public String component12() {
        return getRejectWordFile();
    }

    @Override
    public Long component13() {
        return getVersion();
    }

    @Override
    public Long component14() {
        return getCreateUserId();
    }

    @Override
    public Integer component15() {
        return getLogicState();
    }

    @Override
    public Integer component16() {
        return getState();
    }

    @Override
    public Integer component17() {
        return getStateDetail();
    }

    @Override
    public LocalDateTime component18() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component19() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUcId();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getPackageName();
    }

    @Override
    public String value5() {
        return getCompanyName();
    }

    @Override
    public String value6() {
        return getBrandName();
    }

    @Override
    public String value7() {
        return getLaunchRegion();
    }

    @Override
    public String value8() {
        return getAttachments();
    }

    @Override
    public String value9() {
        return getSiteUrl();
    }

    @Override
    public String value10() {
        return getAuditWordFile();
    }

    @Override
    public String value11() {
        return getPassWordFile();
    }

    @Override
    public String value12() {
        return getRejectWordFile();
    }

    @Override
    public Long value13() {
        return getVersion();
    }

    @Override
    public Long value14() {
        return getCreateUserId();
    }

    @Override
    public Integer value15() {
        return getLogicState();
    }

    @Override
    public Integer value16() {
        return getState();
    }

    @Override
    public Integer value17() {
        return getStateDetail();
    }

    @Override
    public LocalDateTime value18() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value19() {
        return getModifyTime();
    }

    @Override
    public CptQmxingPackageRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value2(Long value) {
        setUcId(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value4(String value) {
        setPackageName(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value5(String value) {
        setCompanyName(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value6(String value) {
        setBrandName(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value7(String value) {
        setLaunchRegion(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value8(String value) {
        setAttachments(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value9(String value) {
        setSiteUrl(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value10(String value) {
        setAuditWordFile(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value11(String value) {
        setPassWordFile(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value12(String value) {
        setRejectWordFile(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value14(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value15(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value16(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value17(Integer value) {
        setStateDetail(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value18(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord value19(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public CptQmxingPackageRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Long value13, Long value14, Integer value15, Integer value16, Integer value17, LocalDateTime value18, LocalDateTime value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CptQmxingPackageRecord
     */
    public CptQmxingPackageRecord() {
        super(CptQmxingPackage.CPT_QMXING_PACKAGE);
    }

    /**
     * Create a detached, initialised CptQmxingPackageRecord
     */
    public CptQmxingPackageRecord(Long id, Long ucId, Long userId, String packageName, String companyName, String brandName, String launchRegion, String attachments, String siteUrl, String auditWordFile, String passWordFile, String rejectWordFile, Long version, Long createUserId, Integer logicState, Integer state, Integer stateDetail, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(CptQmxingPackage.CPT_QMXING_PACKAGE);

        setId(id);
        setUcId(ucId);
        setUserId(userId);
        setPackageName(packageName);
        setCompanyName(companyName);
        setBrandName(brandName);
        setLaunchRegion(launchRegion);
        setAttachments(attachments);
        setSiteUrl(siteUrl);
        setAuditWordFile(auditWordFile);
        setPassWordFile(passWordFile);
        setRejectWordFile(rejectWordFile);
        setVersion(version);
        setCreateUserId(createUserId);
        setLogicState(logicState);
        setState(state);
        setStateDetail(stateDetail);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised CptQmxingPackageRecord
     */
    public CptQmxingPackageRecord(com.tengzhe.jooq.data.material.tables.pojos.CptQmxingPackage value) {
        super(CptQmxingPackage.CPT_QMXING_PACKAGE);

        if (value != null) {
            setId(value.getId());
            setUcId(value.getUcId());
            setUserId(value.getUserId());
            setPackageName(value.getPackageName());
            setCompanyName(value.getCompanyName());
            setBrandName(value.getBrandName());
            setLaunchRegion(value.getLaunchRegion());
            setAttachments(value.getAttachments());
            setSiteUrl(value.getSiteUrl());
            setAuditWordFile(value.getAuditWordFile());
            setPassWordFile(value.getPassWordFile());
            setRejectWordFile(value.getRejectWordFile());
            setVersion(value.getVersion());
            setCreateUserId(value.getCreateUserId());
            setLogicState(value.getLogicState());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}