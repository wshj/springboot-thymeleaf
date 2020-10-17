package com.zhqy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3></h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @CreateDate 2020/10/16
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "aaa");
        return "aaa";
    }

}
