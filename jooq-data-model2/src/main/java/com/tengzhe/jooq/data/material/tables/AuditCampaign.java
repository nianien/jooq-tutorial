/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditCampaignRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class AuditCampaign extends TableImpl<AuditCampaignRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_campaign</code>
     */
    public static final AuditCampaign AUDIT_CAMPAIGN = new AuditCampaign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditCampaignRecord> getRecordType() {
        return AuditCampaignRecord.class;
    }

    /**
     * The column <code>material.audit_campaign.id</code>.
     */
    public final TableField<AuditCampaignRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_campaign.entity_id</code>.
     */
    public final TableField<AuditCampaignRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign.version</code>.
     */
    public final TableField<AuditCampaignRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign.audit_type</code>.
     */
    public final TableField<AuditCampaignRecord, Integer> AUDIT_TYPE = createField(DSL.name("audit_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign.user_id</code>.
     */
    public final TableField<AuditCampaignRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign.campaign_id</code>.
     */
    public final TableField<AuditCampaignRecord, Long> CAMPAIGN_ID = createField(DSL.name("campaign_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign.audit_state</code>.
     */
    public final TableField<AuditCampaignRecord, Integer> AUDIT_STATE = createField(DSL.name("audit_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign.auditor_id</code>.
     */
    public final TableField<AuditCampaignRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign.reason_code</code>.
     */
    public final TableField<AuditCampaignRecord, String> REASON_CODE = createField(DSL.name("reason_code"), SQLDataType.VARCHAR(4096).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_campaign.reason</code>.
     */
    public final TableField<AuditCampaignRecord, String> REASON = createField(DSL.name("reason"), SQLDataType.VARCHAR(4096).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_campaign.audit_start_time</code>.
     */
    public final TableField<AuditCampaignRecord, LocalDateTime> AUDIT_START_TIME = createField(DSL.name("audit_start_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_campaign.audit_end_time</code>.
     */
    public final TableField<AuditCampaignRecord, LocalDateTime> AUDIT_END_TIME = createField(DSL.name("audit_end_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'2000-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_campaign.extend</code>.
     */
    public final TableField<AuditCampaignRecord, String> EXTEND = createField(DSL.name("extend"), SQLDataType.VARCHAR(4096).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_campaign.modify_time</code>.
     */
    public final TableField<AuditCampaignRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_campaign.modify_day_tag</code>.
     */
    public final TableField<AuditCampaignRecord, Integer> MODIFY_DAY_TAG = createField(DSL.name("modify_day_tag"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign.create_time</code>.
     */
    public final TableField<AuditCampaignRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditCampaign(Name alias, Table<AuditCampaignRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditCampaign(Name alias, Table<AuditCampaignRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_campaign</code> table reference
     */
    public AuditCampaign(String alias) {
        this(DSL.name(alias), AUDIT_CAMPAIGN);
    }

    /**
     * Create an aliased <code>material.audit_campaign</code> table reference
     */
    public AuditCampaign(Name alias) {
        this(alias, AUDIT_CAMPAIGN);
    }

    /**
     * Create a <code>material.audit_campaign</code> table reference
     */
    public AuditCampaign() {
        this(DSL.name("audit_campaign"), null);
    }

    public <O extends Record> AuditCampaign(Table<O> child, ForeignKey<O, AuditCampaignRecord> key) {
        super(child, key, AUDIT_CAMPAIGN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditCampaignRecord, Long> getIdentity() {
        return (Identity<AuditCampaignRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditCampaignRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_5;
    }

    @Override
    public AuditCampaign as(String alias) {
        return new AuditCampaign(DSL.name(alias), this);
    }

    @Override
    public AuditCampaign as(Name alias) {
        return new AuditCampaign(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditCampaign rename(String name) {
        return new AuditCampaign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditCampaign rename(Name name) {
        return new AuditCampaign(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, Integer, Long, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
