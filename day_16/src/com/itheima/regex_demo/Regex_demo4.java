package com.itheima.regex_demo;

import java.util.Arrays;

public class Regex_demo4 {
    public static void main(String[] args) {
        // 将以下字符串按照数字进行切割
        String str1 = "aa123bb234cc909dd";
        String[] split = str1.split("\\d+");//使用该正则表达式修改后,获取到的数据是不包含数字的,注意按照什么正则表达式分割则在分割后一定不存在该正则所包含的项
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));
//        System.out.println(str1.split("\\d+"));
        //将下面字符串中的"数字"替换为"*“a
        String str2 = "我卡里有100000元，我告诉你卡的密码是123456，要保密哦";
        System.out.println(str2.replaceAll("\\d", "*"));//在不添加条件的情况下默认使用一次替换且每次只匹配一个字符
        System.out.println(str2.replaceAll("\\d{1}", "*"));
        System.out.println(str2.replaceAll("\\d+", "*"));//但是如果在正则式中加入+则表示匹配一次或者多次,这里就会将所有的数字都替换为一个*(当出现连续的数字时)
    }
}
