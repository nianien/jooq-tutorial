/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.AuditBrandWordRecord;

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
public class AuditBrandWord extends TableImpl<AuditBrandWordRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_wolong.audit_brand_word</code>
     */
    public static final AuditBrandWord AUDIT_BRAND_WORD = new AuditBrandWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditBrandWordRecord> getRecordType() {
        return AuditBrandWordRecord.class;
    }

    /**
     * The column <code>audit_wolong.audit_brand_word.id</code>.
     */
    public final TableField<AuditBrandWordRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.operatorid</code>.
     */
    public final TableField<AuditBrandWordRecord, Long> OPERATORID = createField(DSL.name("operatorid"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.keyword</code>.
     */
    public final TableField<AuditBrandWordRecord, String> KEYWORD = createField(DSL.name("keyword"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_brand_word.creative_confine_type</code>.
     */
    public final TableField<AuditBrandWordRecord, Integer> CREATIVE_CONFINE_TYPE = createField(DSL.name("creative_confine_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.brand_user</code>.
     */
    public final TableField<AuditBrandWordRecord, String> BRAND_USER = createField(DSL.name("brand_user"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.brand_num</code>.
     */
    public final TableField<AuditBrandWordRecord, String> BRAND_NUM = createField(DSL.name("brand_num"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.brand_deadline</code>.
     */
    public final TableField<AuditBrandWordRecord, String> BRAND_DEADLINE = createField(DSL.name("brand_deadline"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.remark</code>.
     */
    public final TableField<AuditBrandWordRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.create_time</code>.
     */
    public final TableField<AuditBrandWordRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'1970-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.modify_time</code>.
     */
    public final TableField<AuditBrandWordRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.indus_ids</code>.
     */
    public final TableField<AuditBrandWordRecord, String> INDUS_IDS = createField(DSL.name("indus_ids"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("'0'", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.status</code>.
     */
    public final TableField<AuditBrandWordRecord, Integer> STATUS = createField(DSL.name("status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'5'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.ref_id</code>.
     */
    public final TableField<AuditBrandWordRecord, Long> REF_ID = createField(DSL.name("ref_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.city_hash</code>.
     */
    public final TableField<AuditBrandWordRecord, Long> CITY_HASH = createField(DSL.name("city_hash"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.effective_time</code>.
     */
    public final TableField<AuditBrandWordRecord, LocalDateTime> EFFECTIVE_TIME = createField(DSL.name("effective_time"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.audit_brand_word.ineffective_time</code>.
     */
    public final TableField<AuditBrandWordRecord, LocalDateTime> INEFFECTIVE_TIME = createField(DSL.name("ineffective_time"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    private AuditBrandWord(Name alias, Table<AuditBrandWordRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditBrandWord(Name alias, Table<AuditBrandWordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.audit_brand_word</code> table
     * reference
     */
    public AuditBrandWord(String alias) {
        this(DSL.name(alias), AUDIT_BRAND_WORD);
    }

    /**
     * Create an aliased <code>audit_wolong.audit_brand_word</code> table
     * reference
     */
    public AuditBrandWord(Name alias) {
        this(alias, AUDIT_BRAND_WORD);
    }

    /**
     * Create a <code>audit_wolong.audit_brand_word</code> table reference
     */
    public AuditBrandWord() {
        this(DSL.name("audit_brand_word"), null);
    }

    public <O extends Record> AuditBrandWord(Table<O> child, ForeignKey<O, AuditBrandWordRecord> key) {
        super(child, key, AUDIT_BRAND_WORD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public Identity<AuditBrandWordRecord, Long> getIdentity() {
        return (Identity<AuditBrandWordRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditBrandWordRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    @Override
    public AuditBrandWord as(String alias) {
        return new AuditBrandWord(DSL.name(alias), this);
    }

    @Override
    public AuditBrandWord as(Name alias) {
        return new AuditBrandWord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditBrandWord rename(String name) {
        return new AuditBrandWord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditBrandWord rename(Name name) {
        return new AuditBrandWord(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, String, Integer, String, String, String, String, LocalDateTime, LocalDateTime, String, Integer, Long, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}