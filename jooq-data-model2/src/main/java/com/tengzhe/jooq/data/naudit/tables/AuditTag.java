/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables;


import com.tengzhe.jooq.data.naudit.Keys;
import com.tengzhe.jooq.data.naudit.Naudit;
import com.tengzhe.jooq.data.naudit.tables.records.AuditTagRecord;

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
public class AuditTag extends TableImpl<AuditTagRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>naudit.audit_tag</code>
     */
    public static final AuditTag AUDIT_TAG = new AuditTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditTagRecord> getRecordType() {
        return AuditTagRecord.class;
    }

    /**
     * The column <code>naudit.audit_tag.id</code>.
     */
    public final TableField<AuditTagRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>naudit.audit_tag.tag_type</code>.
     */
    public final TableField<AuditTagRecord, Integer> TAG_TYPE = createField(DSL.name("tag_type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>naudit.audit_tag.tag</code>.
     */
    public final TableField<AuditTagRecord, String> TAG = createField(DSL.name("tag"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.audit_tag.display</code>.
     */
    public final TableField<AuditTagRecord, Integer> DISPLAY = createField(DSL.name("display"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_tag.remark</code>.
     */
    public final TableField<AuditTagRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.audit_tag.source</code>.
     */
    public final TableField<AuditTagRecord, Integer> SOURCE = createField(DSL.name("source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_tag.state</code>.
     */
    public final TableField<AuditTagRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    private AuditTag(Name alias, Table<AuditTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditTag(Name alias, Table<AuditTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>naudit.audit_tag</code> table reference
     */
    public AuditTag(String alias) {
        this(DSL.name(alias), AUDIT_TAG);
    }

    /**
     * Create an aliased <code>naudit.audit_tag</code> table reference
     */
    public AuditTag(Name alias) {
        this(alias, AUDIT_TAG);
    }

    /**
     * Create a <code>naudit.audit_tag</code> table reference
     */
    public AuditTag() {
        this(DSL.name("audit_tag"), null);
    }

    public <O extends Record> AuditTag(Table<O> child, ForeignKey<O, AuditTagRecord> key) {
        super(child, key, AUDIT_TAG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Naudit.NAUDIT;
    }

    @Override
    public Identity<AuditTagRecord, Long> getIdentity() {
        return (Identity<AuditTagRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditTagRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_B;
    }

    @Override
    public AuditTag as(String alias) {
        return new AuditTag(DSL.name(alias), this);
    }

    @Override
    public AuditTag as(Name alias) {
        return new AuditTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditTag rename(String name) {
        return new AuditTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditTag rename(Name name) {
        return new AuditTag(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Integer, String, Integer, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}