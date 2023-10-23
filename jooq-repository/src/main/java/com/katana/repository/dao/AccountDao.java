package com.katana.repository.dao;

import com.katana.jooq.entity.uc.tables.pojos.Account;
import com.katana.jooq.entity.uc.tables.records.AccountRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static com.katana.jooq.entity.audit.Tables.USER_INFO;
import static com.katana.jooq.entity.audit.Tables.USER_INFO_CONFIG;
import static com.katana.jooq.entity.uc.Tables.ACCOUNT;

/**
 * @author : liyifei
 * @created : 2023/10/20, 星期五
 * Copyright (c) 2004-2029 All Rights Reserved.
 **/
@Repository
public class AccountDao {

    @Resource
    private DSLContext dslContext;

    public List<Account> find(String name) {


        com.katana.jooq.entity.uc.tables.Account ta = ACCOUNT.as("a");
        com.katana.jooq.entity.audit.tables.UserInfo tb = USER_INFO.as("b");
        com.katana.jooq.entity.audit.tables.UserInfoConfig td = USER_INFO_CONFIG.as("d");
        // join subquery and where subquery
        return dslContext.select(ta.asterisk()).from(ta)
                .join(
                        dslContext.select(tb.asterisk()).from(tb)
                                .where(tb.NAME.eq(name)
                                ).asTable("c")
                )
                .on(tb.as("c").USERID.eq(ta.ID))
                .where(ta.NAME.eq(name))
                .and(ta.ID.in(dslContext.select(td.USERID).from(td).where(td.AUDITOR_ID.ge(0L))))
                .union(dslContext.select().from(ACCOUNT)
                        .where(ACCOUNT.NAME.eq(name)))
                .fetchInto(Account.class);
    }


    public List<Account> get(String name) {
        return dslContext.select().from(ACCOUNT)
                .where(ACCOUNT.NAME.like(name))
                .fetchInto(Account.class);
    }

    public int insert(String name, String phone, String email, int count) {
        AccountRecord[] records = new AccountRecord[count];
        for (int i = 0; i < count; i++) {
            AccountRecord record = new AccountRecord();
            record.setName(name);
            if (i > 0) {
                record.setPhone(phone);
            } else {
                record.setPhone(phone);
            }
            record.setEmail(email);
            records[i] = record;
        }
        dslContext.batchInsert(records).execute();

        AccountRecord record = new AccountRecord();
        record.setName(name);
        record.setPhone(phone);
        record.setEmail(email);
        dslContext.insertInto(ACCOUNT).set(record).newRecord().set(record).execute();
        //id, name, phone, email, create_time, update_time, tenant_code, env
        return dslContext.insertInto(ACCOUNT, ACCOUNT.NAME, ACCOUNT.PHONE, ACCOUNT.EMAIL, ACCOUNT.CREATE_TIME, ACCOUNT.UPDATE_TIME, ACCOUNT.TENANT_CODE, ACCOUNT.ENV).select(
                dslContext.select(ACCOUNT.NAME, ACCOUNT.PHONE, ACCOUNT.EMAIL, ACCOUNT.CREATE_TIME, ACCOUNT.UPDATE_TIME, ACCOUNT.TENANT_CODE, ACCOUNT.ENV)
                        .from(ACCOUNT).limit(1)).execute();
    }

    public int update(String name, String phone, String email) {
        return dslContext.update(ACCOUNT)
                .set(ACCOUNT.EMAIL, email)
                .set(ACCOUNT.PHONE, phone)
                .set(ACCOUNT.TENANT_CODE, "bad_tenant")
                .where(ACCOUNT.NAME.eq(name))
                .and(ACCOUNT.ID.in(dslContext.select(USER_INFO.USERID).from(USER_INFO).where(USER_INFO.USERID.ge(0L))))
                .execute();
    }

    public int delete(String name) {
        return dslContext.delete(ACCOUNT)
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }
}
