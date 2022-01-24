-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `uc`;
SET SCHEMA `uc`;

CREATE TABLE `uc_account`
(
    `user_id`       BIGINT(20)    NOT NULL COMMENT '用户ID，对应UC账号ID',
    `uc_id`         BIGINT(20)    NOT NULL COMMENT '登录UC ID,对应UC用户ID',
    `biz_type`      INT(11)       NOT NULL DEFAULT 0 COMMENT '业务类型 1 wl,2 hc,4 app',
    `user_name`     VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '用户名',
    `company_name`  VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '公司名称',
    `site_name`     VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '网站名称',
    `site_url`      TEXT COMMENT '网站URL',
    `site_tag`      INT(11)       NOT NULL DEFAULT 0 COMMENT '域名类型:0-普通域名,1-锦帆建站',
    `industry1`     INT(11)       NOT NULL DEFAULT 0 COMMENT '一级行业',
    `industry2`     INT(11)       NOT NULL DEFAULT 0 COMMENT '二级行业',
    `industry3`     INT(11)       NOT NULL DEFAULT 0 COMMENT '三级行业',
    `contact`       TEXT COMMENT '联系信息',
    `source`        INT(11)       NOT NULL DEFAULT 0 COMMENT '用户来源',
    `ad_resource`   INT(11)       NOT NULL DEFAULT 0 COMMENT '资源位，1-头条 2-精准 4-应用分发',
    `view_state`    INT(11)       NOT NULL DEFAULT 0 COMMENT '展示状态:1-被禁用,2-暂未生效,3-待审核,0-正常生效,4-被拒绝,5-预算不足,6-账面为零',
    `finance_state` INT(11)       NOT NULL DEFAULT 0 COMMENT '财务状态 0-正常 1-预算撞线 2-余额为零 3-预算撞线且余额为零',
    `logic_state`   TINYINT(4)    NOT NULL DEFAULT 0 COMMENT '账户状态:0-有效,1-无效',
    `audit_state`   INT(11)       NOT NULL DEFAULT 0 COMMENT '审核状态, 0通过 1待审核 2拒绝',
    `auditor_id`    BIGINT(20)    NOT NULL DEFAULT -1 COMMENT '审核员ID',
    `audit_result`  VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '审核结果',
    `audit_time`    DATETIME      NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '审核时间',
    `create_time`   DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time`   DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `_flag`         INT(10)       NOT NULL DEFAULT 1 COMMENT '数据变更下发标识，1-下发，0-不下发',
    PRIMARY KEY (`user_id`)
) /*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户信息表'*/;