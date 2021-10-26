/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditPatrolCampaignRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class AuditPatrolCampaign extends TableImpl<AuditPatrolCampaignRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_patrol_campaign</code>
     */
    public static final AuditPatrolCampaign AUDIT_PATROL_CAMPAIGN = new AuditPatrolCampaign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditPatrolCampaignRecord> getRecordType() {
        return AuditPatrolCampaignRecord.class;
    }

    /**
     * The column <code>material.audit_patrol_campaign.id</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.patrol_type</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Integer> PATROL_TYPE = createField(DSL.name("patrol_type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.campaign_id</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Long> CAMPAIGN_ID = createField(DSL.name("campaign_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.user_id</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.target_url</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> TARGET_URL = createField(DSL.name("target_url"), SQLDataType.VARCHAR(1024).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.effect_url</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> EFFECT_URL = createField(DSL.name("effect_url"), SQLDataType.VARCHAR(1024).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.hit_words</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> HIT_WORDS = createField(DSL.name("hit_words"), SQLDataType.VARCHAR(2048).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.risk_type</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> RISK_TYPE = createField(DSL.name("risk_type"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.risk_rate</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> RISK_RATE = createField(DSL.name("risk_rate"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.url_snapshot</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> URL_SNAPSHOT = createField(DSL.name("url_snapshot"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.operate</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Integer> OPERATE = createField(DSL.name("operate"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.audit_tag</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, String> AUDIT_TAG = createField(DSL.name("audit_tag"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.auditor_id</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.audit_time</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, LocalDateTime> AUDIT_TIME = createField(DSL.name("audit_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.patrol_date</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, Integer> PATROL_DATE = createField(DSL.name("patrol_date"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>material.audit_patrol_campaign.create_time</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_patrol_campaign.modify_time</code>.
     */
    public final TableField<AuditPatrolCampaignRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditPatrolCampaign(Name alias, Table<AuditPatrolCampaignRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditPatrolCampaign(Name alias, Table<AuditPatrolCampaignRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_patrol_campaign</code> table
     * reference
     */
    public AuditPatrolCampaign(String alias) {
        this(DSL.name(alias), AUDIT_PATROL_CAMPAIGN);
    }

    /**
     * Create an aliased <code>material.audit_patrol_campaign</code> table
     * reference
     */
    public AuditPatrolCampaign(Name alias) {
        this(alias, AUDIT_PATROL_CAMPAIGN);
    }

    /**
     * Create a <code>material.audit_patrol_campaign</code> table reference
     */
    public AuditPatrolCampaign() {
        this(DSL.name("audit_patrol_campaign"), null);
    }

    public <O extends Record> AuditPatrolCampaign(Table<O> child, ForeignKey<O, AuditPatrolCampaignRecord> key) {
        super(child, key, AUDIT_PATROL_CAMPAIGN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditPatrolCampaignRecord, Long> getIdentity() {
        return (Identity<AuditPatrolCampaignRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditPatrolCampaignRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_DC;
    }

    @Override
    public AuditPatrolCampaign as(String alias) {
        return new AuditPatrolCampaign(DSL.name(alias), this);
    }

    @Override
    public AuditPatrolCampaign as(Name alias) {
        return new AuditPatrolCampaign(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditPatrolCampaign rename(String name) {
        return new AuditPatrolCampaign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditPatrolCampaign rename(Name name) {
        return new AuditPatrolCampaign(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Integer, Long, Long, String, String, String, String, String, String, Integer, String, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
