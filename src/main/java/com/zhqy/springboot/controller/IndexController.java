package com.zhqy.springboot.controller;

import com.zhqy.springboot.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3></h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @date 2020/10/16
 */
@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "aaa");

        // 按级别输出内容
        LOGGER.trace("进入了index方法");
        LOGGER.debug("进入了index方法");
        LOGGER.info("进入了index方法");
        LOGGER.warn("进入了index方法");
        LOGGER.error("进入了index方法");
        LOGGER.error("进入了index方法", new RuntimeException("报了个错"));

        indexService.hello();

        return "aaa";
    }

}
