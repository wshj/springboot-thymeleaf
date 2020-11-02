package com.zhqy.springboot.config.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <h3>获取本机ip</h3>
 *
 * @author wangshuaijing
 * @version 1.0.0
 * @date 2020/11/2 5:00 下午
 */
public class LogIpConverter extends ClassicConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogIpConverter.class);

    private static String currentIp = null;

    static {
        try {
            currentIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            LOGGER.warn("获取本机ip失败，使用默认ip：127.0.0.1");
            currentIp = "127.0.0.1";
        }
    }

    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        return currentIp;
    }
}
