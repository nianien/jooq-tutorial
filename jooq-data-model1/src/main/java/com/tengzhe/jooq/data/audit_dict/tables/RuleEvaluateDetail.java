/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables;


import com.tengzhe.jooq.data.audit_dict.AuditDict;
import com.tengzhe.jooq.data.audit_dict.Keys;
import com.tengzhe.jooq.data.audit_dict.tables.records.RuleEvaluateDetailRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class RuleEvaluateDetail extends TableImpl<RuleEvaluateDetailRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.rule_evaluate_detail</code>
     */
    public static final RuleEvaluateDetail RULE_EVALUATE_DETAIL = new RuleEvaluateDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleEvaluateDetailRecord> getRecordType() {
        return RuleEvaluateDetailRecord.class;
    }

    /**
     * The column <code>audit_dict.rule_evaluate_detail.id</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.eval_id</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> EVAL_ID = createField(DSL.name("eval_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.rule_id</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> RULE_ID = createField(DSL.name("rule_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.user_id</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.idea_id</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> IDEA_ID = createField(DSL.name("idea_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.content</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.word</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, String> WORD = createField(DSL.name("word"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.consume</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> CONSUME = createField(DSL.name("consume"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.biz_type</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, Long> BIZ_TYPE = createField(DSL.name("biz_type"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.eval_date</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, String> EVAL_DATE = createField(DSL.name("eval_date"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.rule_evaluate_detail.create_time</code>.
     */
    public final TableField<RuleEvaluateDetailRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private RuleEvaluateDetail(Name alias, Table<RuleEvaluateDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleEvaluateDetail(Name alias, Table<RuleEvaluateDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.rule_evaluate_detail</code> table
     * reference
     */
    public RuleEvaluateDetail(String alias) {
        this(DSL.name(alias), RULE_EVALUATE_DETAIL);
    }

    /**
     * Create an aliased <code>audit_dict.rule_evaluate_detail</code> table
     * reference
     */
    public RuleEvaluateDetail(Name alias) {
        this(alias, RULE_EVALUATE_DETAIL);
    }

    /**
     * Create a <code>audit_dict.rule_evaluate_detail</code> table reference
     */
    public RuleEvaluateDetail() {
        this(DSL.name("rule_evaluate_detail"), null);
    }

    public <O extends Record> RuleEvaluateDetail(Table<O> child, ForeignKey<O, RuleEvaluateDetailRecord> key) {
        super(child, key, RULE_EVALUATE_DETAIL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<RuleEvaluateDetailRecord, Long> getIdentity() {
        return (Identity<RuleEvaluateDetailRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RuleEvaluateDetailRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_E2;
    }

    @Override
    public RuleEvaluateDetail as(String alias) {
        return new RuleEvaluateDetail(DSL.name(alias), this);
    }

    @Override
    public RuleEvaluateDetail as(Name alias) {
        return new RuleEvaluateDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleEvaluateDetail rename(String name) {
        return new RuleEvaluateDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleEvaluateDetail rename(Name name) {
        return new RuleEvaluateDetail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Long, Long, Long, String, String, Long, Long, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
