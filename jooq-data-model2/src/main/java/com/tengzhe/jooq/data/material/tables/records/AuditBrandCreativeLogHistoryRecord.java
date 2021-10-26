/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditBrandCreativeLogHistory;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class AuditBrandCreativeLogHistoryRecord extends UpdatableRecordImpl<AuditBrandCreativeLogHistoryRecord> implements Record16<Long, Long, Long, String, Integer, Integer, Integer, Integer, String, Integer, Long, Integer, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_brand_creative_log_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.creative_id</code>.
     */
    public void setCreativeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.creative_id</code>.
     */
    public Long getCreativeId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.media</code>.
     */
    public void setMedia(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.media</code>.
     */
    public Integer getMedia() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.resource_type</code>.
     */
    public void setResourceType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.resource_type</code>.
     */
    public Integer getResourceType() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.ad_style_id</code>.
     */
    public void setAdStyleId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.ad_style_type</code>.
     */
    public void setAdStyleType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.ad_style_type</code>.
     */
    public Integer getAdStyleType() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.content</code>.
     */
    public void setContent(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.content</code>.
     */
    public String getContent() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.version</code>.
     */
    public void setVersion(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.version</code>.
     */
    public Long getVersion() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>material.audit_brand_creative_log_history.state</code>.
     */
    public void setState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_brand_creative_log_history.state</code>.
     */
    public Integer getState() {
        return (Integer) get(11);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(12);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.audit_type</code>.
     */
    public void setAuditType(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.audit_type</code>.
     */
    public String getAuditType() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.audit_detail</code>.
     */
    public void setAuditDetail(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.audit_detail</code>.
     */
    public String getAuditDetail() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>material.audit_brand_creative_log_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>material.audit_brand_creative_log_history.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, String, Integer, Integer, Integer, Integer, String, Integer, Long, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, Long, String, Integer, Integer, Integer, Integer, String, Integer, Long, Integer, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.CREATIVE_ID;
    }

    @Override
    public Field<Long> field3() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.NAME;
    }

    @Override
    public Field<Integer> field5() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.MEDIA;
    }

    @Override
    public Field<Integer> field6() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.RESOURCE_TYPE;
    }

    @Override
    public Field<Integer> field7() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.AD_STYLE_ID;
    }

    @Override
    public Field<Integer> field8() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.AD_STYLE_TYPE;
    }

    @Override
    public Field<String> field9() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.CONTENT;
    }

    @Override
    public Field<Integer> field10() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.LOGIC_STATE;
    }

    @Override
    public Field<Long> field11() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.VERSION;
    }

    @Override
    public Field<Integer> field12() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.STATE;
    }

    @Override
    public Field<Integer> field13() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.STATE_DETAIL;
    }

    @Override
    public Field<String> field14() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.AUDIT_TYPE;
    }

    @Override
    public Field<String> field15() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.AUDIT_DETAIL;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCreativeId();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Integer component5() {
        return getMedia();
    }

    @Override
    public Integer component6() {
        return getResourceType();
    }

    @Override
    public Integer component7() {
        return getAdStyleId();
    }

    @Override
    public Integer component8() {
        return getAdStyleType();
    }

    @Override
    public String component9() {
        return getContent();
    }

    @Override
    public Integer component10() {
        return getLogicState();
    }

    @Override
    public Long component11() {
        return getVersion();
    }

    @Override
    public Integer component12() {
        return getState();
    }

    @Override
    public Integer component13() {
        return getStateDetail();
    }

    @Override
    public String component14() {
        return getAuditType();
    }

    @Override
    public String component15() {
        return getAuditDetail();
    }

    @Override
    public LocalDateTime component16() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCreativeId();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Integer value5() {
        return getMedia();
    }

    @Override
    public Integer value6() {
        return getResourceType();
    }

    @Override
    public Integer value7() {
        return getAdStyleId();
    }

    @Override
    public Integer value8() {
        return getAdStyleType();
    }

    @Override
    public String value9() {
        return getContent();
    }

    @Override
    public Integer value10() {
        return getLogicState();
    }

    @Override
    public Long value11() {
        return getVersion();
    }

    @Override
    public Integer value12() {
        return getState();
    }

    @Override
    public Integer value13() {
        return getStateDetail();
    }

    @Override
    public String value14() {
        return getAuditType();
    }

    @Override
    public String value15() {
        return getAuditDetail();
    }

    @Override
    public LocalDateTime value16() {
        return getCreateTime();
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value2(Long value) {
        setCreativeId(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value5(Integer value) {
        setMedia(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value6(Integer value) {
        setResourceType(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value7(Integer value) {
        setAdStyleId(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value8(Integer value) {
        setAdStyleType(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value9(String value) {
        setContent(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value10(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value12(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value13(Integer value) {
        setStateDetail(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value14(String value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value15(String value) {
        setAuditDetail(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord value16(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditBrandCreativeLogHistoryRecord values(Long value1, Long value2, Long value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, String value9, Integer value10, Long value11, Integer value12, Integer value13, String value14, String value15, LocalDateTime value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditBrandCreativeLogHistoryRecord
     */
    public AuditBrandCreativeLogHistoryRecord() {
        super(AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY);
    }

    /**
     * Create a detached, initialised AuditBrandCreativeLogHistoryRecord
     */
    public AuditBrandCreativeLogHistoryRecord(Long id, Long creativeId, Long userId, String name, Integer media, Integer resourceType, Integer adStyleId, Integer adStyleType, String content, Integer logicState, Long version, Integer state, Integer stateDetail, String auditType, String auditDetail, LocalDateTime createTime) {
        super(AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY);

        setId(id);
        setCreativeId(creativeId);
        setUserId(userId);
        setName(name);
        setMedia(media);
        setResourceType(resourceType);
        setAdStyleId(adStyleId);
        setAdStyleType(adStyleType);
        setContent(content);
        setLogicState(logicState);
        setVersion(version);
        setState(state);
        setStateDetail(stateDetail);
        setAuditType(auditType);
        setAuditDetail(auditDetail);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditBrandCreativeLogHistoryRecord
     */
    public AuditBrandCreativeLogHistoryRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditBrandCreativeLogHistory value) {
        super(AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY);

        if (value != null) {
            setId(value.getId());
            setCreativeId(value.getCreativeId());
            setUserId(value.getUserId());
            setName(value.getName());
            setMedia(value.getMedia());
            setResourceType(value.getResourceType());
            setAdStyleId(value.getAdStyleId());
            setAdStyleType(value.getAdStyleType());
            setContent(value.getContent());
            setLogicState(value.getLogicState());
            setVersion(value.getVersion());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setAuditType(value.getAuditType());
            setAuditDetail(value.getAuditDetail());
            setCreateTime(value.getCreateTime());
        }
    }
}
