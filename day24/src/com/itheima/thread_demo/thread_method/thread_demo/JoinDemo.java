package com.itheima.thread_demo.thread_method.thread_demo;
/*
    Thread类
        public void join(): 具备阻塞的作用,等待这个线程死亡,才会执行其他的线程
 */
public class JoinDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {//如果在创建线程对象时,使用匿名内部类的方式,并且在run方法中重写的是使用该线程需要执行的任务
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        }, "新线程");
        thread.start();
        try {
            thread.join();//在使用join()方法后就能够解决多线程中多个资源之间竞争的问题,但是这样做也就失去了多线程的意义
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

        //由于在主线程中开始了两个任务,一个是在使用了匿名内部类的新的线程中,一个是在main的主线程中,所以在执行时,会出现两个任务交替执行的情况,但是如果不想发生两个进程之间相互竞争改变全局变量的条件下,可以使用join

    }
}
