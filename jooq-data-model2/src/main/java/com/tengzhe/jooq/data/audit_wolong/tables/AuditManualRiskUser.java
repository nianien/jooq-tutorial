/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.AuditManualRiskUserRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class AuditManualRiskUser extends TableImpl<AuditManualRiskUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>audit_wolong.audit_manual_risk_user</code>
     */
    public static final AuditManualRiskUser AUDIT_MANUAL_RISK_USER = new AuditManualRiskUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditManualRiskUserRecord> getRecordType() {
        return AuditManualRiskUserRecord.class;
    }

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.id</code>.
     */
    public final TableField<AuditManualRiskUserRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.user_id</code>.
     */
    public final TableField<AuditManualRiskUserRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.create_time</code>.
     */
    public final TableField<AuditManualRiskUserRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.modify_time</code>.
     */
    public final TableField<AuditManualRiskUserRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.risk_type</code>.
     */
    public final TableField<AuditManualRiskUserRecord, Integer> RISK_TYPE = createField(DSL.name("risk_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.task_type</code>.
     */
    public final TableField<AuditManualRiskUserRecord, Integer> TASK_TYPE = createField(DSL.name("task_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_manual_risk_user.operate</code>.
     */
    public final TableField<AuditManualRiskUserRecord, Integer> OPERATE = createField(DSL.name("operate"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    private AuditManualRiskUser(Name alias, Table<AuditManualRiskUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditManualRiskUser(Name alias, Table<AuditManualRiskUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.audit_manual_risk_user</code> table
     * reference
     */
    public AuditManualRiskUser(String alias) {
        this(DSL.name(alias), AUDIT_MANUAL_RISK_USER);
    }

    /**
     * Create an aliased <code>audit_wolong.audit_manual_risk_user</code> table
     * reference
     */
    public AuditManualRiskUser(Name alias) {
        this(alias, AUDIT_MANUAL_RISK_USER);
    }

    /**
     * Create a <code>audit_wolong.audit_manual_risk_user</code> table reference
     */
    public AuditManualRiskUser() {
        this(DSL.name("audit_manual_risk_user"), null);
    }

    public <O extends Record> AuditManualRiskUser(Table<O> child, ForeignKey<O, AuditManualRiskUserRecord> key) {
        super(child, key, AUDIT_MANUAL_RISK_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public Identity<AuditManualRiskUserRecord, Long> getIdentity() {
        return (Identity<AuditManualRiskUserRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditManualRiskUserRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3;
    }

    @Override
    public AuditManualRiskUser as(String alias) {
        return new AuditManualRiskUser(DSL.name(alias), this);
    }

    @Override
    public AuditManualRiskUser as(Name alias) {
        return new AuditManualRiskUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditManualRiskUser rename(String name) {
        return new AuditManualRiskUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditManualRiskUser rename(Name name) {
        return new AuditManualRiskUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, LocalDateTime, LocalDateTime, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}