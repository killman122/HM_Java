package com.itheima.thread_demo.thread_method.thread_demo;

import javax.naming.SizeLimitExceededException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/*
    需求: 在主线程中创建一个新的线程(实现Runnable接口),新线程执行完毕后,主线程再执行
    在新线程中,打印当前时间"yyyy-MM-dd HH:mm:ss SSS"
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(1000);//使用Thread类的静态方法sleep()方法,使当前线程睡眠指定的毫秒数,单位是毫秒
//        System.out.println("睡眠结束");
        //new Thread(接收Runnable实现类对象).start();
        new Thread(()->{
            while (true){
                Date date = new Date();
                String t = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss SSS").format(date);
                System.out.println(t);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();//由于Runnable接口是一个函数式接口,所以可以使用lambda表达式的方式创建接口的实现类对象,就不需要使用匿名内部类的方式创建函数式对象了
    }
}
