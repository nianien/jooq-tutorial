package com.tengzhe.jooq.test.controller;

import com.tengzhe.jooq.data.uc.tables.pojos.Account;
import com.tengzhe.jooq.data.uc.tables.records.AccountRecord;
import org.jooq.DSLContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static com.tengzhe.jooq.data.uc.Tables.ACCOUNT;

/**
 * 用户管理模块
 * Created on 2022/1/24
 *
 * @author liyifei
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    private DSLContext dslContext;


    /**
     * 用户查询
     *
     * @param name 用户名
     * @return
     */
    @GetMapping("/{name}")
    public List<Account> get(@PathVariable String name) {
        com.tengzhe.jooq.data.uc.tables.Account alias = ACCOUNT.as("a");
        return dslContext.select(alias.asterisk()).from(alias)
//                .where(alias.NAME.eq("name' or a='a"))
                .fetchInto(Account.class);//name' or a='a
    }

    /**
     * 注册用户
     *
     * @param name  用户名
     * @param phone 电话
     * @param email 邮箱
     * @return 注册结果
     */
    @GetMapping("/insert/{name}/{phone}/{email}")
    public String register(@PathVariable String name, @PathVariable String phone, @PathVariable String email) {

        AccountRecord[] records = new AccountRecord[2];
        AccountRecord record = new AccountRecord();
        record.setName(name);
        record.setPhone(phone);
        record.setEmail(email);
        records[0] = record;
        AccountRecord record2 = new AccountRecord();
        record2.setName(name);
        record2.setPhone(phone);
        record2.setEmail(email);
        records[1] = record2;
        dslContext.batchInsert(records).execute();
//        dslContext.insertInto(ACCOUNT)
//                .columns(ACCOUNT.NAME, ACCOUNT.PHONE, ACCOUNT.EMAIL, ACCOUNT.TENANT_CODE)
//                .values(name, phone, email, "mytest")
//                .execute();
        return "success";
    }


    /**
     * 用户查询
     *
     * @param name 用户名
     * @return
     */
    @GetMapping("/update/{name}/{phone}/{email}")
    public int put(@PathVariable String name, @PathVariable String phone, @PathVariable String email) {

        return dslContext.update(ACCOUNT)
                .set(ACCOUNT.EMAIL, email)
                .set(ACCOUNT.TENANT_CODE, "mytest")
                .where(ACCOUNT.NAME.eq(name))
                .and(ACCOUNT.PHONE.eq(phone))
                .execute();
    }

    /**
     * 用户查询
     *
     * @param name 用户名
     * @return
     */
    @GetMapping("/delete/{name}")
    public int delete(@PathVariable String name) {
        return dslContext.delete(ACCOUNT)
                .where(ACCOUNT.NAME.eq(name))
                .execute();
    }
}
