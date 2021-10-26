/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditPatrolRiskRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class AuditPatrolRisk extends TableImpl<AuditPatrolRiskRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_patrol_risk</code>
     */
    public static final AuditPatrolRisk AUDIT_PATROL_RISK = new AuditPatrolRisk();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditPatrolRiskRecord> getRecordType() {
        return AuditPatrolRiskRecord.class;
    }

    /**
     * The column <code>material.audit_patrol_risk.id</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_patrol_risk.entity_id</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_risk.type</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.patrol_type</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Integer> PATROL_TYPE = createField(DSL.name("patrol_type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_risk.uc_id</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Long> UC_ID = createField(DSL.name("uc_id"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.user_id</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.target_url</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> TARGET_URL = createField(DSL.name("target_url"), SQLDataType.VARCHAR(1024).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.effect_url</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> EFFECT_URL = createField(DSL.name("effect_url"), SQLDataType.VARCHAR(1024).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.hit_words</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> HIT_WORDS = createField(DSL.name("hit_words"), SQLDataType.VARCHAR(2048).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.risk_type</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> RISK_TYPE = createField(DSL.name("risk_type"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>material.audit_patrol_risk.risk_rate</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> RISK_RATE = createField(DSL.name("risk_rate"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.url_snapshot</code>.
     */
    public final TableField<AuditPatrolRiskRecord, String> URL_SNAPSHOT = createField(DSL.name("url_snapshot"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.patrol_date</code>.
     */
    public final TableField<AuditPatrolRiskRecord, Integer> PATROL_DATE = createField(DSL.name("patrol_date"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>material.audit_patrol_risk.create_time</code>.
     */
    public final TableField<AuditPatrolRiskRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_patrol_risk.modify_time</code>.
     */
    public final TableField<AuditPatrolRiskRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditPatrolRisk(Name alias, Table<AuditPatrolRiskRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditPatrolRisk(Name alias, Table<AuditPatrolRiskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_patrol_risk</code> table reference
     */
    public AuditPatrolRisk(String alias) {
        this(DSL.name(alias), AUDIT_PATROL_RISK);
    }

    /**
     * Create an aliased <code>material.audit_patrol_risk</code> table reference
     */
    public AuditPatrolRisk(Name alias) {
        this(alias, AUDIT_PATROL_RISK);
    }

    /**
     * Create a <code>material.audit_patrol_risk</code> table reference
     */
    public AuditPatrolRisk() {
        this(DSL.name("audit_patrol_risk"), null);
    }

    public <O extends Record> AuditPatrolRisk(Table<O> child, ForeignKey<O, AuditPatrolRiskRecord> key) {
        super(child, key, AUDIT_PATROL_RISK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditPatrolRiskRecord, Long> getIdentity() {
        return (Identity<AuditPatrolRiskRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditPatrolRiskRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_26;
    }

    @Override
    public AuditPatrolRisk as(String alias) {
        return new AuditPatrolRisk(DSL.name(alias), this);
    }

    @Override
    public AuditPatrolRisk as(Name alias) {
        return new AuditPatrolRisk(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditPatrolRisk rename(String name) {
        return new AuditPatrolRisk(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditPatrolRisk rename(Name name) {
        return new AuditPatrolRisk(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Integer, Integer, Long, Long, String, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
