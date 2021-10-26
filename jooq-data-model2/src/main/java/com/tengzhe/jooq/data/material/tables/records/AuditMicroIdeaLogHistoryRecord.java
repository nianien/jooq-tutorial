/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditMicroIdeaLogHistory;

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
public class AuditMicroIdeaLogHistoryRecord extends UpdatableRecordImpl<AuditMicroIdeaLogHistoryRecord> implements Record16<Long, Long, Long, Integer, Integer, String, String, Integer, Integer, Long, LocalDateTime, Integer, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_micro_idea_log_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.type</code>.
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.type</code>.
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.ad_style_id</code>.
     */
    public void setAdStyleId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.content</code>.
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.content</code>.
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.libs</code>.
     */
    public void setLibs(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.libs</code>.
     */
    public String getLibs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.platform</code>.
     */
    public void setPlatform(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.platform</code>.
     */
    public Integer getPlatform() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.version</code>.
     */
    public void setVersion(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.version</code>.
     */
    public Long getVersion() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.submit_time</code>.
     */
    public void setSubmitTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.submit_time</code>.
     */
    public LocalDateTime getSubmitTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.state</code>.
     */
    public void setState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.state</code>.
     */
    public Integer getState() {
        return (Integer) get(11);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>material.audit_micro_idea_log_history.audit_type</code>.
     */
    public void setAuditType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.audit_micro_idea_log_history.audit_type</code>.
     */
    public String getAuditType() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.audit_detail</code>.
     */
    public void setAuditDetail(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.audit_detail</code>.
     */
    public String getAuditDetail() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>material.audit_micro_idea_log_history.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>material.audit_micro_idea_log_history.create_time</code>.
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
    public Row16<Long, Long, Long, Integer, Integer, String, String, Integer, Integer, Long, LocalDateTime, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, Long, Integer, Integer, String, String, Integer, Integer, Long, LocalDateTime, Integer, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.ENTITY_ID;
    }

    @Override
    public Field<Long> field3() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.USER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.AD_STYLE_ID;
    }

    @Override
    public Field<String> field6() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.CONTENT;
    }

    @Override
    public Field<String> field7() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.LIBS;
    }

    @Override
    public Field<Integer> field8() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.PLATFORM;
    }

    @Override
    public Field<Integer> field9() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.LOGIC_STATE;
    }

    @Override
    public Field<Long> field10() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.VERSION;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.SUBMIT_TIME;
    }

    @Override
    public Field<Integer> field12() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.STATE;
    }

    @Override
    public Field<Integer> field13() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.STATE_DETAIL;
    }

    @Override
    public Field<String> field14() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.AUDIT_TYPE;
    }

    @Override
    public Field<String> field15() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.AUDIT_DETAIL;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getEntityId();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public Integer component4() {
        return getType();
    }

    @Override
    public Integer component5() {
        return getAdStyleId();
    }

    @Override
    public String component6() {
        return getContent();
    }

    @Override
    public String component7() {
        return getLibs();
    }

    @Override
    public Integer component8() {
        return getPlatform();
    }

    @Override
    public Integer component9() {
        return getLogicState();
    }

    @Override
    public Long component10() {
        return getVersion();
    }

    @Override
    public LocalDateTime component11() {
        return getSubmitTime();
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
        return getEntityId();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public Integer value4() {
        return getType();
    }

    @Override
    public Integer value5() {
        return getAdStyleId();
    }

    @Override
    public String value6() {
        return getContent();
    }

    @Override
    public String value7() {
        return getLibs();
    }

    @Override
    public Integer value8() {
        return getPlatform();
    }

    @Override
    public Integer value9() {
        return getLogicState();
    }

    @Override
    public Long value10() {
        return getVersion();
    }

    @Override
    public LocalDateTime value11() {
        return getSubmitTime();
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
    public AuditMicroIdeaLogHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value2(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value4(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value5(Integer value) {
        setAdStyleId(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value6(String value) {
        setContent(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value7(String value) {
        setLibs(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value8(Integer value) {
        setPlatform(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value9(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value10(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value11(LocalDateTime value) {
        setSubmitTime(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value12(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value13(Integer value) {
        setStateDetail(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value14(String value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value15(String value) {
        setAuditDetail(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord value16(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditMicroIdeaLogHistoryRecord values(Long value1, Long value2, Long value3, Integer value4, Integer value5, String value6, String value7, Integer value8, Integer value9, Long value10, LocalDateTime value11, Integer value12, Integer value13, String value14, String value15, LocalDateTime value16) {
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
     * Create a detached AuditMicroIdeaLogHistoryRecord
     */
    public AuditMicroIdeaLogHistoryRecord() {
        super(AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY);
    }

    /**
     * Create a detached, initialised AuditMicroIdeaLogHistoryRecord
     */
    public AuditMicroIdeaLogHistoryRecord(Long id, Long entityId, Long userId, Integer type, Integer adStyleId, String content, String libs, Integer platform, Integer logicState, Long version, LocalDateTime submitTime, Integer state, Integer stateDetail, String auditType, String auditDetail, LocalDateTime createTime) {
        super(AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY);

        setId(id);
        setEntityId(entityId);
        setUserId(userId);
        setType(type);
        setAdStyleId(adStyleId);
        setContent(content);
        setLibs(libs);
        setPlatform(platform);
        setLogicState(logicState);
        setVersion(version);
        setSubmitTime(submitTime);
        setState(state);
        setStateDetail(stateDetail);
        setAuditType(auditType);
        setAuditDetail(auditDetail);
        setCreateTime(createTime);
    }

    /**
     * Create a detached, initialised AuditMicroIdeaLogHistoryRecord
     */
    public AuditMicroIdeaLogHistoryRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditMicroIdeaLogHistory value) {
        super(AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY);

        if (value != null) {
            setId(value.getId());
            setEntityId(value.getEntityId());
            setUserId(value.getUserId());
            setType(value.getType());
            setAdStyleId(value.getAdStyleId());
            setContent(value.getContent());
            setLibs(value.getLibs());
            setPlatform(value.getPlatform());
            setLogicState(value.getLogicState());
            setVersion(value.getVersion());
            setSubmitTime(value.getSubmitTime());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setAuditType(value.getAuditType());
            setAuditDetail(value.getAuditDetail());
            setCreateTime(value.getCreateTime());
        }
    }
}