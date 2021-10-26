/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.QualityCheckCreativeSnapshot;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class QualityCheckCreativeSnapshotRecord extends UpdatableRecordImpl<QualityCheckCreativeSnapshotRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.quality_check_creative_snapshot.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.quality_check_id</code>.
     */
    public void setQualityCheckId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.quality_check_id</code>.
     */
    public Long getQualityCheckId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.creative_id</code>.
     */
    public void setCreativeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.creative_id</code>.
     */
    public Long getCreativeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.uc_id</code>.
     */
    public void setUcId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.uc_id</code>.
     */
    public Long getUcId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.user_id</code>.
     */
    public void setUserId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.group_id</code>.
     */
    public void setGroupId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.group_id</code>.
     */
    public Long getGroupId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.campaign_id</code>.
     */
    public void setCampaignId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.campaign_id</code>.
     */
    public Long getCampaignId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.type</code>.
     */
    public void setType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.type</code>.
     */
    public Integer getType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.style</code>.
     */
    public void setStyle(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.style</code>.
     */
    public Integer getStyle() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.feature</code>.
     */
    public void setFeature(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.feature</code>.
     */
    public Integer getFeature() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.title</code>.
     */
    public void setTitle(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.title</code>.
     */
    public String getTitle() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.description</code>.
     */
    public void setDescription(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.description</code>.
     */
    public String getDescription() {
        return (String) get(11);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.source</code>.
     */
    public void setSource(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.source</code>.
     */
    public String getSource() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.target_url</code>.
     */
    public void setTargetUrl(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.target_url</code>.
     */
    public String getTargetUrl() {
        return (String) get(13);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.content</code>.
     */
    public void setContent(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.content</code>.
     */
    public String getContent() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.wildcard_ids</code>.
     */
    public void setWildcardIds(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.wildcard_ids</code>.
     */
    public String getWildcardIds() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.download_type</code>.
     */
    public void setDownloadType(Integer value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.download_type</code>.
     */
    public Integer getDownloadType() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.paused</code>.
     */
    public void setPaused(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.paused</code>.
     */
    public Integer getPaused() {
        return (Integer) get(17);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.ad_style_id</code>.
     */
    public void setAdStyleId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.ad_style_id</code>.
     */
    public Integer getAdStyleId() {
        return (Integer) get(18);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.ad_style_type</code>.
     */
    public void setAdStyleType(Integer value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.ad_style_type</code>.
     */
    public Integer getAdStyleType() {
        return (Integer) get(19);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.version</code>.
     */
    public void setVersion(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.version</code>.
     */
    public Long getVersion() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>material.quality_check_creative_snapshot.state</code>.
     */
    public void setState(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>material.quality_check_creative_snapshot.state</code>.
     */
    public Integer getState() {
        return (Integer) get(22);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.state_detail</code>.
     */
    public void setStateDetail(Integer value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.state_detail</code>.
     */
    public Integer getStateDetail() {
        return (Integer) get(23);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.pair_state</code>.
     */
    public void setPairState(Integer value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.pair_state</code>.
     */
    public Integer getPairState() {
        return (Integer) get(24);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(25, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for
     * <code>material.quality_check_creative_snapshot.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(26, value);
    }

    /**
     * Getter for
     * <code>material.quality_check_creative_snapshot.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(26);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QualityCheckCreativeSnapshotRecord
     */
    public QualityCheckCreativeSnapshotRecord() {
        super(QualityCheckCreativeSnapshot.QUALITY_CHECK_CREATIVE_SNAPSHOT);
    }

    /**
     * Create a detached, initialised QualityCheckCreativeSnapshotRecord
     */
    public QualityCheckCreativeSnapshotRecord(Long id, Long qualityCheckId, Long creativeId, Long ucId, Long userId, Long groupId, Long campaignId, Integer type, Integer style, Integer feature, String title, String description, String source, String targetUrl, String content, String wildcardIds, Integer downloadType, Integer paused, Integer adStyleId, Integer adStyleType, Integer logicState, Long version, Integer state, Integer stateDetail, Integer pairState, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(QualityCheckCreativeSnapshot.QUALITY_CHECK_CREATIVE_SNAPSHOT);

        setId(id);
        setQualityCheckId(qualityCheckId);
        setCreativeId(creativeId);
        setUcId(ucId);
        setUserId(userId);
        setGroupId(groupId);
        setCampaignId(campaignId);
        setType(type);
        setStyle(style);
        setFeature(feature);
        setTitle(title);
        setDescription(description);
        setSource(source);
        setTargetUrl(targetUrl);
        setContent(content);
        setWildcardIds(wildcardIds);
        setDownloadType(downloadType);
        setPaused(paused);
        setAdStyleId(adStyleId);
        setAdStyleType(adStyleType);
        setLogicState(logicState);
        setVersion(version);
        setState(state);
        setStateDetail(stateDetail);
        setPairState(pairState);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised QualityCheckCreativeSnapshotRecord
     */
    public QualityCheckCreativeSnapshotRecord(com.tengzhe.jooq.data.material.tables.pojos.QualityCheckCreativeSnapshot value) {
        super(QualityCheckCreativeSnapshot.QUALITY_CHECK_CREATIVE_SNAPSHOT);

        if (value != null) {
            setId(value.getId());
            setQualityCheckId(value.getQualityCheckId());
            setCreativeId(value.getCreativeId());
            setUcId(value.getUcId());
            setUserId(value.getUserId());
            setGroupId(value.getGroupId());
            setCampaignId(value.getCampaignId());
            setType(value.getType());
            setStyle(value.getStyle());
            setFeature(value.getFeature());
            setTitle(value.getTitle());
            setDescription(value.getDescription());
            setSource(value.getSource());
            setTargetUrl(value.getTargetUrl());
            setContent(value.getContent());
            setWildcardIds(value.getWildcardIds());
            setDownloadType(value.getDownloadType());
            setPaused(value.getPaused());
            setAdStyleId(value.getAdStyleId());
            setAdStyleType(value.getAdStyleType());
            setLogicState(value.getLogicState());
            setVersion(value.getVersion());
            setState(value.getState());
            setStateDetail(value.getStateDetail());
            setPairState(value.getPairState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
