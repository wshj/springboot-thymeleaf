# springboot-thymeleaf
springboot thymeleaf项目

## 20201017 项目搭建

- 通过 spring.thymeleaf.prefix 指定模板文件路径
- 通过将 WebConfig 实现 WebMvcConfigurer 接口并重写 addResourceHandlers 方法来指定静态资源路径

## 20201026 启用日志

- 使用默认日志：logback
    - 文档：https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto-configure-logback-for-logging
    - 使用 Spring Boot Logback extensions.