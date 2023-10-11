package com.heima.String;
/*
    StringBuilder学习 类的学习
    1. 类结构
        String trim()  返回一个字符串,其值位此字符串,并删除任何前导尾随空格
        java.lang.Object
            java.lang.StringBuilder学习

        public final class StringBuilder学习 extends Object implements Serializable, CharSequence

    2.描述:
        一个可变的字符序列,和数组以及Java中的字典元组等有一些相似
    3.构造方法:
        StringBuilder学习() 构造一个没有字符的字符串构建器，初始容量为16个字符。
        StringBuilder学习(CharSequence seq) 构造一个包含与指定的相同字符的字符串构建器 CharSequence。
        StringBuilder学习(int capacity) 构造一个没有字符的字符串构建器，由 capacity参数指定的初始容量。
        StringBuilder学习(String str) 构造一个初始化为指定字符串内容的字符串构建器。
    4.成员方法
        int capacity() 无参数 返回当前容量
        String toString() 返回表示此顺序中的数据的字符串 将StringBuilder类型对象转换为String类型对象
 */
public class StringBuilder学习 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int capacity = stringBuilder.capacity();
        System.out.println("StringBuilder字符串构建器中有"+capacity+"个初始容量");
        StringBuilder stringBuilder1 = new StringBuilder(32);
        capacity = stringBuilder1.capacity();
        System.out.println("StringBuilder1字符串构建器中有"+capacity+"个初始容量");
        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder2.capacity());
        System.out.println(stringBuilder2.getClass().getSimpleName());

        //常用方法
        //StringBuilder append(boolean b) 将 boolean参数的字符串表示附加到序列中。  
        StringBuilder sb = stringBuilder.append(100);
        System.out.println(sb);
        System.out.println(stringBuilder);//相当于向可迭代对象中添加元素,但是又为元素取了一个别名,实际上是对同一个元素进行操作
        //通过直接进行打印输出sout不能打印出StringBuilder类型的对象在内存中的id值,但是可以通过下断点的方式逐步查看在内存中的引用编号是否一致,如果一致则指向的是同一个对象
        //也可以通过算数运算符判断是否是同一个对象/变量,如果是true则在内存中占同一个地址,反之亦然
        System.out.println(sb==stringBuilder);
    }
}
