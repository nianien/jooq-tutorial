/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditRuleSetRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class AuditRuleSet extends TableImpl<AuditRuleSetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_rule_set</code>
     */
    public static final AuditRuleSet AUDIT_RULE_SET = new AuditRuleSet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditRuleSetRecord> getRecordType() {
        return AuditRuleSetRecord.class;
    }

    /**
     * The column <code>material.audit_rule_set.id</code>.
     */
    public final TableField<AuditRuleSetRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_rule_set.entity_type</code>.
     */
    public final TableField<AuditRuleSetRecord, Integer> ENTITY_TYPE = createField(DSL.name("entity_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_rule_set.audit_type</code>.
     */
    public final TableField<AuditRuleSetRecord, Integer> AUDIT_TYPE = createField(DSL.name("audit_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_rule_set.version</code>.
     */
    public final TableField<AuditRuleSetRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.audit_rule_set.state</code>.
     */
    public final TableField<AuditRuleSetRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_rule_set.rule</code>.
     */
    public final TableField<AuditRuleSetRecord, String> RULE = createField(DSL.name("rule"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>material.audit_rule_set.default_audit_state</code>.
     */
    public final TableField<AuditRuleSetRecord, Integer> DEFAULT_AUDIT_STATE = createField(DSL.name("default_audit_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_rule_set.description</code>.
     */
    public final TableField<AuditRuleSetRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>material.audit_rule_set.auditor_id</code>.
     */
    public final TableField<AuditRuleSetRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_rule_set.start_time</code>.
     */
    public final TableField<AuditRuleSetRecord, LocalDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>material.audit_rule_set.end_time</code>.
     */
    public final TableField<AuditRuleSetRecord, LocalDateTime> END_TIME = createField(DSL.name("end_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>material.audit_rule_set.create_time</code>.
     */
    public final TableField<AuditRuleSetRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_rule_set.modify_time</code>.
     */
    public final TableField<AuditRuleSetRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditRuleSet(Name alias, Table<AuditRuleSetRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditRuleSet(Name alias, Table<AuditRuleSetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_rule_set</code> table reference
     */
    public AuditRuleSet(String alias) {
        this(DSL.name(alias), AUDIT_RULE_SET);
    }

    /**
     * Create an aliased <code>material.audit_rule_set</code> table reference
     */
    public AuditRuleSet(Name alias) {
        this(alias, AUDIT_RULE_SET);
    }

    /**
     * Create a <code>material.audit_rule_set</code> table reference
     */
    public AuditRuleSet() {
        this(DSL.name("audit_rule_set"), null);
    }

    public <O extends Record> AuditRuleSet(Table<O> child, ForeignKey<O, AuditRuleSetRecord> key) {
        super(child, key, AUDIT_RULE_SET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditRuleSetRecord, Long> getIdentity() {
        return (Identity<AuditRuleSetRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditRuleSetRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8E;
    }

    @Override
    public AuditRuleSet as(String alias) {
        return new AuditRuleSet(DSL.name(alias), this);
    }

    @Override
    public AuditRuleSet as(Name alias) {
        return new AuditRuleSet(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditRuleSet rename(String name) {
        return new AuditRuleSet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditRuleSet rename(Name name) {
        return new AuditRuleSet(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Integer, Integer, Long, Integer, String, Integer, String, Long, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}