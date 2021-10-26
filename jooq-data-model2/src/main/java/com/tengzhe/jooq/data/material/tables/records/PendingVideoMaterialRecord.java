/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.PendingVideoMaterial;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PendingVideoMaterialRecord extends UpdatableRecordImpl<PendingVideoMaterialRecord> implements Record9<Long, Long, Long, Integer, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.pending_video_material.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.pending_video_material.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.pending_video_material.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.pending_video_material.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.pending_video_material.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.pending_video_material.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.pending_video_material.route</code>.
     */
    public void setRoute(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.pending_video_material.route</code>.
     */
    public Integer getRoute() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>material.pending_video_material.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.pending_video_material.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>material.pending_video_material.video_time</code>.
     */
    public void setVideoTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.pending_video_material.video_time</code>.
     */
    public LocalDateTime getVideoTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>material.pending_video_material.state</code>.
     */
    public void setState(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.pending_video_material.state</code>.
     */
    public Integer getState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>material.pending_video_material.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.pending_video_material.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>material.pending_video_material.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.pending_video_material.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Integer, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Integer, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.ID;
    }

    @Override
    public Field<Long> field2() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.ENTITY_ID;
    }

    @Override
    public Field<Integer> field4() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.ROUTE;
    }

    @Override
    public Field<Long> field5() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.AUDITOR_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.VIDEO_TIME;
    }

    @Override
    public Field<Integer> field7() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.STATE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return PendingVideoMaterial.PENDING_VIDEO_MATERIAL.MODIFY_TIME;
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
    public Long component3() {
        return getEntityId();
    }

    @Override
    public Integer component4() {
        return getRoute();
    }

    @Override
    public Long component5() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime component6() {
        return getVideoTime();
    }

    @Override
    public Integer component7() {
        return getState();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component9() {
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
    public Long value3() {
        return getEntityId();
    }

    @Override
    public Integer value4() {
        return getRoute();
    }

    @Override
    public Long value5() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime value6() {
        return getVideoTime();
    }

    @Override
    public Integer value7() {
        return getState();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value9() {
        return getModifyTime();
    }

    @Override
    public PendingVideoMaterialRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value3(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value4(Integer value) {
        setRoute(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value5(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value6(LocalDateTime value) {
        setVideoTime(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value7(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public PendingVideoMaterialRecord values(Long value1, Long value2, Long value3, Integer value4, Long value5, LocalDateTime value6, Integer value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PendingVideoMaterialRecord
     */
    public PendingVideoMaterialRecord() {
        super(PendingVideoMaterial.PENDING_VIDEO_MATERIAL);
    }

    /**
     * Create a detached, initialised PendingVideoMaterialRecord
     */
    public PendingVideoMaterialRecord(Long id, Long userId, Long entityId, Integer route, Long auditorId, LocalDateTime videoTime, Integer state, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(PendingVideoMaterial.PENDING_VIDEO_MATERIAL);

        setId(id);
        setUserId(userId);
        setEntityId(entityId);
        setRoute(route);
        setAuditorId(auditorId);
        setVideoTime(videoTime);
        setState(state);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised PendingVideoMaterialRecord
     */
    public PendingVideoMaterialRecord(com.tengzhe.jooq.data.material.tables.pojos.PendingVideoMaterial value) {
        super(PendingVideoMaterial.PENDING_VIDEO_MATERIAL);

        if (value != null) {
            setId(value.getId());
            setUserId(value.getUserId());
            setEntityId(value.getEntityId());
            setRoute(value.getRoute());
            setAuditorId(value.getAuditorId());
            setVideoTime(value.getVideoTime());
            setState(value.getState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
