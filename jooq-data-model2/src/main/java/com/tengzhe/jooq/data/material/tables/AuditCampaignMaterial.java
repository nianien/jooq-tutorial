/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditCampaignMaterialRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class AuditCampaignMaterial extends TableImpl<AuditCampaignMaterialRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_campaign_material</code>
     */
    public static final AuditCampaignMaterial AUDIT_CAMPAIGN_MATERIAL = new AuditCampaignMaterial();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditCampaignMaterialRecord> getRecordType() {
        return AuditCampaignMaterialRecord.class;
    }

    /**
     * The column <code>material.audit_campaign_material.id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_campaign_material.user_id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign_material.user_source</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Integer> USER_SOURCE = createField(DSL.name("user_source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign_material.campaign_id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Long> CAMPAIGN_ID = createField(DSL.name("campaign_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign_material.auditor_id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign_material.campaign_time</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, LocalDateTime> CAMPAIGN_TIME = createField(DSL.name("campaign_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_campaign_material.ad_resource_id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Integer> AD_RESOURCE_ID = createField(DSL.name("ad_resource_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign_material.feature</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Integer> FEATURE = createField(DSL.name("feature"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign_material.site_id</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Long> SITE_ID = createField(DSL.name("site_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_campaign_material.state</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_campaign_material.create_time</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_campaign_material.modify_time</code>.
     */
    public final TableField<AuditCampaignMaterialRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditCampaignMaterial(Name alias, Table<AuditCampaignMaterialRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditCampaignMaterial(Name alias, Table<AuditCampaignMaterialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_campaign_material</code> table
     * reference
     */
    public AuditCampaignMaterial(String alias) {
        this(DSL.name(alias), AUDIT_CAMPAIGN_MATERIAL);
    }

    /**
     * Create an aliased <code>material.audit_campaign_material</code> table
     * reference
     */
    public AuditCampaignMaterial(Name alias) {
        this(alias, AUDIT_CAMPAIGN_MATERIAL);
    }

    /**
     * Create a <code>material.audit_campaign_material</code> table reference
     */
    public AuditCampaignMaterial() {
        this(DSL.name("audit_campaign_material"), null);
    }

    public <O extends Record> AuditCampaignMaterial(Table<O> child, ForeignKey<O, AuditCampaignMaterialRecord> key) {
        super(child, key, AUDIT_CAMPAIGN_MATERIAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditCampaignMaterialRecord, Long> getIdentity() {
        return (Identity<AuditCampaignMaterialRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditCampaignMaterialRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_E;
    }

    @Override
    public AuditCampaignMaterial as(String alias) {
        return new AuditCampaignMaterial(DSL.name(alias), this);
    }

    @Override
    public AuditCampaignMaterial as(Name alias) {
        return new AuditCampaignMaterial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditCampaignMaterial rename(String name) {
        return new AuditCampaignMaterial(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditCampaignMaterial rename(Name name) {
        return new AuditCampaignMaterial(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Integer, Long, Long, LocalDateTime, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
