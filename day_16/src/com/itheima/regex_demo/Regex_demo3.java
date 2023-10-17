package com.itheima.regex_demo;

public class Regex_demo3 {
    public static void main(String[] args) {
        //分组实现序列号的分组DG8FV-B9TKY-FRT9J-99899-XPQ4G
        System.out.println("DG8FV-B9TKY-FRT9J-99899-XPQ4G".matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));//这里的4等同于将前面的字符重复的四次,这里指的前面的字符是使用()包裹的字符分组
        System.out.println("DG8F_-B9TKY-FRT9J-99899-XPQ4G".matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));
    }
}
