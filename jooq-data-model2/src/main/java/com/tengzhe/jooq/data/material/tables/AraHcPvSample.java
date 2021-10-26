/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AraHcPvSampleRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class AraHcPvSample extends TableImpl<AraHcPvSampleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.ara_hc_pv_sample</code>
     */
    public static final AraHcPvSample ARA_HC_PV_SAMPLE = new AraHcPvSample();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AraHcPvSampleRecord> getRecordType() {
        return AraHcPvSampleRecord.class;
    }

    /**
     * The column <code>material.ara_hc_pv_sample.id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.group_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.campaign_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> CAMPAIGN_ID = createField(DSL.name("campaign_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.creative_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> CREATIVE_ID = createField(DSL.name("creative_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.creative_type</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> CREATIVE_TYPE = createField(DSL.name("creative_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.objective_type</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> OBJECTIVE_TYPE = createField(DSL.name("objective_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.content</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.ad_resource_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> AD_RESOURCE_ID = createField(DSL.name("ad_resource_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.ad_style_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> AD_STYLE_ID = createField(DSL.name("ad_style_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.style</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> STYLE = createField(DSL.name("style"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.account_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.user_source</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> USER_SOURCE = createField(DSL.name("user_source"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.industry1_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> INDUSTRY1_ID = createField(DSL.name("industry1_id"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.industry2_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> INDUSTRY2_ID = createField(DSL.name("industry2_id"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.industry3_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> INDUSTRY3_ID = createField(DSL.name("industry3_id"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.tag_content</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> TAG_CONTENT = createField(DSL.name("tag_content"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.show_time</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> SHOW_TIME = createField(DSL.name("show_time"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.region_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> REGION_ID = createField(DSL.name("region_id"), SQLDataType.BIGINT.defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.bucket_type</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> BUCKET_TYPE = createField(DSL.name("bucket_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.bucket_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> BUCKET_ID = createField(DSL.name("bucket_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.media_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> MEDIA_ID = createField(DSL.name("media_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.os_id</code>.
     */
    public final TableField<AraHcPvSampleRecord, Long> OS_ID = createField(DSL.name("os_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.ua</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> UA = createField(DSL.name("ua"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.event_ip</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> EVENT_IP = createField(DSL.name("event_ip"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.event_ipv6</code>.
     */
    public final TableField<AraHcPvSampleRecord, String> EVENT_IPV6 = createField(DSL.name("event_ipv6"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.create_time</code>.
     */
    public final TableField<AraHcPvSampleRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.dimension</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> DIMENSION = createField(DSL.name("dimension"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.ara_hc_pv_sample.dt</code>.
     */
    public final TableField<AraHcPvSampleRecord, Integer> DT = createField(DSL.name("dt"), SQLDataType.INTEGER, this, "");

    private AraHcPvSample(Name alias, Table<AraHcPvSampleRecord> aliased) {
        this(alias, aliased, null);
    }

    private AraHcPvSample(Name alias, Table<AraHcPvSampleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.ara_hc_pv_sample</code> table reference
     */
    public AraHcPvSample(String alias) {
        this(DSL.name(alias), ARA_HC_PV_SAMPLE);
    }

    /**
     * Create an aliased <code>material.ara_hc_pv_sample</code> table reference
     */
    public AraHcPvSample(Name alias) {
        this(alias, ARA_HC_PV_SAMPLE);
    }

    /**
     * Create a <code>material.ara_hc_pv_sample</code> table reference
     */
    public AraHcPvSample() {
        this(DSL.name("ara_hc_pv_sample"), null);
    }

    public <O extends Record> AraHcPvSample(Table<O> child, ForeignKey<O, AraHcPvSampleRecord> key) {
        super(child, key, ARA_HC_PV_SAMPLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AraHcPvSampleRecord, Long> getIdentity() {
        return (Identity<AraHcPvSampleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AraHcPvSampleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1A;
    }

    @Override
    public AraHcPvSample as(String alias) {
        return new AraHcPvSample(DSL.name(alias), this);
    }

    @Override
    public AraHcPvSample as(Name alias) {
        return new AraHcPvSample(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AraHcPvSample rename(String name) {
        return new AraHcPvSample(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AraHcPvSample rename(Name name) {
        return new AraHcPvSample(name, null);
    }
}
