# springboot-thymeleaf
springboot thymeleaf项目

## 20201017 项目搭建

- 文章详见：https://www.yuque.com/zhqy/springboot/glq5gi
- 通过 spring.thymeleaf.prefix 指定模板文件路径
- 通过将 WebConfig 实现 WebMvcConfigurer 接口并重写 addResourceHandlers 方法来指定静态资源路径

## 20201026 启用日志

- 文章详见：https://www.yuque.com/zhqy/springboot/lm3qpo
- 使用默认日志：logback
    - 文档：https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto-configure-logback-for-logging
    - 使用 Spring Boot Logback extensions. 
    - logback官网：http://logback.qos.ch/documentation.html