package com.itheima.exception_test;
/*
    | **方法名**                    | **说明**                          |
| ----------------------------- | --------------------------------- |
| public String getMessage()    | 返回此 throwable 的详细消息字符串 |
| public String toString()      | 返回此可抛出的简短描述            |
| public void printStackTrace() | 把异常的错误信息输出在控制台      |
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int arr[] ={1,2,3,4,5};
            System.out.println(arr[5]);
        } catch (Exception e) {//这里的e表示赋值的异常对象
            System.out.println(e.getMessage());//使用getMessage()方法获取异常的详细消息
            System.out.println(e.toString());//使用toString()方法获取异常的简短描述 异常的类型 + 异常的详细信息
            e.printStackTrace();//把异常的错误信息输出在控制台,和正常情况下输出的错误信息一样,便于调试快速定位异常所在的行  异常的类型+异常的详细信息+异常出现的原行
        }
    }
}
