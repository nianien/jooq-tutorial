/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.SitePage;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class SitePageRecord extends UpdatableRecordImpl<SitePageRecord> implements Record13<Long, Long, String, String, String, String, Integer, Integer, Long, Integer, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.site_page.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.site_page.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.site_page.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.site_page.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.site_page.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.site_page.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>material.site_page.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.site_page.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.site_page.snapshot</code>.
     */
    public void setSnapshot(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.site_page.snapshot</code>.
     */
    public String getSnapshot() {
        return (String) get(4);
    }

    /**
     * Setter for <code>material.site_page.inner_url</code>.
     */
    public void setInnerUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.site_page.inner_url</code>.
     */
    public String getInnerUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.site_page.appid</code>.
     */
    public void setAppid(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.site_page.appid</code>.
     */
    public Integer getAppid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>material.site_page.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.site_page.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>material.site_page.version</code>.
     */
    public void setVersion(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.site_page.version</code>.
     */
    public Long getVersion() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>material.site_page.state</code>.
     */
    public void setState(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.site_page.state</code>.
     */
    public Integer getState() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>material.site_page.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.site_page.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>material.site_page.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.site_page.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>material.site_page.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.site_page.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, String, String, String, Integer, Integer, Long, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, String, String, String, String, Integer, Integer, Long, Integer, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SitePage.SITE_PAGE.ID;
    }

    @Override
    public Field<Long> field2() {
        return SitePage.SITE_PAGE.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return SitePage.SITE_PAGE.NAME;
    }

    @Override
    public Field<String> field4() {
        return SitePage.SITE_PAGE.TITLE;
    }

    @Override
    public Field<String> field5() {
        return SitePage.SITE_PAGE.SNAPSHOT;
    }

    @Override
    public Field<String> field6() {
        return SitePage.SITE_PAGE.INNER_URL;
    }

    @Override
    public Field<Integer> field7() {
        return SitePage.SITE_PAGE.APPID;
    }

    @Override
    public Field<Integer> field8() {
        return SitePage.SITE_PAGE.LOGIC_STATE;
    }

    @Override
    public Field<Long> field9() {
        return SitePage.SITE_PAGE.VERSION;
    }

    @Override
    public Field<Integer> field10() {
        return SitePage.SITE_PAGE.STATE;
    }

    @Override
    public Field<Integer> field11() {
        return SitePage.SITE_PAGE.STATE_DETAIL;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return SitePage.SITE_PAGE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return SitePage.SITE_PAGE.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getTitle();
    }

    @Override
    public String component5() {
        return getSnapshot();
    }

    @Override
    public String component6() {
        return getInnerUrl();
    }

    @Override
    public Integer component7() {
        return getAppid();
    }

    @Override
    public Integer component8() {
        return getLogicState();
    }

    @Override
    public Long component9() {
        return getVersion();
    }

    @Override
    public Integer component10() {
        return getState();
    }

    @Override
    public Integer component11() {
        return getStateDetail();
    }

    @Override
    public LocalDateTime component12() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component13() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getTitle();
    }

    @Override
    public String value5() {
        return getSnapshot();
    }

    @Override
    public String value6() {
        return getInnerUrl();
    }

    @Override
    public Integer value7() {
        return getAppid();
    }

    @Override
    public Integer value8() {
        return getLogicState();
    }

    @Override
    public Long value9() {
        return getVersion();
    }

    @Override
    public Integer value10() {
        return getState();
    }

    @Override
    public Integer value11() {
        return getStateDetail();
    }

    @Override
    public LocalDateTime value12() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value13() {
        return getModifyTime();
    }

    @Override
    public SitePageRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SitePageRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public SitePageRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public SitePageRecord value4(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public SitePageRecord value5(String value) {
        setSnapshot(value);
        return this;
    }

    @Override
    public SitePageRecord value6(String value) {
        setInnerUrl(value);
        return this;
    }

    @Override
    public SitePageRecord value7(Integer value) {
        setAppid(value);
        return this;
    }

    @Override
    public SitePageRecord value8(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public SitePageRecord value9(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public SitePageRecord value10(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public SitePageRecord value11(Integer value) {
        setStateDetail(value);
        return this;
    }

    @Override
    public SitePageRecord value12(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SitePageRecord value13(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public SitePageRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, Long value9, Integer value10, Integer value11, LocalDateTime value12, LocalDateTime value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SitePageRecord
     */
    public SitePageRecord() {
        super(SitePage.SITE_PAGE);
    }

    /**
     * Create a detached, initialised SitePageRecord
     */
    public SitePageRecord(Long id, Long userId, String name, String title, String snapshot, String innerUrl, Integer appid, Integer logicState, Long version, Integer state, Integer stateDetail, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(SitePage.SITE_PAGE);

        setId(id);
        setUserId(userId);
        setName(name);
        setTitle(title);
        setSnapshot(snapshot);
        setInnerUrl(innerUrl);
        setAppid(appid);
        setLogicState(logicState);
        setVersion(version);
        setState(state);
        setStateDetail(stateDetail);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised SitePageRecord
     */
    public SitePageRecord(com.tengzhe.jooq.data.material.tables.pojos.SitePage value) {
        super(SitePage.SITE_PAGE);

        if (value != null) {
            setId(value.getId());
            setUserId(value.getUserId());
            setName(value.getName());
            setTitle(value.getTitle());
            setSnapshot(value.getSnapshot());
            setInnerUrl(value.getInnerUrl());
            setAppid(value.getAppid());
            setLogicState(value.getLogicState());
            setVersion(value.getVersion());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}