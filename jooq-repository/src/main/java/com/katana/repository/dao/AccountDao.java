package com.katana.repository.dao;

import com.katana.jooq.entity.uc.tables.pojos.Account;
import com.katana.jooq.entity.uc.tables.records.AccountRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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
        com.katana.jooq.entity.uc.tables.Account alias = ACCOUNT.as("a");
        return dslContext.select(alias.asterisk()).from(alias)
                .where(alias.NAME.like(name))
                .fetchInto(Account.class);
    }


    public int insert(String name, String phone, String email, int count) {
//        AccountRecord[] records = new AccountRecord[count];
//        for (int i = 0; i < count; i++) {
//            AccountRecord record = new AccountRecord();
//            record.setName(name);
//            record.setPhone(phone);
//            record.setEmail(email);
//            records[i] = record;
//        }
//        return dslContext.batchInsert(records).execute();

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
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }

    public int delete(String name) {
        return dslContext.delete(ACCOUNT)
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }
}
