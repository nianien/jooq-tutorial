-- noinspection SqlNoDataSourceInspectionForFile

-- (.*)(<.*>)(.*),  ==> $1$3 COMMENT'$2',
CREATE SCHEMA `uc`;
SET SCHEMA `uc`;
CREATE TABLE `account`
(
    `id`            bigint(20)   NOT NULL AUTO_INCREMENT COMMENT '<账户ID>',
    `name`          varchar(255) NOT NULL DEFAULT '' COMMENT '<账户名称>',
    `user_id`       bigint(20) NOT NULL DEFAULT -1 COMMENT '<用户ID>',
    `short_name`    varchar(255) NOT NULL DEFAULT '' COMMENT '<账户简称>',
    `app_id`        int(10)      NOT NULL DEFAULT -1 COMMENT '<产品线>',
    `create_source` int(10)      NOT NULL DEFAULT -1 COMMENT '<业务来源>',
    `product_name`  varchar(255) NOT NULL DEFAULT '' COMMENT '<产品名称>',
    `web_site`      varchar(255) NOT NULL DEFAULT '' COMMENT '<用户网址>',
    `license_type`  tinyint(4) NOT NULL DEFAULT 1 COMMENT '<个人/企业>',
    `contact`       varchar(255) NOT NULL DEFAULT '' COMMENT '<联系人>',
    `phone`         varchar(255) NOT NULL DEFAULT '' COMMENT '<电话>',
    `email`         varchar(255) NOT NULL DEFAULT '' COMMENT '<邮箱>',
    `corp_id`       bigint(20)   NOT NULL DEFAULT -1 COMMENT '<投放主体>',
    `sign_corp_id`  bigint(20)   NOT NULL DEFAULT -1 COMMENT '<签约主体>',
    `ad_corp_id`    bigint(20)   NOT NULL DEFAULT -1 COMMENT '<推广主体>',
    `status`        int(10)      NOT NULL DEFAULT -1 COMMENT '<账户状态>',
    `agent_id`      bigint(20)   NOT NULL DEFAULT -1 COMMENT '<代理商>',
    `shop_user_id`  bigint(20)   NOT NULL DEFAULT -1 COMMENT '<小店用户ID>',
    PRIMARY KEY (`id`)
)/*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户信息表'*/;