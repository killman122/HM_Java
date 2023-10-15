package com.itheima.api_learn.SystemDemo;
/*
    System类:
        public static void exit(int status): 终止当前运行的Java虚拟机,非0表示异常发生
        public static long currentTimeMillis() 返回当前时间(以毫秒为单位)

    break: 结束switch语句和循环语句
    return:结束方法
    System.exit(0):结束所有,终止JVM虚拟机
 */
public class SystemDemo {
    public static void main(String[] args) {
//        System.exit(0);
//        System.out.println("取不到的代码");
        show();
        System.out.println("show方法结束了");
    }
    public static void show(){
        for (int i = 0; i < 10; i++) {
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("循环结束了");
    }
}
