/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables;


import com.jooq.predefine.converter.LocalDateTime2DateConverter;
import com.tengzhe.jooq.data.audit_dict.AuditDict;
import com.tengzhe.jooq.data.audit_dict.Keys;
import com.tengzhe.jooq.data.audit_dict.tables.records.FlatRiskCustomerRuleRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlatRiskCustomerRule extends TableImpl<FlatRiskCustomerRuleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.flat_risk_customer_rule</code>
     */
    public static final FlatRiskCustomerRule FLAT_RISK_CUSTOMER_RULE = new FlatRiskCustomerRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlatRiskCustomerRuleRecord> getRecordType() {
        return FlatRiskCustomerRuleRecord.class;
    }

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.id</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.risk_rule_id</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Long> RISK_RULE_ID = createField(DSL.name("risk_rule_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.type</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.userid</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Long> USERID = createField(DSL.name("userid"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.apply_product</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Integer> APPLY_PRODUCT = createField(DSL.name("apply_product"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.handle_way</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Integer> HANDLE_WAY = createField(DSL.name("handle_way"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.region_code</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, String> REGION_CODE = createField(DSL.name("region_code"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.effect_date_period</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, String> EFFECT_DATE_PERIOD = createField(DSL.name("effect_date_period"), SQLDataType.VARCHAR(2048).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.blocking_id</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Long> BLOCKING_ID = createField(DSL.name("blocking_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.logic_state</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.next_process_time</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Date> NEXT_PROCESS_TIME = createField(DSL.name("next_process_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTime2DateConverter());

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.create_time</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTime2DateConverter());

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.modify_time</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTime2DateConverter());

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.bucket_type</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, Integer> BUCKET_TYPE = createField(DSL.name("bucket_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.flat_risk_customer_rule.ad_resources</code>.
     */
    public final TableField<FlatRiskCustomerRuleRecord, String> AD_RESOURCES = createField(DSL.name("ad_resources"), SQLDataType.VARCHAR(16).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    private FlatRiskCustomerRule(Name alias, Table<FlatRiskCustomerRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private FlatRiskCustomerRule(Name alias, Table<FlatRiskCustomerRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.flat_risk_customer_rule</code> table reference
     */
    public FlatRiskCustomerRule(String alias) {
        this(DSL.name(alias), FLAT_RISK_CUSTOMER_RULE);
    }

    /**
     * Create an aliased <code>audit_dict.flat_risk_customer_rule</code> table reference
     */
    public FlatRiskCustomerRule(Name alias) {
        this(alias, FLAT_RISK_CUSTOMER_RULE);
    }

    /**
     * Create a <code>audit_dict.flat_risk_customer_rule</code> table reference
     */
    public FlatRiskCustomerRule() {
        this(DSL.name("flat_risk_customer_rule"), null);
    }

    public <O extends Record> FlatRiskCustomerRule(Table<O> child, ForeignKey<O, FlatRiskCustomerRuleRecord> key) {
        super(child, key, FLAT_RISK_CUSTOMER_RULE);
    }

    @Override
    public Schema getSchema() {
        return AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<FlatRiskCustomerRuleRecord, Long> getIdentity() {
        return (Identity<FlatRiskCustomerRuleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FlatRiskCustomerRuleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3;
    }

    @Override
    public List<UniqueKey<FlatRiskCustomerRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<FlatRiskCustomerRuleRecord>>asList(Keys.CONSTRAINT_3);
    }

    @Override
    public FlatRiskCustomerRule as(String alias) {
        return new FlatRiskCustomerRule(DSL.name(alias), this);
    }

    @Override
    public FlatRiskCustomerRule as(Name alias) {
        return new FlatRiskCustomerRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FlatRiskCustomerRule rename(String name) {
        return new FlatRiskCustomerRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FlatRiskCustomerRule rename(Name name) {
        return new FlatRiskCustomerRule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Integer, Long, Integer, Integer, String, String, Long, Integer, Date, Date, Date, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
