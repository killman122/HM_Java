package com.itheima.printstream;

import java.io.PrintStream;

public class PrintTest2 {
    public static void main(String[] args) {
        //可以通过查看源码,发现out对象是一个PrintStream对象,所以可以使用PrintStream对象的方法
        //setOut()方法可以改变输出的位置,默认是输出到控制台,使用setOut方法可以接收一个打印流对象,作用是将内部默认打印流(out)的默认打印流改为自己的打印流
        try (
                PrintStream printStream = new PrintStream("day_11_6/src/wangdao888.txt")
        ) {
            System.setOut(printStream);
            System.out.println("我爱大美人");
            System.out.println(97);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
