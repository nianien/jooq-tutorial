/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.AuditExcludeModelUserRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class AuditExcludeModelUser extends TableImpl<AuditExcludeModelUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>audit_wolong.audit_exclude_model_user</code>
     */
    public static final AuditExcludeModelUser AUDIT_EXCLUDE_MODEL_USER = new AuditExcludeModelUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditExcludeModelUserRecord> getRecordType() {
        return AuditExcludeModelUserRecord.class;
    }

    /**
     * The column <code>audit_wolong.audit_exclude_model_user.id</code>.
     */
    public final TableField<AuditExcludeModelUserRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_exclude_model_user.exclude_user_id</code>.
     */
    public final TableField<AuditExcludeModelUserRecord, Long> EXCLUDE_USER_ID = createField(DSL.name("exclude_user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_exclude_model_user.logic_state</code>.
     */
    public final TableField<AuditExcludeModelUserRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_exclude_model_user.create_time</code>.
     */
    public final TableField<AuditExcludeModelUserRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_exclude_model_user.modify_time</code>.
     */
    public final TableField<AuditExcludeModelUserRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditExcludeModelUser(Name alias, Table<AuditExcludeModelUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditExcludeModelUser(Name alias, Table<AuditExcludeModelUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.audit_exclude_model_user</code>
     * table reference
     */
    public AuditExcludeModelUser(String alias) {
        this(DSL.name(alias), AUDIT_EXCLUDE_MODEL_USER);
    }

    /**
     * Create an aliased <code>audit_wolong.audit_exclude_model_user</code>
     * table reference
     */
    public AuditExcludeModelUser(Name alias) {
        this(alias, AUDIT_EXCLUDE_MODEL_USER);
    }

    /**
     * Create a <code>audit_wolong.audit_exclude_model_user</code> table
     * reference
     */
    public AuditExcludeModelUser() {
        this(DSL.name("audit_exclude_model_user"), null);
    }

    public <O extends Record> AuditExcludeModelUser(Table<O> child, ForeignKey<O, AuditExcludeModelUserRecord> key) {
        super(child, key, AUDIT_EXCLUDE_MODEL_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public Identity<AuditExcludeModelUserRecord, Long> getIdentity() {
        return (Identity<AuditExcludeModelUserRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditExcludeModelUserRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_11;
    }

    @Override
    public AuditExcludeModelUser as(String alias) {
        return new AuditExcludeModelUser(DSL.name(alias), this);
    }

    @Override
    public AuditExcludeModelUser as(Name alias) {
        return new AuditExcludeModelUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditExcludeModelUser rename(String name) {
        return new AuditExcludeModelUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditExcludeModelUser rename(Name name) {
        return new AuditExcludeModelUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
