package com.tengzhe.jooq.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class JooqApplication {


    public static void main(String[] args) {
        SpringApplication.run(JooqApplication.class);
    }


    @RequestMapping("/")
    public String index() {
        return "hello,word!";
    }

}