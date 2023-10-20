-- noinspection SqlNoDataSourceInspectionForFile

-- (.*)(<.*>)(.*),  ==> $1$3 COMMENT'$2',
CREATE SCHEMA `uc`;
SET SCHEMA `uc`;
CREATE TABLE `account`
(
    `id`          bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '<账户ID>',
    `name`        varchar(16) NOT NULL DEFAULT '' COMMENT '<账户名称>',
    `phone`       varchar(13) NOT NULL DEFAULT '' COMMENT '<电话>',
    `email`       varchar(16) NOT NULL DEFAULT '' COMMENT '<邮箱>',
    `create_time` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `tenant_code` varchar(8)  NOT NULL DEFAULT '' COMMENT '<租户编码>',
    `env`         varchar(8)  NOT NULL DEFAULT '' COMMENT '<环境>',
    PRIMARY KEY (`id`)
)/*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户信息表'*/;


CREATE TABLE `user_info` (
     `userid` bigint(20) NOT NULL COMMENT '唯一的用户ID',
     `name` varchar(64) NOT NULL COMMENT '用户名',
     `ad_resource` bigint(20) NOT NULL DEFAULT '-1' COMMENT '推广资源id，值从流量管理同步',
     `audit_state` int(10) NOT NULL DEFAULT '5' COMMENT '审核状态，0表示审核通过，1表示审核中，2表示审核拒绝，5待提交至审核(搁置)',
     `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
     `reason_code` varchar(256) DEFAULT NULL COMMENT '拒绝理由',
     `refuse_reason` varchar(1024) DEFAULT NULL COMMENT '拒绝原因',
     `env`       varchar(8) NOT NULL DEFAULT '' COMMENT '<环境>',
     PRIMARY KEY (`userid`)/*,
  KEY `idx_state` (`audit_state`),
  KEY `idx_audit_start_time` (`audit_start_time`)*/
); /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基础信息表'*/

insert into `account` (`name`, `phone`, `email`, `tenant_code`, `env`)
values ('jack', '13888888888', '138@138.com', 'uc', 'dev');