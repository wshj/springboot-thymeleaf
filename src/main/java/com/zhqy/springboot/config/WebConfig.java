package com.zhqy.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <h3></h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @CreateDate 2020/10/17
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 匹配 /static/ 开头的url，然后从根目录下的 static 下根据具体路径查询。
        // 例如url为：http://localhost:8081/static/layui-v2.5.6/layui/layui.all.js 则查询的是根目录下的 /static/layui-v2.5.6/layui/layui.all.js 文件
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
}
