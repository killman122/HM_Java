package com.itheima.trycatch_demo;

public class Exception_TryCatchDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("程序开始执行");
            int [] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
            System.out.println("程序执行结束");
        } catch (Exception e) {
            System.out.println(
                    "程序出现异常，异常信息为:"
            );
            throw new RuntimeException(e);
        }//在当异常的类型不确定导致无法使用catch捕获时,会自动调用虚拟机JVM异常处理打印异常的类型,异常出现的原因和位置在控制台
    }
}
