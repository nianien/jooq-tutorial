/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict;


import com.katana.jooq.entity.DefaultCatalog;
import com.katana.jooq.entity.audit_dict.tables.AuditRiskCategory;
import com.katana.jooq.entity.audit_dict.tables.AuditRiskTag;
import com.katana.jooq.entity.audit_dict.tables.AuditSimilarWord;
import com.katana.jooq.entity.audit_dict.tables.AuditStrategyConfig;
import com.katana.jooq.entity.audit_dict.tables.AuditTypeRiskTagConfig;
import com.katana.jooq.entity.audit_dict.tables.AuditWhitelistConfig;
import com.katana.jooq.entity.audit_dict.tables.AuditWordRule;
import com.katana.jooq.entity.audit_dict.tables.FlatRiskCustomerRule;
import com.katana.jooq.entity.audit_dict.tables.RefuseReason;
import com.katana.jooq.entity.audit_dict.tables.RiskCustomerRule;
import com.katana.jooq.entity.audit_dict.tables.RuleEvaluateDetail;
import com.katana.jooq.entity.audit_dict.tables.SyncWordRule;
import com.katana.jooq.entity.audit_dict.tables.SystemProperty;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditDict extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict</code>
     */
    public static final AuditDict AUDIT_DICT = new AuditDict();

    /**
     * The table <code>audit_dict.audit_risk_category</code>.
     */
    public final AuditRiskCategory AUDIT_RISK_CATEGORY = AuditRiskCategory.AUDIT_RISK_CATEGORY;

    /**
     * The table <code>audit_dict.audit_risk_tag</code>.
     */
    public final AuditRiskTag AUDIT_RISK_TAG = AuditRiskTag.AUDIT_RISK_TAG;

    /**
     * The table <code>audit_dict.audit_similar_word</code>.
     */
    public final AuditSimilarWord AUDIT_SIMILAR_WORD = AuditSimilarWord.AUDIT_SIMILAR_WORD;

    /**
     * The table <code>audit_dict.audit_strategy_config</code>.
     */
    public final AuditStrategyConfig AUDIT_STRATEGY_CONFIG = AuditStrategyConfig.AUDIT_STRATEGY_CONFIG;

    /**
     * The table <code>audit_dict.audit_type_risk_tag_config</code>.
     */
    public final AuditTypeRiskTagConfig AUDIT_TYPE_RISK_TAG_CONFIG = AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG;

    /**
     * The table <code>audit_dict.audit_whitelist_config</code>.
     */
    public final AuditWhitelistConfig AUDIT_WHITELIST_CONFIG = AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG;

    /**
     * The table <code>audit_dict.audit_word_rule</code>.
     */
    public final AuditWordRule AUDIT_WORD_RULE = AuditWordRule.AUDIT_WORD_RULE;

    /**
     * The table <code>audit_dict.flat_risk_customer_rule</code>.
     */
    public final FlatRiskCustomerRule FLAT_RISK_CUSTOMER_RULE = FlatRiskCustomerRule.FLAT_RISK_CUSTOMER_RULE;

    /**
     * The table <code>audit_dict.refuse_reason</code>.
     */
    public final RefuseReason REFUSE_REASON = RefuseReason.REFUSE_REASON;

    /**
     * The table <code>audit_dict.risk_customer_rule</code>.
     */
    public final RiskCustomerRule RISK_CUSTOMER_RULE = RiskCustomerRule.RISK_CUSTOMER_RULE;

    /**
     * The table <code>audit_dict.rule_evaluate_detail</code>.
     */
    public final RuleEvaluateDetail RULE_EVALUATE_DETAIL = RuleEvaluateDetail.RULE_EVALUATE_DETAIL;

    /**
     * The table <code>audit_dict.sync_word_rule</code>.
     */
    public final SyncWordRule SYNC_WORD_RULE = SyncWordRule.SYNC_WORD_RULE;

    /**
     * The table <code>audit_dict.system_property</code>.
     */
    public final SystemProperty SYSTEM_PROPERTY = SystemProperty.SYSTEM_PROPERTY;

    /**
     * No further instances allowed
     */
    private AuditDict() {
        super("audit_dict", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            AuditRiskCategory.AUDIT_RISK_CATEGORY,
            AuditRiskTag.AUDIT_RISK_TAG,
            AuditSimilarWord.AUDIT_SIMILAR_WORD,
            AuditStrategyConfig.AUDIT_STRATEGY_CONFIG,
            AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG,
            AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG,
            AuditWordRule.AUDIT_WORD_RULE,
            FlatRiskCustomerRule.FLAT_RISK_CUSTOMER_RULE,
            RefuseReason.REFUSE_REASON,
            RiskCustomerRule.RISK_CUSTOMER_RULE,
            RuleEvaluateDetail.RULE_EVALUATE_DETAIL,
            SyncWordRule.SYNC_WORD_RULE,
            SystemProperty.SYSTEM_PROPERTY
        );
    }
}
