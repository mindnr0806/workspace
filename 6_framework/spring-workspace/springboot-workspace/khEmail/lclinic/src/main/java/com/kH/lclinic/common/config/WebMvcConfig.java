package com.kH.lclinic.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kH.lclinic.inertceptor.UserInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final UserInterceptor loginInterceptor;

    public WebMvcConfig(UserInterceptor loginInterceptor) {
        this.loginInterceptor = loginInterceptor;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/counsel");
    }
}
