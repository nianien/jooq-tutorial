/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables;


import com.katana.jooq.entity.audit_dict.AuditDict;
import com.katana.jooq.entity.audit_dict.Keys;
import com.katana.jooq.entity.audit_dict.tables.records.SyncWordRuleRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import com.cudrania.jooq.converter.LocalDateTimeConverter;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SyncWordRule extends TableImpl<SyncWordRuleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.sync_word_rule</code>
     */
    public static final SyncWordRule SYNC_WORD_RULE = new SyncWordRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SyncWordRuleRecord> getRecordType() {
        return SyncWordRuleRecord.class;
    }

    /**
     * The column <code>audit_dict.sync_word_rule.id</code>.
     */
    public final TableField<SyncWordRuleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.sync_type</code>.
     */
    public final TableField<SyncWordRuleRecord, Integer> SYNC_TYPE = createField(DSL.name("sync_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.word_type</code>.
     */
    public final TableField<SyncWordRuleRecord, String> WORD_TYPE = createField(DSL.name("word_type"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.source_id</code>.
     */
    public final TableField<SyncWordRuleRecord, String> SOURCE_ID = createField(DSL.name("source_id"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.target_id</code>.
     */
    public final TableField<SyncWordRuleRecord, String> TARGET_ID = createField(DSL.name("target_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.status</code>.
     */
    public final TableField<SyncWordRuleRecord, Integer> STATUS = createField(DSL.name("status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.operator_id</code>.
     */
    public final TableField<SyncWordRuleRecord, Long> OPERATOR_ID = createField(DSL.name("operator_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.sync_word_rule.create_time</code>.
     */
    public final TableField<SyncWordRuleRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.sync_word_rule.modify_time</code>.
     */
    public final TableField<SyncWordRuleRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    private SyncWordRule(Name alias, Table<SyncWordRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SyncWordRule(Name alias, Table<SyncWordRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.sync_word_rule</code> table reference
     */
    public SyncWordRule(String alias) {
        this(DSL.name(alias), SYNC_WORD_RULE);
    }

    /**
     * Create an aliased <code>audit_dict.sync_word_rule</code> table reference
     */
    public SyncWordRule(Name alias) {
        this(alias, SYNC_WORD_RULE);
    }

    /**
     * Create a <code>audit_dict.sync_word_rule</code> table reference
     */
    public SyncWordRule() {
        this(DSL.name("sync_word_rule"), null);
    }

    public <O extends Record> SyncWordRule(Table<O> child, ForeignKey<O, SyncWordRuleRecord> key) {
        super(child, key, SYNC_WORD_RULE);
    }

    @Override
    public Schema getSchema() {
        return AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<SyncWordRuleRecord, Long> getIdentity() {
        return (Identity<SyncWordRuleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SyncWordRuleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_F;
    }

    @Override
    public List<UniqueKey<SyncWordRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<SyncWordRuleRecord>>asList(Keys.CONSTRAINT_F);
    }

    @Override
    public SyncWordRule as(String alias) {
        return new SyncWordRule(DSL.name(alias), this);
    }

    @Override
    public SyncWordRule as(Name alias) {
        return new SyncWordRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncWordRule rename(String name) {
        return new SyncWordRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SyncWordRule rename(Name name) {
        return new SyncWordRule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Integer, String, String, String, Integer, Long, Date, Date> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
