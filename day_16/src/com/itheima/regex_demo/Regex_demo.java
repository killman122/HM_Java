package com.itheima.regex_demo;

public class Regex_demo {
    public static void main(String[] args) {
        String s = "had";
        //验证字符串是否以h开头以d结尾,中间是aeiou中的某个字符,注意在Java中的正则表达式和python中的正则表达式略有不同
        boolean result = s.matches("h[aeiou]d");
        System.out.println(result);
        //验证字符串是否以h开头以d结尾,中间不是aeiou中的某个字符
        s = "hcd";
        result = s.matches("h[^aeiou]d");
        System.out.println(result);
        //验证字符串是否a-z中任意一个小写字符开头,后面跟ad
        s = "aad";
        result = s.matches("[a-z]ad");
        System.out.println(result);
        //验证str是否以a-d或者m-p之间的某个字符开头,后面跟ad
        s = "aad";
        result = s.matches("[a-dm-p]ad");
        System.out.println(result);

        //- && : 并且
        //- | : 或者
        //要求字符串是以除了a,e,i,o,u之外的任意小写字符开头,后面跟ad
        System.out.println("".matches("[[^aeiou]&&a-z]ad"));
        //要求字符串是a,e,i,o,u中的某个字符开头,后面跟ad
        System.out.println("|ad".matches("[aeiou]ad"));//注意黑马讲错了,这里不能添加|,否则会匹配|ad类型的错误

    }
}
