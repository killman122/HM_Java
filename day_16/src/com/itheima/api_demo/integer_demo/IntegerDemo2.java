package com.itheima.api_demo.integer_demo;
/*
    包装类作用 : 基本数据类型和字符串之间转换
        基木数据类型-->string
        String-->基木数据类型
    注意 : parseXxx(string s)方法中只参数用字符串表示，字符串中只能是具体的数据值
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //基本数据类型 --> String
        int i = 100;
        //方式1变字符串直接在后面+空字符串
        String s = i + "";
        System.out.println(s);

        //方式2使用String类中的静态方法valueOf,通过静态方法调用,直接使用类调用
        String s1 = String.valueOf(i);
        System.out.println("==============");
        //String --> 基本数据类型
        //使用包装类中的静态方法parseXxx("字符串")
        int i1 = Integer.parseInt(s);
        s = "123";
        double x = Double.parseDouble(s);
        System.out.println(x);

    }
}
