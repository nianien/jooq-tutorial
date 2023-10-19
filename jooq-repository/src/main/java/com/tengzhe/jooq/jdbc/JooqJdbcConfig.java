package com.tengzhe.jooq.jdbc;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameCase;
import org.jooq.conf.RenderQuotedNames;
import org.jooq.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
public class JooqJdbcConfig {

    @Value("${spring.application.name:}")
    private String name;

    @Bean
    @Primary
    public DSLContext ruleDslContext(@Autowired DataSource dataSource,
                                     @Value("${spring.jooq.sql-dialect:MySQL}") SQLDialect sqlDialect) {
        DefaultConfiguration config = new DefaultConfiguration();
        config.setSQLDialect(sqlDialect);
        config.setDataSource(dataSource);
        config.settings()
                .withRenderSchema(false)
                .withRenderNameCase(RenderNameCase.AS_IS)
                .withRenderQuotedNames(RenderQuotedNames.EXPLICIT_DEFAULT_UNQUOTED);
        config.set(new PerformanceListener()/*, new TenantListener(), new ValidatorListener()*/);
        return DSL.using(config);
    }

    @Override
    public String toString() {
        return "JooqJdbcConfig{" +
                "name='" + name + '\'' +
                '}';
    }
}