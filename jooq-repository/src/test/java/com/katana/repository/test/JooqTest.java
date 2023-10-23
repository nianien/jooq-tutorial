package com.katana.repository.test;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.katana.jooq.entity.audit.Tables.USER_INFO;
import static com.katana.jooq.entity.uc.Tables.ACCOUNT;

/**
 * @author : liyifei
 * @created : 2023/10/23, 星期一
 * Copyright (c) 2004-2029 All Rights Reserved.
 **/
public class JooqTest {

    private static DSLContext dslContext;

    @BeforeAll
    public static void setup() {
        DefaultConfiguration config = new DefaultConfiguration();
        config.setSQLDialect(SQLDialect.MYSQL);
        config.settings()
                //shard-sphere不支持schema
                .withRenderSchema(false)
                .withRenderNameStyle(RenderNameStyle.AS_IS);
        dslContext = DSL.using(config);
    }


    @Test
    public void test() {
        com.katana.jooq.entity.uc.tables.Account ta = ACCOUNT.as("a");
        com.katana.jooq.entity.audit.tables.UserInfo tb = USER_INFO.as("b");
        String name = "liyifei";
        String sql = dslContext.renderInlined(dslContext.select(ta.asterisk()).from(ta)
                .join(dslContext.select().from(tb)
                        .where(tb.NAME.like(name)).asTable("c"))
                .on(tb.as("c").USERID.eq(ta.ID))
                .where(ta.NAME.like(name))
                .and(ta.ID.in(dslContext.select(tb.USERID).from(tb).where(tb.NAME.like(name))))
                .union(dslContext.select().from(ACCOUNT)
                        .where(ACCOUNT.NAME.like(name))));
        System.out.println(sql);
    }
}
