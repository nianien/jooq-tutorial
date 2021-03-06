package com.tengzhe.jooq.test;

import com.tengzhe.jooq.jdbc.JooqJdbcConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class JooqApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(JooqJdbcConfig.class)
                .profiles("jdbc")
                .child(JooqApplication.class).web(WebApplicationType.SERVLET)
                .build().run(args);
        System.out.println(context.getBean(JooqJdbcConfig.class));
    }


    @RequestMapping("/")
    public String index() {
        return "hello,word!";
    }

}