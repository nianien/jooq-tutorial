-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `naudit`;
SET SCHEMA `naudit`;
CREATE TABLE `crm_order_url` (
    `id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT 'id',
    `order_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '订单id',
    `url_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT 'URL id',
    `type` TINYINT(2) NOT NULL DEFAULT -1 COMMENT '1:KA_URL,2:SME_URL,3:KA_ORDER,4:SME_ORDER',
    `cid` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '客户ID',
    `agent_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '代理商ID',
    `industry1` INT(10) NOT NULL DEFAULT -1 COMMENT '一级行业',
    `industry2` INT(10) NOT NULL DEFAULT -1 COMMENT '一级行业',
    `industry3` INT(10) NOT NULL DEFAULT -1 COMMENT '一级行业',
    `company_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '公司名称',
    `site_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '网站名称',
    `site_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '网站地址',
    `biz_types` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '待开产品线',
    `content` TEXT NOT NULL COMMENT '订单内容',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    `state` TINYINT(2) NOT NULL DEFAULT 1 COMMENT '提交状态,0:未提交,1:提交中,2:已提交',
    `auditor_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
    `audit_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '审核时间',
    `assign_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '任务分配时间',
    `_flag` INT(10) NOT NULL DEFAULT 1 COMMENT '数据变更下发标识，1-下发，0-不下发',
    PRIMARY KEY (`id`,`type`)
);/* DEFAULT CHARSET=utf8 COMMENT='CRM订单URL表';*/

CREATE TABLE `audit_crm_order_url` (
    `id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '订单或URLid',
    `type` TINYINT(2) NOT NULL DEFAULT -1 COMMENT '1:KA_URL,2:KA_ORDER,3:SME_URL,4:SME_ORDER',
    `audit_type` INT(10) NOT NULL COMMENT '0:信息,1:汇川,2:卧龙,4应用分发',
    `auditor_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
    `audit_state` TINYINT(2) NOT NULL DEFAULT 1 COMMENT '审核状态,0:审核通过,1审核中,2:审核拒绝',
    `audit_result` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '审核结果',
    `audit_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '审核时间',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`,`type`,`audit_type`)
);/* DEFAULT CHARSET=utf8 COMMENT='CRM订单URL审核表';*/


CREATE TABLE `qualification` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '资质ID',
    `source` TINYINT(2) NOT NULL COMMENT '资质来源',
    `qual_type` TINYINT(2) NOT NULL COMMENT '资质类型,1:主体,2:可选,3:附加',
    `qual_name` VARCHAR(256) NOT NULL DEFAULT -1 COMMENT '资质名称,默认为code对应到config',
    `qual_url` VARCHAR(256) NOT NULL COMMENT '资质URL地址',
    `qual_md5` VARCHAR(128) DEFAULT '' COMMENT '资质MD5值',
    `expired_date` DATE NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
    `version` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '资质版本号',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`,`source` )
) ;/* DEFAULT CHARSET=utf8 COMMENT='资质信息表';*/


CREATE TABLE `qualification_relation` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `source` TINYINT(2) NOT NULL COMMENT '资质来源',
    `qual_id` BIGINT(20) NOT NULL COMMENT '资质ID',
    `target_id` BIGINT(20) NOT NULL COMMENT '绑定对象ID',
    `target_type` INT(2) NOT NULL COMMENT '绑定对象类型',
    `auditor_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
    `audit_state` TINYINT(2) NOT NULL DEFAULT 1 COMMENT '审核状态,0:审核通过,1审核中,2:审核拒绝',
    `audit_result` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '审核结果',
    `audit_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '审核时间',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`),
    UNIQUE (`qual_id`, `source`,`target_id`,`target_type`)
);/* DEFAULT CHARSET=utf8 COMMENT='资质关系表';*/


CREATE TABLE `qualification_config` (
    `id` BIGINT(20) NOT NULL COMMENT '主键',
    `code` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '编码，约定的业务编码',
    `name` VARCHAR(256) NOT NULL COMMENT '显示名称',
    `level` INT(11) NOT NULL DEFAULT 0 COMMENT '层级1-主体可选附加层级；层级2-主体类型、附加类型、可选类型；层级3-名称',
    `parent_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '父级id，与id构建树结构',
    `remark` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '该类型资质可以关联的产品线与来源，逗号分隔的枚举值，1-卧龙KA,2-卧龙中小,3-汇川KA,4-汇川中小,5-应用分发KA,6-应用分发中小',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `effective` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '该类型资质过期时，是否影响对应remark中的url和账户',
    PRIMARY KEY (`id`)
);/* DEFAULT CHARSET=utf8 COMMENT='资质配置表';*/

CREATE TABLE `uc_account` (
    `user_id` BIGINT(20) NOT NULL COMMENT '用户ID，对应UC账号ID',
    `uc_id`  BIGINT(20) NOT NULL COMMENT '登录UC ID,对应UC用户ID',
    `biz_type` INT(11) NOT NULL DEFAULT 0 COMMENT '业务类型 1 wl,2 hc,4 app',
    `user_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '用户名',
    `company_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '公司名称',
    `site_name` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '网站名称',
    `site_url` TEXT COMMENT '网站URL',
    `site_tag` INT(11) NOT NULL DEFAULT 0 COMMENT '域名类型:0-普通域名,1-锦帆建站',
    `industry1` INT(11) NOT NULL DEFAULT 0 COMMENT '一级行业',
    `industry2` INT(11) NOT NULL DEFAULT 0 COMMENT '二级行业',
    `industry3` INT(11) NOT NULL DEFAULT 0 COMMENT '三级行业',
    `contact` TEXT COMMENT '联系信息',
    `source` INT(11) NOT NULL DEFAULT 0 COMMENT  '用户来源',
    `ad_resource` INT(11) NOT NULL DEFAULT 0 COMMENT '资源位，1-头条 2-精准 4-应用分发',
    `view_state` INT(11) NOT NULL DEFAULT 0 COMMENT '展示状态:1-被禁用,2-暂未生效,3-待审核,0-正常生效,4-被拒绝,5-预算不足,6-账面为零',
    `finance_state` INT(11) NOT NULL DEFAULT 0 COMMENT '财务状态 0-正常 1-预算撞线 2-余额为零 3-预算撞线且余额为零',
    `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '账户状态:0-有效,1-无效',
    `audit_state` INT(11) NOT NULL DEFAULT 0 COMMENT '审核状态, 0通过 1待审核 2拒绝',
    `auditor_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
    `audit_result` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '审核结果',
    `audit_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '审核时间',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `_flag` INT(10) NOT NULL DEFAULT 1 COMMENT '数据变更下发标识，1-下发，0-不下发',
    PRIMARY KEY (`user_id`)
) /*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户信息表'*/;

CREATE TABLE `url_snapshot` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `url` TEXT NOT NULL COMMENT '网站地址',
  `screen_shot_url` TEXT NOT NULL COMMENT '截图地址',
  `crawl_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '爬取时间毫秒',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='落地页截图结果表'*/;

CREATE TABLE `audit_comment` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `comment_type` INT(11) NOT NULL COMMENT '批注类型，对应包含大类小类批注类型的枚举',
    `target_id` BIGINT(20) NOT NULL COMMENT '批注目标ID',
    `target_type` INT(11) NOT NULL COMMENT '批注目标层级类型',
    `biz_type` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '批注关联的产品线,逗号分隔',
    `content` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '批注内容，需要拼接出标签内容',
    `expire_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
    `enabled` INT(11) NOT NULL DEFAULT 1 COMMENT '是否启用，0-停用,1:启用',
    `creator` BIGINT(20) NOT NULL COMMENT '创建者',
    `operator` BIGINT(20) NOT NULL COMMENT '操作人',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY(`id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核批注表' */

CREATE TABLE `audit_tag_relation` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `tag_type` INT(11) NOT NULL COMMENT '标签类型，对应标签类型的配置表',
    `target_id` BIGINT(20) NOT NULL COMMENT '标签目标ID',
    `target_type` INT(11) NOT NULL COMMENT '标签目标层级类型',
    `biz_type` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '标签关联的产品线,逗号分隔',
    `code` VARCHAR(1024) NOT NULL COMMENT '标签编码，打平的',
    `score` VARCHAR(1024) NOT NULL COMMENT '标签分值',
    `tag` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签内容',
    `creator` BIGINT(20) NOT NULL COMMENT '创建者',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY(`id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核标签关系表' */

CREATE TABLE `audit_tag_relation_history` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `tag_type` INT(11) NOT NULL COMMENT '标签类型，对应标签类型的配置表',
    `target_id` BIGINT(20) NOT NULL COMMENT '标签目标ID',
    `target_type` INT(11) NOT NULL COMMENT '标签目标层级类型',
    `biz_type` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '标签关联的产品线',
    `code` VARCHAR(1024) NOT NULL COMMENT '标签编码，打平的',
    `score` VARCHAR(1024) NOT NULL COMMENT '标签分值',
    `tag` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签内容',
    `creator` BIGINT(20) NOT NULL COMMENT '创建者',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `add_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '历史数据添加时间',
    PRIMARY KEY(`id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核标签关系历史表' */

CREATE TABLE `audit_tag` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键，对应标签ID，编码',
    `tag_type` INT(11) NOT NULL COMMENT '标签类型，对应标签类的枚举',
    `tag` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签内容',
    `display` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '是否展现，0-不展现,1-展现',
    `remark` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签附加属性，统计分析使用',
    `source` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '标签配置来源，1-机器，2-人工',
    `state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '标签状态，目前用作是否可删除,0-可删除 1-不可删除',
    PRIMARY KEY(`id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表'; */

CREATE TABLE `audit_tag_type_config` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '标签类型id，对应tag_type字段',
    `category` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签类型，大类类型',
    `desc` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '标签类型，小类描述',
    `repeated` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '此类别是否允许多个标签,1-允许多个，0-不允许多个',
    `delivery` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '此类标签下发标识,0-不下发，1-下发',
    `remark` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '此类标签附加属性，预留',
    PRIMARY KEY(`id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批注标签类别表'; */

CREATE TABLE `uc_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `uc_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT 'UC用户ID,对应uc_account的uc_id',
  `user_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `type` TINYINT(3) NOT NULL DEFAULT -1 COMMENT '关系类型，1:代理商ID,2:客户ID,3:SME一线客服ID,4:URLID关系',
  `target_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '目标的ID',
  `target_name` varchar(128) NOT NULL DEFAULT '' COMMENT '目标名称',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,*/
--   KEY `idx_uc_id` (`uc_id`),
--   KEY `idx_target_name_type_uc_id` (`target_name`,`type`,`uc_id`),
--   KEY `idx_type` (`type`)
); /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关系表'*/

CREATE TABLE `campaign_user_url` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `uc_id` bigint(20) NOT NULL COMMENT 'UC用户ID,对应uc_account的uc_id',
  `url_id` bigint(20) NOT NULL COMMENT '客户url关系id',
  `cid` bigint(20) NOT NULL COMMENT '客户cid',
  `ccid` bigint(20) NOT NULL COMMENT '创建者-客户Id',
  `url_type` tinyint(1) NOT NULL DEFAULT 0 COMMENT '1:注册域名 2:开放域名',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,*/
--   UNIQUE KEY `idx_userid_url_id` (`user_id`,`url_id`)
);/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推广账号URL关系表'*/


CREATE TABLE `audit_info_log`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `date` INT(11) NOT NULL COMMENT '日期',
  `type` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '类型，1：订单，2：URL，3：账户',
  `entity_id` BIGINT(20) NOT NULL COMMENT '实体ID',
  `biz_type` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '产品线，逗号分隔',
  `source` INT(11) NOT NULL DEFAULT 0 COMMENT  '来源',
  `company_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '公司名称',
  `agent_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '代理商ID',
  `industry1` INT(11) NOT NULL DEFAULT 0 COMMENT '一级行业',
  `industry2` INT(11) NOT NULL DEFAULT 0 COMMENT '二级行业',
  `industry3` INT(11) NOT NULL DEFAULT 0 COMMENT '三级行业',
  `audit_result` TEXT COMMENT '审核状态, 产品线的审核状态，内部为一个对象',
  `auditor_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
  `reason_code` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由编码，逗号分隔',
  `audit_cost_time` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '审核耗时，毫秒',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
)/*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核信息历史表'*/;

CREATE TABLE `audit_info_stat`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `date` INT(11) NOT NULL COMMENT '日期',
  `dimension` INT(11) NOT NULL DEFAULT 1 COMMENT '统计维度',
  `type` INT(11) NOT NULL DEFAULT 1 COMMENT '统计维度的类型，二级维度',
  `entity_id` BIGINT(20) NOT NULL COMMENT '统计实体ID',
  `entity_type` INT(11) DEFAULT -1 COMMENT '统计实体的附加属性, 拒绝理由类型，或者产品线类型',
  `content` VARCHAR(1024) DEFAULT '' COMMENT '统计内容, 拒绝理由code',
  `count` BIGINT(20) NOT NULL DEFAULT 1 COMMENT '个数',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
)/*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核数据统计表'*/;


CREATE TABLE `auditor_task_allocation` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` TINYINT(4) NOT NULL COMMENT '类型 1:客户订单',
  `biz_type` INT(11) NOT NULL DEFAULT 0 COMMENT '业务类型 1 wl,2 hc,4 app',
  `source` TINYINT(4) NOT NULL DEFAULT -1 COMMENT '针对客户 1:KA 2:中小',
  `status` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '状态  0：待执行，1：执行中 2：过期',
  `auditor_id` VARCHAR(4096) DEFAULT NULL COMMENT '审核员uc_id列表，逗号分隔',
  `begin_date` DATE DEFAULT NULL COMMENT '生效开始时间，天维度',
  `end_date` DATE DEFAULT NULL COMMENT '生效结束时间，天维度',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_type_biz_type` (`type`,`biz_type`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核员任务分配表'*/;


CREATE TABLE `auditor_task_allocation_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` BIGINT(20) NOT NULL COMMENT '任务ID，对于主表ID',
  `type` TINYINT(4) NOT NULL COMMENT '类型 1:客户订单',
  `biz_type` INT(11) NOT NULL DEFAULT 0 COMMENT '业务类型 1 wl,2 hc,4 app',
  `source` TINYINT(4) NOT NULL DEFAULT -1 COMMENT '针对客户 1:KA 2:中小',
  `status` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '状态  0：待执行，1：执行中 2：过期',
  `auditor_id` VARCHAR(4096) DEFAULT NULL COMMENT '审核员uc_id列表，逗号分隔',
  `begin_date` DATE DEFAULT NULL COMMENT '生效开始时间，天维度',
  `end_date` DATE DEFAULT NULL COMMENT '生效结束时间，天维度',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL COMMENT '更新时间',
  `add_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '历史表添加时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_type_biz_type` (`type`,`biz_type`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核员任务分配历史表'*/;

CREATE TABLE `agent_self_inspection_history` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id` BIGINT(20) NOT NULL COMMENT '自查对应的账户ID',
    `reason_type` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '代理商自查拒绝类型',
    `audit_state` INT(11) NOT NULL DEFAULT 0 COMMENT '审核状态, 0通过 1待审核 2拒绝',
    `audit_result` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '审核结果',
    `operator_id`  BIGINT(20) NOT NULL COMMENT '自查的代理商ID,操作者ID',
    `operator_name` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '自查代理商名称，操作者名称',
    `audit_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '审核时间',
    `date` INT(11) NOT NULL COMMENT '日期',
    PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='代理商自查审核历史表'*/;

CREATE TABLE `audit_user_white_domain` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '白名单id',
  `type` int(11) NOT NULL COMMENT '白名单类型，1-连通性，2-风险标注，3-主域一致性，5-IOS，6-Android',
  `user_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '用户id',
  `domain` varchar(128) NOT NULL COMMENT '域名',
  `url` varchar(4096) NOT NULL DEFAULT '' COMMENT 'URL',
  `url_md5` VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'URL MD5值',
  `state` tinyint(4) NOT NULL DEFAULT 1 COMMENT '是否生效，0-失效,1:生效',
  `operator_id` bigint(20) NOT NULL COMMENT '操作人id',
  `create_time` timestamp NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户主域白名单表'*/;

CREATE TABLE `expired_comment_warn_task` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `comment_id` BIGINT(20) NOT NULL COMMENT '批注id',
    `comment_type` INT(11) NOT NULL COMMENT '批注类型，对应包含大类小类批注类型的枚举',
    `target_id` BIGINT(20) NOT NULL COMMENT '批注目标ID',
    `target_type` INT(11) NOT NULL COMMENT '批注目标层级类型',
    `biz_type` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '批注关联的产品线,逗号分隔',
    `content` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '批注内容，需要拼接出标签内容',
    `expire_time` DATETIME NOT NULL COMMENT '过期时间',
    `comment_operator` BIGINT(20) NOT NULL COMMENT '批注人ID',
    `comment_create_time` DATETIME NOT NULL COMMENT '批注创建时间',
    `state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '状态（0：待处理，1：已完成）',
    `operator` BIGINT(20) NOT NULL COMMENT '操作人ID',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `handle_time` DATETIME COMMENT '处理时间',
    PRIMARY KEY (`id`)/*,
    KEY `idx_comment_id_state` (`comment_id`,`state`),
    KEY `idx_content` (`content`(64)),
    KEY `idx_expire_time` (`expire_time`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='过期批注提醒任务'*/;


CREATE TABLE `exception_log`(
   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `type` VARCHAR(1024) NOT NULL COMMENT '异常类型',
   `class_name` VARCHAR(1024) NOT NULL COMMENT '类名',
   `method_name` VARCHAR(256) NOT NULL  COMMENT '方法名',
   `exception` VARCHAR(1024) NOT NULL COMMENT '异常信息',
   `request` TEXT COMMENT '请求对象信息',
   `state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '处理状态，0：未处理，1：处理中，2：处理完成',
   `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
   PRIMARY KEY (`id`)/*,
   KEY `idx_type` (`type`),
   KEY `idx_class_method` (`class`, `method`)*/
)/* ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='异常信息日志'*/;


CREATE TABLE `web_task_instance` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id` BIGINT NOT NULL DEFAULT -1 COMMENT '提交任务的用户ID',
    `task_id` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '任务标识',
    `param` TEXT NOT NULL COMMENT '任务参数,JSON数据格式',
    `result` TEXT COMMENT '执行结果,JSON数据格式',
    `state` INT NOT NULL DEFAULT 0 COMMENT '执行状态,0:未启动,1:执行中,2:成功,3:失败',
    `submit_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
    `begin_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '执行开始时间',
    `end_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '执行结束时间',
    PRIMARY KEY (`id`)
)/*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = 'web-task任务实例表'*/;

CREATE TABLE `rule_evaluate_detail` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `eval_id` BIGINT NOT NULL COMMENT '评估批次',
  `rule_id` BIGINT NOT NULL DEFAULT -1 COMMENT '规则id',
  `user_id` BIGINT NOT NULL DEFAULT -1 COMMENT '用户id',
  `idea_id` BIGINT NOT NULL DEFAULT -1 COMMENT '物料id',
  `content` TEXT COMMENT '物料内容',
  `word` TEXT COMMENT '配对词列表',
  `consume` BIGINT NOT NULL DEFAULT 0 COMMENT '影响消费',
  `biz_type` BIGINT NOT NULL DEFAULT 0 COMMENT '产品线',
  `eval_date` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '评估日期',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  INDEX `idx_rule_id` (`rule_id`)*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '词表规则评估'*/;

CREATE TABLE `ara_illegal_clue` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `clue_no` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '线索号',
    `clue_url` VARCHAR(1024) NOT NULL COMMENT '线索地址',
    `clue_time` DATETIME NOT NULL COMMENT '线索时间',
    `ad_url` VARCHAR(1024) NOT NULL COMMENT '广告落地页',
    `user_id` BIGINT DEFAULT -1 COMMENT '用户id',
    `state` BIGINT DEFAULT 0 COMMENT '线索分析状态,0:未分析,1已分析',
    `biz_type` INT DEFAULT 1 COMMENT '产品线,1:WOLONG,2:HUICHUAN',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`)/*,
    INDEX `idx_ad_url_clue_time_clue_url` (`ad_url`(64),`clue_time`,`clue_url`(64))*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '违规线索'*/;

CREATE TABLE `ara_illegal_material` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `clue_id` BIGINT DEFAULT -1 COMMENT '线索id',
    `user_id` BIGINT DEFAULT -1 COMMENT '用户id',
    `ad_url` VARCHAR(1024) DEFAULT '' COMMENT '广告落地页地址',
    `accuracy` INT DEFAULT 1 COMMENT '线索准确度,1：主域一致,2：path一致,3：url一致',
    `idea_id` BIGINT DEFAULT -1  COMMENT '物料ID',
    `show_detail` TEXT COMMENT '展示详情,换行符分隔,title||desc||show_url||user_ip',
    `show_time` INT DEFAULT 0 COMMENT '展示时间',
    `on_time` INT DEFAULT 0 COMMENT '上线时间',
    `off_time` INT DEFAULT 0 COMMENT '下线时间',
    `consume` BIGINT DEFAULT 0 COMMENT '创意消耗',
    `state` INT DEFAULT 0 COMMENT '物料状态,0:定位物料,1:定位展现,2:定位消费',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`)/*,
    INDEX `idx_clue_id` (`clue_id`),
    INDEX `idx_ad_url_show_time` (`ad_url`(64),`show_time`)*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '违规物料'*/;


 CREATE TABLE `audit_special_agent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `agent_cs_name` varchar(128) NOT NULL COMMENT '用户对应代理商客服名称',
  `state` tinyint(4) NOT NULL DEFAULT 1 COMMENT '是否生效，0-失效,1:生效',
  `operator_id` bigint(20) NOT NULL COMMENT '操作人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `userid` (`userid`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='C类代理商客服表'*/;

CREATE TABLE `audit_special_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `target_id` bigint(20) NOT NULL COMMENT '代理商客服id',
  `type` tinyint(3) NOT NULL COMMENT '目标类型，1-代理商ID,2-客户ID,3-SME一线客服ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='污水渠账户表'*/;

CREATE TABLE `dsp_advertiser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(128) NOT NULL COMMENT 'dsp广告主名称',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `user_name` varchar(128) NOT NULL COMMENT '用户名称',
  `risk_sample_rate` double(5, 2) NOT NULL COMMENT '风险抽检比例，例如12.34代表12.34%',
  `risk_sample_max` int(10) NOT NULL DEFAULT 0 COMMENT '风险抽检最大数量，0表示不限制',
  `non_risk_sample_rate` double(5, 2) NOT NULL COMMENT '非风险抽检比例，例如12.34代表12.34%',
  `non_risk_sample_max` int(10) NOT NULL DEFAULT 0 COMMENT '非风险抽检最大数量，0表示不限制',
  `sale` varchar(128) NOT NULL COMMENT '销售负责人',
  `sale_email` varchar(256) NOT NULL COMMENT '销售负责人邮箱，多个用逗号或换行符区分',
  `operator_id` bigint(20) NOT NULL COMMENT '操作人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='dsp广告主表'*/;