package com.zhqy.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>测试</h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @date 2020/10/20 4:15 下午
 */
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String index(){
        return "hello word";
    }

}
