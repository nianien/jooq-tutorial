/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditBrandCreativeLogHistoryRecord;

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
public class AuditBrandCreativeLogHistory extends TableImpl<AuditBrandCreativeLogHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>material.audit_brand_creative_log_history</code>
     */
    public static final AuditBrandCreativeLogHistory AUDIT_BRAND_CREATIVE_LOG_HISTORY = new AuditBrandCreativeLogHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditBrandCreativeLogHistoryRecord> getRecordType() {
        return AuditBrandCreativeLogHistoryRecord.class;
    }

    /**
     * The column <code>material.audit_brand_creative_log_history.id</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.creative_id</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Long> CREATIVE_ID = createField(DSL.name("creative_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.user_id</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.audit_brand_creative_log_history.name</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>material.audit_brand_creative_log_history.media</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> MEDIA = createField(DSL.name("media"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.resource_type</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> RESOURCE_TYPE = createField(DSL.name("resource_type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.ad_style_id</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> AD_STYLE_ID = createField(DSL.name("ad_style_id"), SQLDataType.INTEGER.defaultValue(DSL.field("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.ad_style_type</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> AD_STYLE_TYPE = createField(DSL.name("ad_style_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.content</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.logic_state</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.version</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_brand_creative_log_history.state</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.state_detail</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, Integer> STATE_DETAIL = createField(DSL.name("state_detail"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.audit_type</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, String> AUDIT_TYPE = createField(DSL.name("audit_type"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.audit_detail</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, String> AUDIT_DETAIL = createField(DSL.name("audit_detail"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>material.audit_brand_creative_log_history.create_time</code>.
     */
    public final TableField<AuditBrandCreativeLogHistoryRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditBrandCreativeLogHistory(Name alias, Table<AuditBrandCreativeLogHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditBrandCreativeLogHistory(Name alias, Table<AuditBrandCreativeLogHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_brand_creative_log_history</code>
     * table reference
     */
    public AuditBrandCreativeLogHistory(String alias) {
        this(DSL.name(alias), AUDIT_BRAND_CREATIVE_LOG_HISTORY);
    }

    /**
     * Create an aliased <code>material.audit_brand_creative_log_history</code>
     * table reference
     */
    public AuditBrandCreativeLogHistory(Name alias) {
        this(alias, AUDIT_BRAND_CREATIVE_LOG_HISTORY);
    }

    /**
     * Create a <code>material.audit_brand_creative_log_history</code> table
     * reference
     */
    public AuditBrandCreativeLogHistory() {
        this(DSL.name("audit_brand_creative_log_history"), null);
    }

    public <O extends Record> AuditBrandCreativeLogHistory(Table<O> child, ForeignKey<O, AuditBrandCreativeLogHistoryRecord> key) {
        super(child, key, AUDIT_BRAND_CREATIVE_LOG_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditBrandCreativeLogHistoryRecord, Long> getIdentity() {
        return (Identity<AuditBrandCreativeLogHistoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditBrandCreativeLogHistoryRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7C;
    }

    @Override
    public AuditBrandCreativeLogHistory as(String alias) {
        return new AuditBrandCreativeLogHistory(DSL.name(alias), this);
    }

    @Override
    public AuditBrandCreativeLogHistory as(Name alias) {
        return new AuditBrandCreativeLogHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditBrandCreativeLogHistory rename(String name) {
        return new AuditBrandCreativeLogHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditBrandCreativeLogHistory rename(Name name) {
        return new AuditBrandCreativeLogHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, Long, String, Integer, Integer, Integer, Integer, String, Integer, Long, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
