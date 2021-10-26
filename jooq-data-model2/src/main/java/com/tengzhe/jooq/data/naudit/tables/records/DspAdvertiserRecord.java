/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.DspAdvertiser;

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
public class DspAdvertiserRecord extends UpdatableRecordImpl<DspAdvertiserRecord> implements Record13<Long, String, Long, String, Double, Integer, Double, Integer, String, String, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.dsp_advertiser.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.user_name</code>.
     */
    public void setUserName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.user_name</code>.
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.risk_sample_rate</code>.
     */
    public void setRiskSampleRate(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.risk_sample_rate</code>.
     */
    public Double getRiskSampleRate() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.risk_sample_max</code>.
     */
    public void setRiskSampleMax(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.risk_sample_max</code>.
     */
    public Integer getRiskSampleMax() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.non_risk_sample_rate</code>.
     */
    public void setNonRiskSampleRate(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.non_risk_sample_rate</code>.
     */
    public Double getNonRiskSampleRate() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.non_risk_sample_max</code>.
     */
    public void setNonRiskSampleMax(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.non_risk_sample_max</code>.
     */
    public Integer getNonRiskSampleMax() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.sale</code>.
     */
    public void setSale(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.sale</code>.
     */
    public String getSale() {
        return (String) get(8);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.sale_email</code>.
     */
    public void setSaleEmail(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.sale_email</code>.
     */
    public String getSaleEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.operator_id</code>.
     */
    public void setOperatorId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.operator_id</code>.
     */
    public Long getOperatorId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>naudit.dsp_advertiser.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>naudit.dsp_advertiser.modify_time</code>.
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
    public Row13<Long, String, Long, String, Double, Integer, Double, Integer, String, String, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, String, Long, String, Double, Integer, Double, Integer, String, String, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DspAdvertiser.DSP_ADVERTISER.ID;
    }

    @Override
    public Field<String> field2() {
        return DspAdvertiser.DSP_ADVERTISER.NAME;
    }

    @Override
    public Field<Long> field3() {
        return DspAdvertiser.DSP_ADVERTISER.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return DspAdvertiser.DSP_ADVERTISER.USER_NAME;
    }

    @Override
    public Field<Double> field5() {
        return DspAdvertiser.DSP_ADVERTISER.RISK_SAMPLE_RATE;
    }

    @Override
    public Field<Integer> field6() {
        return DspAdvertiser.DSP_ADVERTISER.RISK_SAMPLE_MAX;
    }

    @Override
    public Field<Double> field7() {
        return DspAdvertiser.DSP_ADVERTISER.NON_RISK_SAMPLE_RATE;
    }

    @Override
    public Field<Integer> field8() {
        return DspAdvertiser.DSP_ADVERTISER.NON_RISK_SAMPLE_MAX;
    }

    @Override
    public Field<String> field9() {
        return DspAdvertiser.DSP_ADVERTISER.SALE;
    }

    @Override
    public Field<String> field10() {
        return DspAdvertiser.DSP_ADVERTISER.SALE_EMAIL;
    }

    @Override
    public Field<Long> field11() {
        return DspAdvertiser.DSP_ADVERTISER.OPERATOR_ID;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return DspAdvertiser.DSP_ADVERTISER.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return DspAdvertiser.DSP_ADVERTISER.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getUserName();
    }

    @Override
    public Double component5() {
        return getRiskSampleRate();
    }

    @Override
    public Integer component6() {
        return getRiskSampleMax();
    }

    @Override
    public Double component7() {
        return getNonRiskSampleRate();
    }

    @Override
    public Integer component8() {
        return getNonRiskSampleMax();
    }

    @Override
    public String component9() {
        return getSale();
    }

    @Override
    public String component10() {
        return getSaleEmail();
    }

    @Override
    public Long component11() {
        return getOperatorId();
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
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getUserName();
    }

    @Override
    public Double value5() {
        return getRiskSampleRate();
    }

    @Override
    public Integer value6() {
        return getRiskSampleMax();
    }

    @Override
    public Double value7() {
        return getNonRiskSampleRate();
    }

    @Override
    public Integer value8() {
        return getNonRiskSampleMax();
    }

    @Override
    public String value9() {
        return getSale();
    }

    @Override
    public String value10() {
        return getSaleEmail();
    }

    @Override
    public Long value11() {
        return getOperatorId();
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
    public DspAdvertiserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value4(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value5(Double value) {
        setRiskSampleRate(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value6(Integer value) {
        setRiskSampleMax(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value7(Double value) {
        setNonRiskSampleRate(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value8(Integer value) {
        setNonRiskSampleMax(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value9(String value) {
        setSale(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value10(String value) {
        setSaleEmail(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value11(Long value) {
        setOperatorId(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value12(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord value13(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public DspAdvertiserRecord values(Long value1, String value2, Long value3, String value4, Double value5, Integer value6, Double value7, Integer value8, String value9, String value10, Long value11, LocalDateTime value12, LocalDateTime value13) {
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
     * Create a detached DspAdvertiserRecord
     */
    public DspAdvertiserRecord() {
        super(DspAdvertiser.DSP_ADVERTISER);
    }

    /**
     * Create a detached, initialised DspAdvertiserRecord
     */
    public DspAdvertiserRecord(Long id, String name, Long userId, String userName, Double riskSampleRate, Integer riskSampleMax, Double nonRiskSampleRate, Integer nonRiskSampleMax, String sale, String saleEmail, Long operatorId, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(DspAdvertiser.DSP_ADVERTISER);

        setId(id);
        setName(name);
        setUserId(userId);
        setUserName(userName);
        setRiskSampleRate(riskSampleRate);
        setRiskSampleMax(riskSampleMax);
        setNonRiskSampleRate(nonRiskSampleRate);
        setNonRiskSampleMax(nonRiskSampleMax);
        setSale(sale);
        setSaleEmail(saleEmail);
        setOperatorId(operatorId);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised DspAdvertiserRecord
     */
    public DspAdvertiserRecord(com.tengzhe.jooq.data.naudit.tables.pojos.DspAdvertiser value) {
        super(DspAdvertiser.DSP_ADVERTISER);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setUserId(value.getUserId());
            setUserName(value.getUserName());
            setRiskSampleRate(value.getRiskSampleRate());
            setRiskSampleMax(value.getRiskSampleMax());
            setNonRiskSampleRate(value.getNonRiskSampleRate());
            setNonRiskSampleMax(value.getNonRiskSampleMax());
            setSale(value.getSale());
            setSaleEmail(value.getSaleEmail());
            setOperatorId(value.getOperatorId());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}