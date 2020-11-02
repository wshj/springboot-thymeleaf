package com.zhqy.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <h3>index服务</h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @date 2020/11/2 1:47 下午
 */
@Service
public class IndexService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexService.class);

    public void hello() {
        LOGGER.debug("hello service");
        LOGGER.info("hello service");
    }

}
