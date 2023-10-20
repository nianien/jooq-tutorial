package com.katana.repository.dao;

import com.katana.jooq.entity.uc.tables.pojos.Account;
import com.katana.jooq.entity.uc.tables.records.AccountRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static com.katana.jooq.entity.audit.Tables.USER_INFO;
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
        //from alias join alias
        dslContext.select(ta.asterisk()).from(ta)
                .join(tb).on(tb.USERID.eq(ta.ID))
                .where(ta.NAME.like(name))
                .fetchInto(Account.class);
        //from table join table
        dslContext.select(ACCOUNT.asterisk()).from(ACCOUNT)
                .join(USER_INFO).on(USER_INFO.USERID.eq(ACCOUNT.ID))
                .where(ACCOUNT.NAME.like(name))
                .fetchInto(Account.class);
        //from alias join table
        dslContext.select(ta.asterisk()).from(ta)
                .join(USER_INFO).on(USER_INFO.USERID.eq(ta.ID))
                .where(ta.NAME.like(name))
                .fetchInto(Account.class);
        //from table join alias
        dslContext.select(ACCOUNT.asterisk()).from(ACCOUNT)
                .join(tb).on(tb.USERID.eq(ACCOUNT.ID))
                .where(ACCOUNT.NAME.like(name))
                .fetchInto(Account.class);

        return dslContext.select(ta.asterisk()).from(ta)
                .where(ta.NAME.like(name))
                .and(ta.ID.in(dslContext.select(tb.USERID).from(tb).where(tb.NAME.like(name))))
                .fetchInto(Account.class);
    }


    public int insert(String name, String phone, String email, int count) {
//        AccountRecord[] records = new AccountRecord[count];
//        for (int i = 0; i < count; i++) {
//            AccountRecord record = new AccountRecord();
//            record.setName(name);
//            if (i > 0) {
//                record.setPhone(phone + "9999999999");
//            } else {
//                record.setPhone(phone);
//            }
//            record.setEmail(email);
//            records[i] = record;
//        }
//        int[] res = dslContext.batchInsert(records).execute();
//        return Arrays.stream(res).sum();

        AccountRecord record = new AccountRecord();
        record.setName(name);
        record.setPhone(phone);
        record.setEmail(email);
        return dslContext.insertInto(ACCOUNT).set(record).newRecord().set(record).execute();
    }

    public int update(String name, String phone, String email) {
        return dslContext.update(ACCOUNT)
                .set(ACCOUNT.EMAIL, email)
                .set(ACCOUNT.PHONE, phone)
                .set(ACCOUNT.TENANT_CODE,"bad_tenant")
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }

    public int delete(String name) {
        return dslContext.delete(ACCOUNT)
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }
}
