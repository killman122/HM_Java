package com.itheima.api_learn.date_demo;

import java.util.Date;

/*
    Date类 : 类   Date  表示特定的时间，对象代表的时当前系统时间

    构造方法:
        public Date():      创建Date对象,对象代表的时当前系统时间
        public Date(long date) 分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，即1970年1月1日00:00:00 GMT

    成员方法:
        long getTime():      返回自1970年1月1日以来，由此 Date对象表示的00:00:00 GMT的毫秒数
        void setTime(long time) 设置此 Date对象以表示1970年1月1日00:00:00 GMT后的 time毫秒的时间点
 */
public class Date_demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//使用打印的方法,发现打印出的数据不是对象的地址,所以推断出在Date类的内部重写了toString()方法
        System.out.println(date.getTime());
        Date date1 = new Date(1697377883294L);//记住在使用long长整型数据时记得要向最后加上l/L表示这是一个长整型和浮点型一样都要加后缀
        System.out.println(date1);
        date1.setTime(1697378018791L);
        System.out.println(date1);
    }
}
