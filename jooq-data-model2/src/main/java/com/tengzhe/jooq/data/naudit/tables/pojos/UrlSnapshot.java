/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.pojos;


import java.io.Serializable;
import java.util.Date;

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
public class UrlSnapshot implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String url;
    private String screenShotUrl;
    private Date   crawlTime;

    public UrlSnapshot() {}

    public UrlSnapshot(UrlSnapshot value) {
        this.id = value.id;
        this.url = value.url;
        this.screenShotUrl = value.screenShotUrl;
        this.crawlTime = value.crawlTime;
    }

    public UrlSnapshot(
        Long   id,
        String url,
        String screenShotUrl,
        Date   crawlTime
    ) {
        this.id = id;
        this.url = url;
        this.screenShotUrl = screenShotUrl;
        this.crawlTime = crawlTime;
    }

    /**
     * Getter for <code>naudit.url_snapshot.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.url_snapshot.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.url_snapshot.url</code>.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for <code>naudit.url_snapshot.url</code>.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for <code>naudit.url_snapshot.screen_shot_url</code>.
     */
    public String getScreenShotUrl() {
        return this.screenShotUrl;
    }

    /**
     * Setter for <code>naudit.url_snapshot.screen_shot_url</code>.
     */
    public void setScreenShotUrl(String screenShotUrl) {
        this.screenShotUrl = screenShotUrl;
    }

    /**
     * Getter for <code>naudit.url_snapshot.crawl_time</code>.
     */
    public Date getCrawlTime() {
        return this.crawlTime;
    }

    /**
     * Setter for <code>naudit.url_snapshot.crawl_time</code>.
     */
    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UrlSnapshot (");

        sb.append(id);
        sb.append(", ").append(url);
        sb.append(", ").append(screenShotUrl);
        sb.append(", ").append(crawlTime);

        sb.append(")");
        return sb.toString();
    }
}