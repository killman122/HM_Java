package com.itheima.waitnotify_demo2;

public class Desk {
    //初始化汉堡的数目为10个
    public static int count =10;
    //flag表示桌子上食物的状态,如果没有就是以false表示，如果有就是以true表示
    public static boolean flag = false;
    //创建一个锁对象,由于需要同步代码需要使用静态的所以锁对象也设置为静态变量,并且不想让锁对象被修改所以使用final修饰,由于使用final修饰的是常量,所以使用大写字母表示
    public static final Object LOCK = new Object();
}
