package com.heima.方法概述;
/*
        方法的概述:
            1.方法就是解决问题的办法
        方法定义:
        格式:
            public static void 方法名(){
                方法体
            }
        特点:
            方法和方法之间是平行关系,不能嵌套定义
            方法定义后不会自己执行,需要被调用后才能执行,方法定义的先后顺序和方法执行的顺序无关
 */
public class Demo方法概述 {
    public static void main(String[] args) {
        sum();
        helloworld();
        sum1();
    }

    private static void helloworld() {
        System.out.println("helloworld");
    }

    public static void sum(){
        System.out.println(1+1);

    }
    //定义方法求1-100 之间的数据和
    public static void sum1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("求出的1-100之间的数据和为"+sum);
    }
}
