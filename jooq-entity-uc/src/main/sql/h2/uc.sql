-- noinspection SqlNoDataSourceInspectionForFile

-- (.*)(<.*>)(.*),  ==> $1$3 COMMENT'$2',
CREATE SCHEMA `uc`;
SET SCHEMA `uc`;
CREATE TABLE `account`
(
    `id`            bigint(20)   NOT NULL AUTO_INCREMENT COMMENT '<账户ID>',
    `name`          varchar(16) NOT NULL DEFAULT '' COMMENT '<账户名称>',
    `phone`         varchar(13) NOT NULL DEFAULT '' COMMENT '<电话>',
    `email`         varchar(16) NOT NULL DEFAULT '' COMMENT '<邮箱>',
    `create_time`   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `tenant_code`   varchar(8)   NOT NULL DEFAULT '' COMMENT '<租户编码>',
    `env`       varchar(8) NOT NULL DEFAULT '' COMMENT '<环境>',
    PRIMARY KEY (`id`)
)/*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户信息表'*/;