/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.AuditWhiteWordRecord;

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
public class AuditWhiteWord extends TableImpl<AuditWhiteWordRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_wolong.audit_white_word</code>
     */
    public static final AuditWhiteWord AUDIT_WHITE_WORD = new AuditWhiteWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditWhiteWordRecord> getRecordType() {
        return AuditWhiteWordRecord.class;
    }

    /**
     * The column <code>audit_wolong.audit_white_word.id</code>.
     */
    public final TableField<AuditWhiteWordRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.word</code>.
     */
    public final TableField<AuditWhiteWordRecord, String> WORD = createField(DSL.name("word"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.word_type</code>.
     */
    public final TableField<AuditWhiteWordRecord, Integer> WORD_TYPE = createField(DSL.name("word_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.logic_state</code>.
     */
    public final TableField<AuditWhiteWordRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.create_time</code>.
     */
    public final TableField<AuditWhiteWordRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.modify_time</code>.
     */
    public final TableField<AuditWhiteWordRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_white_word.risk_tag</code>.
     */
    public final TableField<AuditWhiteWordRecord, Long> RISK_TAG = createField(DSL.name("risk_tag"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    private AuditWhiteWord(Name alias, Table<AuditWhiteWordRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditWhiteWord(Name alias, Table<AuditWhiteWordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.audit_white_word</code> table
     * reference
     */
    public AuditWhiteWord(String alias) {
        this(DSL.name(alias), AUDIT_WHITE_WORD);
    }

    /**
     * Create an aliased <code>audit_wolong.audit_white_word</code> table
     * reference
     */
    public AuditWhiteWord(Name alias) {
        this(alias, AUDIT_WHITE_WORD);
    }

    /**
     * Create a <code>audit_wolong.audit_white_word</code> table reference
     */
    public AuditWhiteWord() {
        this(DSL.name("audit_white_word"), null);
    }

    public <O extends Record> AuditWhiteWord(Table<O> child, ForeignKey<O, AuditWhiteWordRecord> key) {
        super(child, key, AUDIT_WHITE_WORD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public Identity<AuditWhiteWordRecord, Long> getIdentity() {
        return (Identity<AuditWhiteWordRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditWhiteWordRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_64;
    }

    @Override
    public AuditWhiteWord as(String alias) {
        return new AuditWhiteWord(DSL.name(alias), this);
    }

    @Override
    public AuditWhiteWord as(Name alias) {
        return new AuditWhiteWord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditWhiteWord rename(String name) {
        return new AuditWhiteWord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditWhiteWord rename(Name name) {
        return new AuditWhiteWord(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Integer, Integer, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}