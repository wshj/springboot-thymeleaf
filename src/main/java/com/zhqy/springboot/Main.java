package com.zhqy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <h3></h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @date 2020/10/16
 */
@SpringBootApplication
@ComponentScan
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
