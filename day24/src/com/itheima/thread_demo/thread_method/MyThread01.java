package com.itheima.thread_demo.thread_method;

/*
    基本步骤：
    1.创建一个类继承Thread类。
    2.在类中重写run方法（线程执行的任务放在这里
    执行程序，观察控制台的打印数据的现象

    需求:
    我们启动一个Java程序，其实默认就存在一个主线程（main方法所在线程）
    接下来，我们在主线程启动一个线程，打印1到100的数字，主线程启动完线程后又打印1到100的数字。此时主线程和启动的线程在并发执行，观察控制台打印的结果。


 */
public class MyThread01 {
    public static void main(String[] args) {
        //3.创建线程对象，调用线程的start方法开启线程。
        MyThread myThread = new MyThread();//创建一个线程对象
        myThread.setName("新线程");
        myThread.run();//第一种方法直接在主线程中调用run方法,如果不调用下面的start方法,默认情况下使用的是main主线程
        myThread.start();//第二种方法在主线程中开启额外的线程,调用子线程执行重写的父类run方法,在没有执行到start方法时是不会开启新的线程的,所以相当于单线程执行,只有执行到start方法时才会开启新的线程
        //单个线程执行完run()方法后继续执行下面的start方法
        for (int i = 0; i <= 100; i++) {
            System.out.println("主线程中打印的数据是:" + i + "使用的线程是" + Thread.currentThread().getName());
        }
    }
}

//1.创建一个类继承Thread类。
class MyThread extends Thread {
    //2.在类中重写run方法（线程执行的任务放在这里 )
    @Override
    public void run() {
        //将要执行的任务写在run方法中,由于不需要调用父类方法中的run()方法,所以直接将父类方法中的super.run()直接删除
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程中打印的数据是:" + i + "使用的线程是" + getName());
        }//使用getName()方法获取当前线程的名字
        System.out.println("当前使用的线程是" + Thread.currentThread().getName());//由于静态方法的原因所以在调用的时候必须要使用父类类名进行调用

    }
}
