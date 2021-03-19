package com.atguigu;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //父容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    //Web容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    //DispatcherServlet映射信息
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
