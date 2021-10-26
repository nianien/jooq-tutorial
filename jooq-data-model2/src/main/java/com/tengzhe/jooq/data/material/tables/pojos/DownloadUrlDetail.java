/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


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
public class DownloadUrlDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          ucId;
    private Long          userId;
    private String        downloadUrl;
    private String        appName;
    private String        packageName;
    private Integer       logicState;
    private Long          auditorId;
    private Integer       auditState;
    private String        reasonCode;
    private String        reason;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private String        rowKey;

    public DownloadUrlDetail() {}

    public DownloadUrlDetail(DownloadUrlDetail value) {
        this.id = value.id;
        this.ucId = value.ucId;
        this.userId = value.userId;
        this.downloadUrl = value.downloadUrl;
        this.appName = value.appName;
        this.packageName = value.packageName;
        this.logicState = value.logicState;
        this.auditorId = value.auditorId;
        this.auditState = value.auditState;
        this.reasonCode = value.reasonCode;
        this.reason = value.reason;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.rowKey = value.rowKey;
    }

    public DownloadUrlDetail(
        Long          id,
        Long          ucId,
        Long          userId,
        String        downloadUrl,
        String        appName,
        String        packageName,
        Integer       logicState,
        Long          auditorId,
        Integer       auditState,
        String        reasonCode,
        String        reason,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        String        rowKey
    ) {
        this.id = id;
        this.ucId = ucId;
        this.userId = userId;
        this.downloadUrl = downloadUrl;
        this.appName = appName;
        this.packageName = packageName;
        this.logicState = logicState;
        this.auditorId = auditorId;
        this.auditState = auditState;
        this.reasonCode = reasonCode;
        this.reason = reason;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.rowKey = rowKey;
    }

    /**
     * Getter for <code>material.download_url_detail.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.download_url_detail.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.download_url_detail.uc_id</code>.
     */
    public Long getUcId() {
        return this.ucId;
    }

    /**
     * Setter for <code>material.download_url_detail.uc_id</code>.
     */
    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    /**
     * Getter for <code>material.download_url_detail.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>material.download_url_detail.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>material.download_url_detail.download_url</code>.
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Setter for <code>material.download_url_detail.download_url</code>.
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * Getter for <code>material.download_url_detail.app_name</code>.
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * Setter for <code>material.download_url_detail.app_name</code>.
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * Getter for <code>material.download_url_detail.package_name</code>.
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * Setter for <code>material.download_url_detail.package_name</code>.
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Getter for <code>material.download_url_detail.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>material.download_url_detail.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>material.download_url_detail.auditor_id</code>.
     */
    public Long getAuditorId() {
        return this.auditorId;
    }

    /**
     * Setter for <code>material.download_url_detail.auditor_id</code>.
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * Getter for <code>material.download_url_detail.audit_state</code>.
     */
    public Integer getAuditState() {
        return this.auditState;
    }

    /**
     * Setter for <code>material.download_url_detail.audit_state</code>.
     */
    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    /**
     * Getter for <code>material.download_url_detail.reason_code</code>.
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * Setter for <code>material.download_url_detail.reason_code</code>.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for <code>material.download_url_detail.reason</code>.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>material.download_url_detail.reason</code>.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for <code>material.download_url_detail.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.download_url_detail.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.download_url_detail.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.download_url_detail.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.download_url_detail.row_key</code>.
     */
    public String getRowKey() {
        return this.rowKey;
    }

    /**
     * Setter for <code>material.download_url_detail.row_key</code>.
     */
    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadUrlDetail (");

        sb.append(id);
        sb.append(", ").append(ucId);
        sb.append(", ").append(userId);
        sb.append(", ").append(downloadUrl);
        sb.append(", ").append(appName);
        sb.append(", ").append(packageName);
        sb.append(", ").append(logicState);
        sb.append(", ").append(auditorId);
        sb.append(", ").append(auditState);
        sb.append(", ").append(reasonCode);
        sb.append(", ").append(reason);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(rowKey);

        sb.append(")");
        return sb.toString();
    }
}
