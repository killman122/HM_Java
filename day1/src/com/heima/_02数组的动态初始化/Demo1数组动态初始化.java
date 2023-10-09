package com.heima._02数组的动态初始化;

/*
动态初始化数组:
    数据类型[] 数组名 = new 数据类型[长度];//长度必须是>=0的正整数
    int []arr = new int[3];//定义了一个长度为3的能够存储 int类型相匹配的长度为3数组
 */
public class Demo1数组动态初始化 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//能够打印输出数组的内存地址,实质上貌似是隐式的调用了toString()方法将数组转换为字符串输出它的路径  [I@1b6d3586    [:表示这个地址是数组的    I:int类型 @:分隔符   1b6d3586,表示数组在内存中以16进制的形式存储  0~9a~f
    }
}
