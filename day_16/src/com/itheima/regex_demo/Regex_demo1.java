package com.itheima.regex_demo;

public class Regex_demo1 {
    public static void main(String[] args) {
        //验证字符串是否是三位数字
        System.out.println("123".matches("\\d{3}"));//因为在Java中\具有特殊的含义不能单独使用,所以选择通过\\来转义
        System.out.println("123".matches("\\d\\d\\d"));
        //验证手机号: 1为开头,第二位为3,5,8中的任意一个,后面跟9个数字
        System.out.println("".matches("1[358]\\d{9}"));
        System.out.println("".matches("1[358][0-9]{9}"));
        System.out.println("".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));
        //验证字符串是否以h开头,以d结尾,中间是任意字符
        System.out.println("".matches("h.d"));
    }
}
