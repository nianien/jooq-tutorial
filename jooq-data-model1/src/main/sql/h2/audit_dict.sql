-- noinspection SqlNoDataSourceInspectionForFile

CREATE SCHEMA `audit_dict`;
SET SCHEMA `audit_dict`;

CREATE TABLE `audit_word_rule` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
    `source` INT NOT NULL DEFAULT '-1' COMMENT '数据来源,支持按位与运算,1:汇川,2:应用商店 4:卧龙',
    `operator_id` BIGINT NOT NULL DEFAULT '-1' COMMENT '审核员id',
    `word` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '关键词',
    `word_type` INT NOT NULL COMMENT '词表类型, 1:黑名单，2：商标词，3：竞品词，4：敏感词',
    `match_type` INT NOT NULL DEFAULT '-1' COMMENT '匹配规则, 0:分散,1:包含,2:精确',
    `entity_type` INT NOT NULL DEFAULT '-1' COMMENT '实体类型,支持按位与运算,1:创意,2:关键词',
    `exclude_words` TEXT COMMENT '非限词,以"\n"分隔',
    `exclude_users` TEXT COMMENT '非限用户,以","分隔',
    `exclude_customers` TEXT COMMENT '非限客户ID,以","分隔',
    `industries` VARCHAR (1024) NOT NULL DEFAULT '0' COMMENT '生效行业ID，以","分隔',
    `grade` tinyint(4) NOT NULL DEFAULT 1 COMMENT '等级 1:低,2:高',
    `status` TINYINT NOT NULL DEFAULT '1' COMMENT '规则状态, 0:待评估, 1:生效, 2:失效',
    `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
    `risk_tag` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '风险标签',
    `extra_data` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '附加数据',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
);--'审核规则词表'

CREATE TABLE `audit_similar_word` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
    `operator_id` BIGINT (20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
    `source` int(11) NOT NULL DEFAULT 0 COMMENT '数据来源,1:卧龙,2:汇川,4:应用分发',
    `original_word` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '原体词名称',
    `similar_word` VARCHAR (4096) NOT NULL DEFAULT '' COMMENT '变体词名称, 以"\n"分隔',
    `status` TINYINT NOT NULL DEFAULT '1' COMMENT '规则状态  1:生效, 2:失效',
    `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
    `extra_data` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '附加数据',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
);--'变体规则词表'



CREATE TABLE `system_property` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
    `name` BIGINT (20) NOT NULL DEFAULT '-1' COMMENT '属性名',
    `value` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '属性值',
    `label` VARCHAR (256) NOT NULL DEFAULT '' COMMENT '属性描述',
    `group` VARCHAR (256) DEFAULT '' COMMENT '分组,默认为: 表名.字段端',
    `enable` TINYINT NOT NULL DEFAULT 1 COMMENT '是否启用,1:启用, 2:不启用',
    `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
);--'系统属性表'


CREATE TABLE `audit_whitelist_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL DEFAULT 0 COMMENT '客户ID',
  `site_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '网站Url',
  `uc_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `biz_types` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '产品线 1-卧龙 2-汇川 4-分发 5-导航 6-其他，逗号分隔',
  `target_type` int(11) NOT NULL DEFAULT -1 COMMENT '免审类型 -1 全部 1-订单免审,2-物料免审',
  `dimension` tinyint(4) NOT NULL COMMENT '免审维度 1-cid,2-url,3-userid',
  `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员id',
  `status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '0-免审 1-解除免审',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核白名单配置'*/;

CREATE TABLE `audit_risk_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(16) NOT NULL DEFAULT -1 COMMENT '编码，约定的业务编码',
  `name` VARCHAR(32) NOT NULL COMMENT '名称',
  `parent_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '父级id，与id构建树结构',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`) ---,
  --  UNIQUE KEY `idx_code` (`code`)
) /* ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='拒绝理由风险类别' */;

CREATE TABLE `audit_risk_tag` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '拒绝理由风险编码',
  `target` int(11) NOT NULL DEFAULT '1' COMMENT '对象：1-文字、2-图片、4-推广来源、8-落地页、16-物料等',
  `reason_detail` varchar(255) NOT NULL DEFAULT '' COMMENT '详细话术',
  `additional` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否可以附加，通常显示文本框',
  `strategy_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否策略标记: 0-否，1-是',
  `enabled` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，1-生效中，0-不生效',
  `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
  `operator_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '操作人id',
  `seq` int(11) NOT NULL DEFAULT '1' COMMENT '排序号，从1开始',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) ---,
  --  UNIQUE KEY `idx_code` (`code`),
  --  KEY `idx_seq` (`seq`)
) /* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拒绝理由风险配置' */;

CREATE TABLE `audit_type_risk_tag_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL DEFAULT '0' COMMENT '审核类型，对应实体类型AuditEntityType',
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '拒绝理由风险编码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) -- ,
--  UNIQUE KEY `idx_code` (`code`,`type`),
--  KEY `idx_type` (`type`)
) /* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核类型及拒绝理由风险配置关系' */;

CREATE TABLE `audit_strategy_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '策略名称',
  `type` varchar(255) NOT NULL DEFAULT '' COMMENT '策略类型信息',
  `enabled` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，1-生效中，0-不生效',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) /* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核策略配置表' */;

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


CREATE TABLE `risk_customer_rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `type` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '信息类型,1:客户名称,2:账户名称,3:客服账号,4:代理商',
  `content` varchar(2048) NOT NULL DEFAULT '' COMMENT '添加内容',
  `risk_type` varchar(128) NOT NULL DEFAULT '' COMMENT '风险类型,多个之间使用逗号分隔',
  `add_reason` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '添加原因',
  `apply_product` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '应用产品,1:搜索,2:品专,3:汇川',
  `handle_way` int(11) NOT NULL DEFAULT '-1' COMMENT '风控处理方式,1:发人工监控,2:展现屏蔽,4:分流量屏蔽',
  `region_code` varchar(2048) NOT NULL DEFAULT '' COMMENT '展现屏蔽地域,全部屏蔽为*',
  `effect_date_period` varchar(2048) NOT NULL DEFAULT '' COMMENT '屏蔽时间，eg: 20171201-20180105:0-16 (17年12月1号到18年1月5号，每天0点到16点),20171201-:0-16 (17年12月1号到永久，每天0点到16点)',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `logic_state` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '逻辑状态,0:有效,1:已删除,2:无效',
  `operator_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '最近操作人id',
  `operator_name` varchar(128) NOT NULL DEFAULT '' COMMENT '最近操作人名字',
  `operate_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `bucket_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '0:全部,1:内渠,2:外渠',
  `ad_resources` varchar(16) NOT NULL DEFAULT '' COMMENT '1:头条,2:精准,4:应用商店,多个之前用;分割',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='风险客户规则表'*/;

CREATE TABLE `flat_risk_customer_rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `risk_rule_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '风险客户规则表id',
  `type` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '信息类型,1:客户名称,2:账户名称,3:客服账号,4:代理商',
  `userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '用户id',
  `apply_product` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '应用产品,1:搜索,2:品专,3:汇川',
  `handle_way` int(11) NOT NULL DEFAULT '-1' COMMENT '风控处理方式,1:发人工监控,2:展现屏蔽,4:分流量屏蔽',
  `region_code` varchar(2048) NOT NULL DEFAULT '' COMMENT '展现屏蔽地域,全部屏蔽为*',
  `effect_date_period` varchar(2048) NOT NULL DEFAULT '' COMMENT '屏蔽时间，eg: 20171201-20180105:0-16 (17年12月1号到18年1月5号，每天0点到16点),20171201-:0-16 (17年12月1号到永久，每天0点到16点)',
  `blocking_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT 'blocking_user_strategy表的id',
  `logic_state` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '逻辑状态,0:有效,1:已删除,2:无效',
  `next_process_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '此条记录下次需要进行处理的时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `bucket_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '0:全部,1:内渠,2:外渠',
  `ad_resources` varchar(16) NOT NULL DEFAULT '' COMMENT '1:头条,2:精准,4:应用商店,多个之前用;分割',
  PRIMARY KEY (`id`)/*,
  KEY `next_process_time` (`next_process_time`),
  KEY `idx_blocking_apply_product` (`blocking_id`,`apply_product`),
  KEY `idx_risk_rule_id` (`risk_rule_id`,`userid`),
  KEY `idx_userid` (`userid`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拍平后的风险用户规则表,userId粒度'*/;

CREATE TABLE `refuse_reason` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(20) DEFAULT NULL,
  `reason` varchar(255) NOT NULL COMMENT '拒绝原因描述',
  `reason_detail` varchar(128) DEFAULT NULL COMMENT '拒绝原因的详情',
  `audit_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '审核类型，0默认，1关键词，2创意，3高级创意，4xijing，5app，6用户资质，7用户信息 ',
  `order_id` int(10) NOT NULL DEFAULT '0' COMMENT '显示顺序，可调整原因显示的顺序',
  `app_id` tinyint(2) NOT NULL DEFAULT '10' COMMENT '产品线id，10为卧龙，20为cpt，30为紫龙，40为汇川',
  `additionable` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否可以补充理由，0为不需要，1为需要',
  `level` tinyint(2) NOT NULL DEFAULT '1' COMMENT '拒绝理由级别,一级为1，二级为2',
  `parent_id` int(10) NOT NULL DEFAULT '0' COMMENT '上级理由id',
  `show_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否展示，0：不展示，1：展示',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB AUTO_INCREMENT=50125 DEFAULT CHARSET=utf8 COMMENT='推广物料审核拒绝原因表'*/;

CREATE TABLE `sync_word_rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sync_type` tinyint(4) NOT NULL DEFAULT -1 COMMENT '同步类型（1：用户，2：客户）',
  `word_type` varchar(128) NOT NULL DEFAULT '' COMMENT '词表类型,逗号分隔,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `source_id` varchar(256) NOT NULL COMMENT '原id',
  `target_id` TEXT COMMENT '目标id,逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '状态(0: 未操作,1:操作正在进行, 2:操作已完成)',
  `operator_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '操作人id',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '词表规则同步'*/;