package com.itheima.throws_demo;

public class Exception_ThrowDemo1 {
    public static void main(String[] args) {
        System.out.println("家里一个貌美如花的老婆");
        System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要");
        //创建一个异常对象并抛出
        throw new RuntimeException();
        //System.out.println("卑微代码无法执行");
    }
}
