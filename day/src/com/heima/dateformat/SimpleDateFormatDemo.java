package com.heima.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat类:
        public abstract class DateFormat : 抽象类不能被直接使用,需要使用其子类
        public class SimpleDateFormat : 使用此类

    构造方法:
        public SimpleDateFormat(String pattern) : 使用指定时间日期模板创建对象

    作用: 日期和字符串之间作转换
        String-->Date   :  解析   parse()
        Date --> String : 格式化   format()
    需求1 : 获取当前的日期对象,使用格式:yyyy-MM-dd HH:mm:ss 来表示,例如 : 2010-10-22 12:22:22[格式化]
    需求2 : 将字符串的2020年10月1日   17:28:33. 转换为日期Date对象 [解析]
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
//    需求1 : 获取当前的日期对象,使用格式:yyyy-MM-dd HH:mm:ss 来表示,例如 : 2010-10-22 12:22:22[格式化]
        format_time();
        //String-->Date
        //需求2 : 将字符串的2020年10月1日   17:28:33. 转换为日期Date对象 [解析]
        String s = "2023-10-16 09:25:33";
        //创建的日期格式化器对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd MM:mm:ss");//注意匹配字符串的格式必须和原有的串一直,否则无法匹配到会爆出异常,但是可以只保留解析匹配串模板中的一部分,例如:yyyy
        try {
            Date parse = simpleDateFormat.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    private static void format_time() {
        //Date-->String : 格式化
        Date date = new Date();
        System.out.println(date);
        //public final String format(Date date)     使用final关键字的方法可以被继承但是不能被重写
        //创建的日期格式化器对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd MM:mm:ss");
        String format_date = simpleDateFormat.format(date);
        System.out.println(format_date);
    }
}
