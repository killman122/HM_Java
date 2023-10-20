package com.itheima.changeparameter_demo;
/*
    可变参数的应用: 主要是在函数中适用不同的参数个数,不需要重新创建多余的函数(只是参数的个数不同)
 */
public class Test {
    public static void main(String[] args) {
        sum(1,2,3);//直接输入数值
        sum(new int[]{1,2});//使用静态数组
    }
    public static int sum(int a,int b){
        return a+b;
    }
    //注意在Java中可以实现函数的重载(在同一个类中),参数列表不同,参数的个数,参数的类型..
    public static int sum(int a,int b,int c){
        return a+b;
    }
//    public static int sum(int []arr){//使用数组的方式可以传入多个数据,但是只能传入int类型数组,所以需要改进这里使用可变参数...
//        int sum = 0;
//        for (int i : arr) {
//            sum+=i;
//        }
//        return sum;
//    }
    public static int sum(int ...num){//实现的本质也是数组
        int sum = 0;
        for (int i : num) {
            sum+=i;
        }
        return sum;
    }
}
