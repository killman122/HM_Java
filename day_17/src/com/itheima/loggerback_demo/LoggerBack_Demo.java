package com.itheima.loggerback_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerBack_Demo {
    //在代码中获取日志对象
    public  static final  Logger LOGGER = LoggerFactory.getLogger("LoggerDemo类");
    public static void main(String[] args) {//在Java中的Logger类名是org.slf4j.Logger很相似于python中的logger库,尤其是在控制台中产生的日志,带有时间和详细的日志级别的日志
        LOGGER.debug("debug日志");
        LOGGER.info("info日志");
        LOGGER.warn("warn日志");
        LOGGER.trace("trace级别的日志");
    }
}
