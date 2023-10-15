package com.itheima.api_learn.local_date_time_demo;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //public static LocalDateTime now() 获取当前系统时间
        LocalDateTime now = LocalDateTime.now();//注意这里不能使用new方法出对象,似乎是一个私有的构造方法,在jdk文档中无法查询到构造方法但是可以在IDE中进行查找
        System.out.println(now);
        //public static LocalDateTime of(年,月,日,时,分,秒) 使用指定的年月日和时分秒初始化一个LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 16, 9, 38, 22);
        System.out.println(localDateTime);
    }
}
