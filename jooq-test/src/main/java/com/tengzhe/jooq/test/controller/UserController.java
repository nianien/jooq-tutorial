package com.tengzhe.jooq.test.controller;

import com.tengzhe.jooq.data.uc.tables.pojos.Account;
import org.jooq.DSLContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static com.tengzhe.jooq.data.uc.Tables.ACCOUNT;

/**
 * Created on 2022/1/24
 *
 * @author liyifei
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    private DSLContext dslContext;

    @GetMapping("/{name}/{phone}/{email}")
    public String register(@PathVariable String name, @PathVariable String phone, @PathVariable String email) {
        dslContext.insertInto(ACCOUNT)
                .columns(ACCOUNT.NAME, ACCOUNT.PHONE, ACCOUNT.EMAIL)
                .values(name, phone, email)
                .execute();
        return "success";
    }


    @GetMapping("/{name}")
    public Account get(@PathVariable String name) {
        return dslContext.select().from(ACCOUNT)
                .where(ACCOUNT.NAME.contains(name))
                .fetchOneInto(Account.class);
    }
}
