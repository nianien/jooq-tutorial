/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.AraIllegalMaterial;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class AraIllegalMaterialRecord extends UpdatableRecordImpl<AraIllegalMaterialRecord> implements Record14<Long, Long, Long, String, Integer, Long, String, Integer, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.ara_illegal_material.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.clue_id</code>.
     */
    public void setClueId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.clue_id</code>.
     */
    public Long getClueId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.ad_url</code>.
     */
    public void setAdUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.ad_url</code>.
     */
    public String getAdUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.accuracy</code>.
     */
    public void setAccuracy(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.accuracy</code>.
     */
    public Integer getAccuracy() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.idea_id</code>.
     */
    public void setIdeaId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.idea_id</code>.
     */
    public Long getIdeaId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.show_detail</code>.
     */
    public void setShowDetail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.show_detail</code>.
     */
    public String getShowDetail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.show_time</code>.
     */
    public void setShowTime(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.show_time</code>.
     */
    public Integer getShowTime() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.on_time</code>.
     */
    public void setOnTime(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.on_time</code>.
     */
    public Integer getOnTime() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.off_time</code>.
     */
    public void setOffTime(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.off_time</code>.
     */
    public Integer getOffTime() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.consume</code>.
     */
    public void setConsume(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.consume</code>.
     */
    public Long getConsume() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.state</code>.
     */
    public void setState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.state</code>.
     */
    public Integer getState() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>naudit.ara_illegal_material.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>naudit.ara_illegal_material.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, String, Integer, Long, String, Integer, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, Long, Long, String, Integer, Long, String, Integer, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.ID;
    }

    @Override
    public Field<Long> field2() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.CLUE_ID;
    }

    @Override
    public Field<Long> field3() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.AD_URL;
    }

    @Override
    public Field<Integer> field5() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.ACCURACY;
    }

    @Override
    public Field<Long> field6() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.IDEA_ID;
    }

    @Override
    public Field<String> field7() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.SHOW_DETAIL;
    }

    @Override
    public Field<Integer> field8() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.SHOW_TIME;
    }

    @Override
    public Field<Integer> field9() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.ON_TIME;
    }

    @Override
    public Field<Integer> field10() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.OFF_TIME;
    }

    @Override
    public Field<Long> field11() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.CONSUME;
    }

    @Override
    public Field<Integer> field12() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.STATE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return AraIllegalMaterial.ARA_ILLEGAL_MATERIAL.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getClueId();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getAdUrl();
    }

    @Override
    public Integer component5() {
        return getAccuracy();
    }

    @Override
    public Long component6() {
        return getIdeaId();
    }

    @Override
    public String component7() {
        return getShowDetail();
    }

    @Override
    public Integer component8() {
        return getShowTime();
    }

    @Override
    public Integer component9() {
        return getOnTime();
    }

    @Override
    public Integer component10() {
        return getOffTime();
    }

    @Override
    public Long component11() {
        return getConsume();
    }

    @Override
    public Integer component12() {
        return getState();
    }

    @Override
    public LocalDateTime component13() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component14() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getClueId();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getAdUrl();
    }

    @Override
    public Integer value5() {
        return getAccuracy();
    }

    @Override
    public Long value6() {
        return getIdeaId();
    }

    @Override
    public String value7() {
        return getShowDetail();
    }

    @Override
    public Integer value8() {
        return getShowTime();
    }

    @Override
    public Integer value9() {
        return getOnTime();
    }

    @Override
    public Integer value10() {
        return getOffTime();
    }

    @Override
    public Long value11() {
        return getConsume();
    }

    @Override
    public Integer value12() {
        return getState();
    }

    @Override
    public LocalDateTime value13() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value14() {
        return getModifyTime();
    }

    @Override
    public AraIllegalMaterialRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value2(Long value) {
        setClueId(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value4(String value) {
        setAdUrl(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value5(Integer value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value6(Long value) {
        setIdeaId(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value7(String value) {
        setShowDetail(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value8(Integer value) {
        setShowTime(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value9(Integer value) {
        setOnTime(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value10(Integer value) {
        setOffTime(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value11(Long value) {
        setConsume(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value12(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value13(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord value14(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AraIllegalMaterialRecord values(Long value1, Long value2, Long value3, String value4, Integer value5, Long value6, String value7, Integer value8, Integer value9, Integer value10, Long value11, Integer value12, LocalDateTime value13, LocalDateTime value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AraIllegalMaterialRecord
     */
    public AraIllegalMaterialRecord() {
        super(AraIllegalMaterial.ARA_ILLEGAL_MATERIAL);
    }

    /**
     * Create a detached, initialised AraIllegalMaterialRecord
     */
    public AraIllegalMaterialRecord(Long id, Long clueId, Long userId, String adUrl, Integer accuracy, Long ideaId, String showDetail, Integer showTime, Integer onTime, Integer offTime, Long consume, Integer state, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AraIllegalMaterial.ARA_ILLEGAL_MATERIAL);

        setId(id);
        setClueId(clueId);
        setUserId(userId);
        setAdUrl(adUrl);
        setAccuracy(accuracy);
        setIdeaId(ideaId);
        setShowDetail(showDetail);
        setShowTime(showTime);
        setOnTime(onTime);
        setOffTime(offTime);
        setConsume(consume);
        setState(state);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AraIllegalMaterialRecord
     */
    public AraIllegalMaterialRecord(com.tengzhe.jooq.data.naudit.tables.pojos.AraIllegalMaterial value) {
        super(AraIllegalMaterial.ARA_ILLEGAL_MATERIAL);

        if (value != null) {
            setId(value.getId());
            setClueId(value.getClueId());
            setUserId(value.getUserId());
            setAdUrl(value.getAdUrl());
            setAccuracy(value.getAccuracy());
            setIdeaId(value.getIdeaId());
            setShowDetail(value.getShowDetail());
            setShowTime(value.getShowTime());
            setOnTime(value.getOnTime());
            setOffTime(value.getOffTime());
            setConsume(value.getConsume());
            setState(value.getState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
