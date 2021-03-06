/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables;


import com.jooq.predefine.converter.LocalDateTimeConverter;
import com.tengzhe.jooq.data.audit_dict.AuditDict;
import com.tengzhe.jooq.data.audit_dict.Keys;
import com.tengzhe.jooq.data.audit_dict.tables.records.RiskCustomerRuleRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskCustomerRule extends TableImpl<RiskCustomerRuleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.risk_customer_rule</code>
     */
    public static final RiskCustomerRule RISK_CUSTOMER_RULE = new RiskCustomerRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RiskCustomerRuleRecord> getRecordType() {
        return RiskCustomerRuleRecord.class;
    }

    /**
     * The column <code>audit_dict.risk_customer_rule.id</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.type</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.content</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.risk_type</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> RISK_TYPE = createField(DSL.name("risk_type"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.add_reason</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> ADD_REASON = createField(DSL.name("add_reason"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.apply_product</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> APPLY_PRODUCT = createField(DSL.name("apply_product"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.handle_way</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> HANDLE_WAY = createField(DSL.name("handle_way"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.region_code</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> REGION_CODE = createField(DSL.name("region_code"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.effect_date_period</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> EFFECT_DATE_PERIOD = createField(DSL.name("effect_date_period"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.remark</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.logic_state</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.operator_id</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Long> OPERATOR_ID = createField(DSL.name("operator_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.operator_name</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> OPERATOR_NAME = createField(DSL.name("operator_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.operate_time</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Date> OPERATE_TIME = createField(DSL.name("operate_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.risk_customer_rule.create_time</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.risk_customer_rule.modify_time</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.risk_customer_rule.bucket_type</code>.
     */
    public final TableField<RiskCustomerRuleRecord, Integer> BUCKET_TYPE = createField(DSL.name("bucket_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.risk_customer_rule.ad_resources</code>.
     */
    public final TableField<RiskCustomerRuleRecord, String> AD_RESOURCES = createField(DSL.name("ad_resources"), SQLDataType.VARCHAR(16).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    private RiskCustomerRule(Name alias, Table<RiskCustomerRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private RiskCustomerRule(Name alias, Table<RiskCustomerRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.risk_customer_rule</code> table reference
     */
    public RiskCustomerRule(String alias) {
        this(DSL.name(alias), RISK_CUSTOMER_RULE);
    }

    /**
     * Create an aliased <code>audit_dict.risk_customer_rule</code> table reference
     */
    public RiskCustomerRule(Name alias) {
        this(alias, RISK_CUSTOMER_RULE);
    }

    /**
     * Create a <code>audit_dict.risk_customer_rule</code> table reference
     */
    public RiskCustomerRule() {
        this(DSL.name("risk_customer_rule"), null);
    }

    public <O extends Record> RiskCustomerRule(Table<O> child, ForeignKey<O, RiskCustomerRuleRecord> key) {
        super(child, key, RISK_CUSTOMER_RULE);
    }

    @Override
    public Schema getSchema() {
        return AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<RiskCustomerRuleRecord, Long> getIdentity() {
        return (Identity<RiskCustomerRuleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RiskCustomerRuleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D;
    }

    @Override
    public List<UniqueKey<RiskCustomerRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<RiskCustomerRuleRecord>>asList(Keys.CONSTRAINT_D);
    }

    @Override
    public RiskCustomerRule as(String alias) {
        return new RiskCustomerRule(DSL.name(alias), this);
    }

    @Override
    public RiskCustomerRule as(Name alias) {
        return new RiskCustomerRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCustomerRule rename(String name) {
        return new RiskCustomerRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCustomerRule rename(Name name) {
        return new RiskCustomerRule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Integer, String, String, Integer, Integer, Integer, String, String, String, Integer, Long, String, Date, Date, Date, Integer, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
