/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AraCompeteAdSample;

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
public class AraCompeteAdSampleRecord extends UpdatableRecordImpl<AraCompeteAdSampleRecord> implements Record14<Long, Integer, String, String, String, String, String, String, String, String, String, Long, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.ara_compete_ad_sample.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.type</code>.
     */
    public void setType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.type</code>.
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.word</code>.
     */
    public void setWord(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.word</code>.
     */
    public String getWord() {
        return (String) get(2);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.query_url</code>.
     */
    public void setQueryUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.query_url</code>.
     */
    public String getQueryUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.query_snapshot</code>.
     */
    public void setQuerySnapshot(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.query_snapshot</code>.
     */
    public String getQuerySnapshot() {
        return (String) get(4);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.ad_url</code>.
     */
    public void setAdUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.ad_url</code>.
     */
    public String getAdUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.ad_html_url</code>.
     */
    public void setAdHtmlUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.ad_html_url</code>.
     */
    public String getAdHtmlUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.ad_snapshot</code>.
     */
    public void setAdSnapshot(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.ad_snapshot</code>.
     */
    public String getAdSnapshot() {
        return (String) get(7);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.risk_type</code>.
     */
    public void setRiskType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.risk_type</code>.
     */
    public String getRiskType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.hit_words</code>.
     */
    public void setHitWords(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.hit_words</code>.
     */
    public String getHitWords() {
        return (String) get(9);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.audit_tag</code>.
     */
    public void setAuditTag(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.audit_tag</code>.
     */
    public String getAuditTag() {
        return (String) get(10);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.audit_time</code>.
     */
    public void setAuditTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.audit_time</code>.
     */
    public LocalDateTime getAuditTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>material.ara_compete_ad_sample.dt</code>.
     */
    public void setDt(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>material.ara_compete_ad_sample.dt</code>.
     */
    public Integer getDt() {
        return (Integer) get(13);
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
    public Row14<Long, Integer, String, String, String, String, String, String, String, String, String, Long, LocalDateTime, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, Integer, String, String, String, String, String, String, String, String, String, Long, LocalDateTime, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.TYPE;
    }

    @Override
    public Field<String> field3() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.WORD;
    }

    @Override
    public Field<String> field4() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.QUERY_URL;
    }

    @Override
    public Field<String> field5() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.QUERY_SNAPSHOT;
    }

    @Override
    public Field<String> field6() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AD_URL;
    }

    @Override
    public Field<String> field7() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AD_HTML_URL;
    }

    @Override
    public Field<String> field8() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AD_SNAPSHOT;
    }

    @Override
    public Field<String> field9() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.RISK_TYPE;
    }

    @Override
    public Field<String> field10() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.HIT_WORDS;
    }

    @Override
    public Field<String> field11() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AUDIT_TAG;
    }

    @Override
    public Field<Long> field12() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AUDITOR_ID;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.AUDIT_TIME;
    }

    @Override
    public Field<Integer> field14() {
        return AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE.DT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getWord();
    }

    @Override
    public String component4() {
        return getQueryUrl();
    }

    @Override
    public String component5() {
        return getQuerySnapshot();
    }

    @Override
    public String component6() {
        return getAdUrl();
    }

    @Override
    public String component7() {
        return getAdHtmlUrl();
    }

    @Override
    public String component8() {
        return getAdSnapshot();
    }

    @Override
    public String component9() {
        return getRiskType();
    }

    @Override
    public String component10() {
        return getHitWords();
    }

    @Override
    public String component11() {
        return getAuditTag();
    }

    @Override
    public Long component12() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime component13() {
        return getAuditTime();
    }

    @Override
    public Integer component14() {
        return getDt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getWord();
    }

    @Override
    public String value4() {
        return getQueryUrl();
    }

    @Override
    public String value5() {
        return getQuerySnapshot();
    }

    @Override
    public String value6() {
        return getAdUrl();
    }

    @Override
    public String value7() {
        return getAdHtmlUrl();
    }

    @Override
    public String value8() {
        return getAdSnapshot();
    }

    @Override
    public String value9() {
        return getRiskType();
    }

    @Override
    public String value10() {
        return getHitWords();
    }

    @Override
    public String value11() {
        return getAuditTag();
    }

    @Override
    public Long value12() {
        return getAuditorId();
    }

    @Override
    public LocalDateTime value13() {
        return getAuditTime();
    }

    @Override
    public Integer value14() {
        return getDt();
    }

    @Override
    public AraCompeteAdSampleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value2(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value3(String value) {
        setWord(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value4(String value) {
        setQueryUrl(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value5(String value) {
        setQuerySnapshot(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value6(String value) {
        setAdUrl(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value7(String value) {
        setAdHtmlUrl(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value8(String value) {
        setAdSnapshot(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value9(String value) {
        setRiskType(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value10(String value) {
        setHitWords(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value11(String value) {
        setAuditTag(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value12(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value13(LocalDateTime value) {
        setAuditTime(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord value14(Integer value) {
        setDt(value);
        return this;
    }

    @Override
    public AraCompeteAdSampleRecord values(Long value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12, LocalDateTime value13, Integer value14) {
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
     * Create a detached AraCompeteAdSampleRecord
     */
    public AraCompeteAdSampleRecord() {
        super(AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE);
    }

    /**
     * Create a detached, initialised AraCompeteAdSampleRecord
     */
    public AraCompeteAdSampleRecord(Long id, Integer type, String word, String queryUrl, String querySnapshot, String adUrl, String adHtmlUrl, String adSnapshot, String riskType, String hitWords, String auditTag, Long auditorId, LocalDateTime auditTime, Integer dt) {
        super(AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE);

        setId(id);
        setType(type);
        setWord(word);
        setQueryUrl(queryUrl);
        setQuerySnapshot(querySnapshot);
        setAdUrl(adUrl);
        setAdHtmlUrl(adHtmlUrl);
        setAdSnapshot(adSnapshot);
        setRiskType(riskType);
        setHitWords(hitWords);
        setAuditTag(auditTag);
        setAuditorId(auditorId);
        setAuditTime(auditTime);
        setDt(dt);
    }

    /**
     * Create a detached, initialised AraCompeteAdSampleRecord
     */
    public AraCompeteAdSampleRecord(com.tengzhe.jooq.data.material.tables.pojos.AraCompeteAdSample value) {
        super(AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE);

        if (value != null) {
            setId(value.getId());
            setType(value.getType());
            setWord(value.getWord());
            setQueryUrl(value.getQueryUrl());
            setQuerySnapshot(value.getQuerySnapshot());
            setAdUrl(value.getAdUrl());
            setAdHtmlUrl(value.getAdHtmlUrl());
            setAdSnapshot(value.getAdSnapshot());
            setRiskType(value.getRiskType());
            setHitWords(value.getHitWords());
            setAuditTag(value.getAuditTag());
            setAuditorId(value.getAuditorId());
            setAuditTime(value.getAuditTime());
            setDt(value.getDt());
        }
    }
}
