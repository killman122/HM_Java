package com.itheima.trycatch_demo;

public class Try_CatchDemo {
    public static void main(String[] args) {
//        method();
//        method1();

        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);
            String s = "123";
            Integer i = Integer.parseInt(s);
            System.out.println(i);
            Object obj = "123";
            Integer j = (Integer) obj;
        } catch (Exception e) {
            System.out.println("程序出现异常,说了你也没法改,不给你显示了");
        }

    }

    private static void method1() {
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);
            String s = "123";
            Integer i = Integer.parseInt(s);
            System.out.println(i);
            Object obj = "123";
            Integer j = (Integer) obj;
        } catch (NumberFormatException e) {
            System.out.println("数字转换异常,在将一个String类型字符串转换为数字类型时出现异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界");
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
        }
    }

    private static void method() {
        //多个异常,每个异常单独处理
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界");
        }
        try {
            String s = "123";
            Integer i = Integer.parseInt(s);
            System.out.println(i);
            Object obj = "123";
            Integer j = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
        }
    }
}
