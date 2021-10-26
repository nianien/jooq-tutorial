/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material;


import com.tengzhe.jooq.data.material.tables.AppAdIdea;
import com.tengzhe.jooq.data.material.tables.AraCompeteAdSample;
import com.tengzhe.jooq.data.material.tables.AraHcCreativeRiskDetail;
import com.tengzhe.jooq.data.material.tables.AraHcCreativeSample;
import com.tengzhe.jooq.data.material.tables.AraHcPvSample;
import com.tengzhe.jooq.data.material.tables.AraHcPvStat;
import com.tengzhe.jooq.data.material.tables.AraQueryWord;
import com.tengzhe.jooq.data.material.tables.AttachCreative;
import com.tengzhe.jooq.data.material.tables.AuditAppAdIdea;
import com.tengzhe.jooq.data.material.tables.AuditAppAdIdeaLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditAttachCreative;
import com.tengzhe.jooq.data.material.tables.AuditAttachCreativeLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditBrandCreative;
import com.tengzhe.jooq.data.material.tables.AuditBrandCreativeLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditBrandTargetUrl;
import com.tengzhe.jooq.data.material.tables.AuditBrandTargetUrlLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditCampaign;
import com.tengzhe.jooq.data.material.tables.AuditCampaignLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditCampaignMaterial;
import com.tengzhe.jooq.data.material.tables.AuditCptQmxingIdea;
import com.tengzhe.jooq.data.material.tables.AuditCptQmxingPackage;
import com.tengzhe.jooq.data.material.tables.AuditCreative;
import com.tengzhe.jooq.data.material.tables.AuditCreativeLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditDspIdea;
import com.tengzhe.jooq.data.material.tables.AuditEntityDetailLog;
import com.tengzhe.jooq.data.material.tables.AuditMicroIdea;
import com.tengzhe.jooq.data.material.tables.AuditMicroIdeaLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditPair;
import com.tengzhe.jooq.data.material.tables.AuditPatrolCampaign;
import com.tengzhe.jooq.data.material.tables.AuditPatrolCreative;
import com.tengzhe.jooq.data.material.tables.AuditPatrolRisk;
import com.tengzhe.jooq.data.material.tables.AuditPictureLib;
import com.tengzhe.jooq.data.material.tables.AuditPictureLibLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditRule;
import com.tengzhe.jooq.data.material.tables.AuditRuleMeta;
import com.tengzhe.jooq.data.material.tables.AuditRuleSet;
import com.tengzhe.jooq.data.material.tables.AuditSitePage;
import com.tengzhe.jooq.data.material.tables.AuditSitePageLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditUserLogo;
import com.tengzhe.jooq.data.material.tables.AuditUserLogoLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditVideo;
import com.tengzhe.jooq.data.material.tables.AuditVideoExchangeOrder;
import com.tengzhe.jooq.data.material.tables.AuditVideoExchangeOrderLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditVideoLogHistory;
import com.tengzhe.jooq.data.material.tables.AuditWordPackage;
import com.tengzhe.jooq.data.material.tables.AuditWordPackageLogHistory;
import com.tengzhe.jooq.data.material.tables.BrandCreative;
import com.tengzhe.jooq.data.material.tables.BrandTargetUrl;
import com.tengzhe.jooq.data.material.tables.Campaign;
import com.tengzhe.jooq.data.material.tables.CptQmxingIdea;
import com.tengzhe.jooq.data.material.tables.CptQmxingPackage;
import com.tengzhe.jooq.data.material.tables.CptQmxingPackageDetail;
import com.tengzhe.jooq.data.material.tables.Creative;
import com.tengzhe.jooq.data.material.tables.DownloadUrlDetail;
import com.tengzhe.jooq.data.material.tables.DspIdea;
import com.tengzhe.jooq.data.material.tables.MaterialAllocationHistory;
import com.tengzhe.jooq.data.material.tables.MicroIdea;
import com.tengzhe.jooq.data.material.tables.PendingVideoMaterial;
import com.tengzhe.jooq.data.material.tables.PictureLib;
import com.tengzhe.jooq.data.material.tables.QualityCheck;
import com.tengzhe.jooq.data.material.tables.QualityCheckAuditCampaign;
import com.tengzhe.jooq.data.material.tables.QualityCheckAuditCreative;
import com.tengzhe.jooq.data.material.tables.QualityCheckCampaignSnapshot;
import com.tengzhe.jooq.data.material.tables.QualityCheckCreativeSnapshot;
import com.tengzhe.jooq.data.material.tables.SitePage;
import com.tengzhe.jooq.data.material.tables.UserInfoConfig;
import com.tengzhe.jooq.data.material.tables.UserLogo;
import com.tengzhe.jooq.data.material.tables.Video;
import com.tengzhe.jooq.data.material.tables.VideoComment;
import com.tengzhe.jooq.data.material.tables.VideoExchangeOrder;
import com.tengzhe.jooq.data.material.tables.WordPackage;
import com.tengzhe.jooq.data.material.tables.WordPackageDetail;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in material.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>material.app_ad_idea</code>.
     */
    public static final AppAdIdea APP_AD_IDEA = AppAdIdea.APP_AD_IDEA;

    /**
     * The table <code>material.ara_compete_ad_sample</code>.
     */
    public static final AraCompeteAdSample ARA_COMPETE_AD_SAMPLE = AraCompeteAdSample.ARA_COMPETE_AD_SAMPLE;

    /**
     * The table <code>material.ara_hc_creative_risk_detail</code>.
     */
    public static final AraHcCreativeRiskDetail ARA_HC_CREATIVE_RISK_DETAIL = AraHcCreativeRiskDetail.ARA_HC_CREATIVE_RISK_DETAIL;

    /**
     * The table <code>material.ara_hc_creative_sample</code>.
     */
    public static final AraHcCreativeSample ARA_HC_CREATIVE_SAMPLE = AraHcCreativeSample.ARA_HC_CREATIVE_SAMPLE;

    /**
     * The table <code>material.ara_hc_pv_sample</code>.
     */
    public static final AraHcPvSample ARA_HC_PV_SAMPLE = AraHcPvSample.ARA_HC_PV_SAMPLE;

    /**
     * The table <code>material.ara_hc_pv_stat</code>.
     */
    public static final AraHcPvStat ARA_HC_PV_STAT = AraHcPvStat.ARA_HC_PV_STAT;

    /**
     * The table <code>material.ara_query_word</code>.
     */
    public static final AraQueryWord ARA_QUERY_WORD = AraQueryWord.ARA_QUERY_WORD;

    /**
     * The table <code>material.attach_creative</code>.
     */
    public static final AttachCreative ATTACH_CREATIVE = AttachCreative.ATTACH_CREATIVE;

    /**
     * The table <code>material.audit_app_ad_idea</code>.
     */
    public static final AuditAppAdIdea AUDIT_APP_AD_IDEA = AuditAppAdIdea.AUDIT_APP_AD_IDEA;

    /**
     * The table <code>material.audit_app_ad_idea_log_history</code>.
     */
    public static final AuditAppAdIdeaLogHistory AUDIT_APP_AD_IDEA_LOG_HISTORY = AuditAppAdIdeaLogHistory.AUDIT_APP_AD_IDEA_LOG_HISTORY;

    /**
     * The table <code>material.audit_attach_creative</code>.
     */
    public static final AuditAttachCreative AUDIT_ATTACH_CREATIVE = AuditAttachCreative.AUDIT_ATTACH_CREATIVE;

    /**
     * The table <code>material.audit_attach_creative_log_history</code>.
     */
    public static final AuditAttachCreativeLogHistory AUDIT_ATTACH_CREATIVE_LOG_HISTORY = AuditAttachCreativeLogHistory.AUDIT_ATTACH_CREATIVE_LOG_HISTORY;

    /**
     * The table <code>material.audit_brand_creative</code>.
     */
    public static final AuditBrandCreative AUDIT_BRAND_CREATIVE = AuditBrandCreative.AUDIT_BRAND_CREATIVE;

    /**
     * The table <code>material.audit_brand_creative_log_history</code>.
     */
    public static final AuditBrandCreativeLogHistory AUDIT_BRAND_CREATIVE_LOG_HISTORY = AuditBrandCreativeLogHistory.AUDIT_BRAND_CREATIVE_LOG_HISTORY;

    /**
     * The table <code>material.audit_brand_target_url</code>.
     */
    public static final AuditBrandTargetUrl AUDIT_BRAND_TARGET_URL = AuditBrandTargetUrl.AUDIT_BRAND_TARGET_URL;

    /**
     * The table <code>material.audit_brand_target_url_log_history</code>.
     */
    public static final AuditBrandTargetUrlLogHistory AUDIT_BRAND_TARGET_URL_LOG_HISTORY = AuditBrandTargetUrlLogHistory.AUDIT_BRAND_TARGET_URL_LOG_HISTORY;

    /**
     * The table <code>material.audit_campaign</code>.
     */
    public static final AuditCampaign AUDIT_CAMPAIGN = AuditCampaign.AUDIT_CAMPAIGN;

    /**
     * The table <code>material.audit_campaign_log_history</code>.
     */
    public static final AuditCampaignLogHistory AUDIT_CAMPAIGN_LOG_HISTORY = AuditCampaignLogHistory.AUDIT_CAMPAIGN_LOG_HISTORY;

    /**
     * The table <code>material.audit_campaign_material</code>.
     */
    public static final AuditCampaignMaterial AUDIT_CAMPAIGN_MATERIAL = AuditCampaignMaterial.AUDIT_CAMPAIGN_MATERIAL;

    /**
     * The table <code>material.audit_cpt_qmxing_idea</code>.
     */
    public static final AuditCptQmxingIdea AUDIT_CPT_QMXING_IDEA = AuditCptQmxingIdea.AUDIT_CPT_QMXING_IDEA;

    /**
     * The table <code>material.audit_cpt_qmxing_package</code>.
     */
    public static final AuditCptQmxingPackage AUDIT_CPT_QMXING_PACKAGE = AuditCptQmxingPackage.AUDIT_CPT_QMXING_PACKAGE;

    /**
     * The table <code>material.audit_creative</code>.
     */
    public static final AuditCreative AUDIT_CREATIVE = AuditCreative.AUDIT_CREATIVE;

    /**
     * The table <code>material.audit_creative_log_history</code>.
     */
    public static final AuditCreativeLogHistory AUDIT_CREATIVE_LOG_HISTORY = AuditCreativeLogHistory.AUDIT_CREATIVE_LOG_HISTORY;

    /**
     * The table <code>material.audit_dsp_idea</code>.
     */
    public static final AuditDspIdea AUDIT_DSP_IDEA = AuditDspIdea.AUDIT_DSP_IDEA;

    /**
     * The table <code>material.audit_entity_detail_log</code>.
     */
    public static final AuditEntityDetailLog AUDIT_ENTITY_DETAIL_LOG = AuditEntityDetailLog.AUDIT_ENTITY_DETAIL_LOG;

    /**
     * The table <code>material.audit_micro_idea</code>.
     */
    public static final AuditMicroIdea AUDIT_MICRO_IDEA = AuditMicroIdea.AUDIT_MICRO_IDEA;

    /**
     * The table <code>material.audit_micro_idea_log_history</code>.
     */
    public static final AuditMicroIdeaLogHistory AUDIT_MICRO_IDEA_LOG_HISTORY = AuditMicroIdeaLogHistory.AUDIT_MICRO_IDEA_LOG_HISTORY;

    /**
     * The table <code>material.audit_pair</code>.
     */
    public static final AuditPair AUDIT_PAIR = AuditPair.AUDIT_PAIR;

    /**
     * The table <code>material.audit_patrol_campaign</code>.
     */
    public static final AuditPatrolCampaign AUDIT_PATROL_CAMPAIGN = AuditPatrolCampaign.AUDIT_PATROL_CAMPAIGN;

    /**
     * The table <code>material.audit_patrol_creative</code>.
     */
    public static final AuditPatrolCreative AUDIT_PATROL_CREATIVE = AuditPatrolCreative.AUDIT_PATROL_CREATIVE;

    /**
     * The table <code>material.audit_patrol_risk</code>.
     */
    public static final AuditPatrolRisk AUDIT_PATROL_RISK = AuditPatrolRisk.AUDIT_PATROL_RISK;

    /**
     * The table <code>material.audit_picture_lib</code>.
     */
    public static final AuditPictureLib AUDIT_PICTURE_LIB = AuditPictureLib.AUDIT_PICTURE_LIB;

    /**
     * The table <code>material.audit_picture_lib_log_history</code>.
     */
    public static final AuditPictureLibLogHistory AUDIT_PICTURE_LIB_LOG_HISTORY = AuditPictureLibLogHistory.AUDIT_PICTURE_LIB_LOG_HISTORY;

    /**
     * The table <code>material.audit_rule</code>.
     */
    public static final AuditRule AUDIT_RULE = AuditRule.AUDIT_RULE;

    /**
     * The table <code>material.audit_rule_meta</code>.
     */
    public static final AuditRuleMeta AUDIT_RULE_META = AuditRuleMeta.AUDIT_RULE_META;

    /**
     * The table <code>material.audit_rule_set</code>.
     */
    public static final AuditRuleSet AUDIT_RULE_SET = AuditRuleSet.AUDIT_RULE_SET;

    /**
     * The table <code>material.audit_site_page</code>.
     */
    public static final AuditSitePage AUDIT_SITE_PAGE = AuditSitePage.AUDIT_SITE_PAGE;

    /**
     * The table <code>material.audit_site_page_log_history</code>.
     */
    public static final AuditSitePageLogHistory AUDIT_SITE_PAGE_LOG_HISTORY = AuditSitePageLogHistory.AUDIT_SITE_PAGE_LOG_HISTORY;

    /**
     * The table <code>material.audit_user_logo</code>.
     */
    public static final AuditUserLogo AUDIT_USER_LOGO = AuditUserLogo.AUDIT_USER_LOGO;

    /**
     * The table <code>material.audit_user_logo_log_history</code>.
     */
    public static final AuditUserLogoLogHistory AUDIT_USER_LOGO_LOG_HISTORY = AuditUserLogoLogHistory.AUDIT_USER_LOGO_LOG_HISTORY;

    /**
     * The table <code>material.audit_video</code>.
     */
    public static final AuditVideo AUDIT_VIDEO = AuditVideo.AUDIT_VIDEO;

    /**
     * The table <code>material.audit_video_exchange_order</code>.
     */
    public static final AuditVideoExchangeOrder AUDIT_VIDEO_EXCHANGE_ORDER = AuditVideoExchangeOrder.AUDIT_VIDEO_EXCHANGE_ORDER;

    /**
     * The table <code>material.audit_video_exchange_order_log_history</code>.
     */
    public static final AuditVideoExchangeOrderLogHistory AUDIT_VIDEO_EXCHANGE_ORDER_LOG_HISTORY = AuditVideoExchangeOrderLogHistory.AUDIT_VIDEO_EXCHANGE_ORDER_LOG_HISTORY;

    /**
     * The table <code>material.audit_video_log_history</code>.
     */
    public static final AuditVideoLogHistory AUDIT_VIDEO_LOG_HISTORY = AuditVideoLogHistory.AUDIT_VIDEO_LOG_HISTORY;

    /**
     * The table <code>material.audit_word_package</code>.
     */
    public static final AuditWordPackage AUDIT_WORD_PACKAGE = AuditWordPackage.AUDIT_WORD_PACKAGE;

    /**
     * The table <code>material.audit_word_package_log_history</code>.
     */
    public static final AuditWordPackageLogHistory AUDIT_WORD_PACKAGE_LOG_HISTORY = AuditWordPackageLogHistory.AUDIT_WORD_PACKAGE_LOG_HISTORY;

    /**
     * The table <code>material.brand_creative</code>.
     */
    public static final BrandCreative BRAND_CREATIVE = BrandCreative.BRAND_CREATIVE;

    /**
     * The table <code>material.brand_target_url</code>.
     */
    public static final BrandTargetUrl BRAND_TARGET_URL = BrandTargetUrl.BRAND_TARGET_URL;

    /**
     * The table <code>material.campaign</code>.
     */
    public static final Campaign CAMPAIGN = Campaign.CAMPAIGN;

    /**
     * The table <code>material.cpt_qmxing_idea</code>.
     */
    public static final CptQmxingIdea CPT_QMXING_IDEA = CptQmxingIdea.CPT_QMXING_IDEA;

    /**
     * The table <code>material.cpt_qmxing_package</code>.
     */
    public static final CptQmxingPackage CPT_QMXING_PACKAGE = CptQmxingPackage.CPT_QMXING_PACKAGE;

    /**
     * The table <code>material.cpt_qmxing_package_detail</code>.
     */
    public static final CptQmxingPackageDetail CPT_QMXING_PACKAGE_DETAIL = CptQmxingPackageDetail.CPT_QMXING_PACKAGE_DETAIL;

    /**
     * The table <code>material.creative</code>.
     */
    public static final Creative CREATIVE = Creative.CREATIVE;

    /**
     * The table <code>material.download_url_detail</code>.
     */
    public static final DownloadUrlDetail DOWNLOAD_URL_DETAIL = DownloadUrlDetail.DOWNLOAD_URL_DETAIL;

    /**
     * The table <code>material.dsp_idea</code>.
     */
    public static final DspIdea DSP_IDEA = DspIdea.DSP_IDEA;

    /**
     * The table <code>material.material_allocation_history</code>.
     */
    public static final MaterialAllocationHistory MATERIAL_ALLOCATION_HISTORY = MaterialAllocationHistory.MATERIAL_ALLOCATION_HISTORY;

    /**
     * The table <code>material.micro_idea</code>.
     */
    public static final MicroIdea MICRO_IDEA = MicroIdea.MICRO_IDEA;

    /**
     * The table <code>material.pending_video_material</code>.
     */
    public static final PendingVideoMaterial PENDING_VIDEO_MATERIAL = PendingVideoMaterial.PENDING_VIDEO_MATERIAL;

    /**
     * The table <code>material.picture_lib</code>.
     */
    public static final PictureLib PICTURE_LIB = PictureLib.PICTURE_LIB;

    /**
     * The table <code>material.quality_check</code>.
     */
    public static final QualityCheck QUALITY_CHECK = QualityCheck.QUALITY_CHECK;

    /**
     * The table <code>material.quality_check_audit_campaign</code>.
     */
    public static final QualityCheckAuditCampaign QUALITY_CHECK_AUDIT_CAMPAIGN = QualityCheckAuditCampaign.QUALITY_CHECK_AUDIT_CAMPAIGN;

    /**
     * The table <code>material.quality_check_audit_creative</code>.
     */
    public static final QualityCheckAuditCreative QUALITY_CHECK_AUDIT_CREATIVE = QualityCheckAuditCreative.QUALITY_CHECK_AUDIT_CREATIVE;

    /**
     * The table <code>material.quality_check_campaign_snapshot</code>.
     */
    public static final QualityCheckCampaignSnapshot QUALITY_CHECK_CAMPAIGN_SNAPSHOT = QualityCheckCampaignSnapshot.QUALITY_CHECK_CAMPAIGN_SNAPSHOT;

    /**
     * The table <code>material.quality_check_creative_snapshot</code>.
     */
    public static final QualityCheckCreativeSnapshot QUALITY_CHECK_CREATIVE_SNAPSHOT = QualityCheckCreativeSnapshot.QUALITY_CHECK_CREATIVE_SNAPSHOT;

    /**
     * The table <code>material.site_page</code>.
     */
    public static final SitePage SITE_PAGE = SitePage.SITE_PAGE;

    /**
     * The table <code>material.user_info_config</code>.
     */
    public static final UserInfoConfig USER_INFO_CONFIG = UserInfoConfig.USER_INFO_CONFIG;

    /**
     * The table <code>material.user_logo</code>.
     */
    public static final UserLogo USER_LOGO = UserLogo.USER_LOGO;

    /**
     * The table <code>material.video</code>.
     */
    public static final Video VIDEO = Video.VIDEO;

    /**
     * The table <code>material.video_comment</code>.
     */
    public static final VideoComment VIDEO_COMMENT = VideoComment.VIDEO_COMMENT;

    /**
     * The table <code>material.video_exchange_order</code>.
     */
    public static final VideoExchangeOrder VIDEO_EXCHANGE_ORDER = VideoExchangeOrder.VIDEO_EXCHANGE_ORDER;

    /**
     * The table <code>material.word_package</code>.
     */
    public static final WordPackage WORD_PACKAGE = WordPackage.WORD_PACKAGE;

    /**
     * The table <code>material.word_package_detail</code>.
     */
    public static final WordPackageDetail WORD_PACKAGE_DETAIL = WordPackageDetail.WORD_PACKAGE_DETAIL;
}