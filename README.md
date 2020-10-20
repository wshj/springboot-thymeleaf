# springboot-thymeleaf
springboot springmvc项目

## 20201017 项目搭建

- 如果想要使用默认的静态文件配置，千万不可以用 ```@EnableWebMvc```，否则会导致默认配置失效
- 可以通过 ```spring.mvc.static-path-pattern``` 配置与静态资源匹配的URL（通过正则匹配），默认：/**，指定后会导致默认值的失效

    - 例如没有单独指定静态资源路径，也没有配置 ```spring.mvc.static-path-pattern``` ，http://127.0.0.1:8081/index.html 访问的是 /resources/static/index.html
    - 例如没有单独指定静态资源路径，配置 ```spring.mvc.static-path-pattern: /static/**``` ，http://127.0.0.1:8081/static/index.html 访问的是 /resources/static/index.html
    

- 可以通过 ```spring.resources.static-locations``` 配置静态资源位置，默认：classpath:/static；classpath:/public；classpath:/resources；classpath:/META-INF/resources，指定后会导致默认值的失效

    - 例如配置 ```spring.resources.static-locations: /common/``` ，没有配置 ```spring.mvc.static-path-pattern``` ，http://127.0.0.1:8081/index.html 访问的是 /common/index.html
    
> 如果想要配置复杂的匹配规则，请参考master分支中的 ```WebConfig``` 文件