package com.katana.webapp.filter;

import org.jooq.impl.FieldCompleteListener;
import org.jooq.tools.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : liyifei
 * @created : 2023/10/20, 星期五
 * Copyright (c) 2004-2029 All Rights Reserved.
 **/
@WebFilter("/*")
@Component
public class HeaderFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String tenantCode = request.getHeader("tenant_code");
        String env = request.getHeader("env");
        if (!StringUtils.isEmpty(tenantCode)) {
            FieldCompleteListener.setFieldValue("tenant_code", tenantCode);
            FieldCompleteListener.setFieldValue("env", env);
        }
        super.doFilter(request, response, chain);
    }
}
