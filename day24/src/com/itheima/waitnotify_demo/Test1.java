package com.itheima.waitnotify_demo;

/*
    Object类 :wait()
    void wait() : 让当前线程处于等待状态,直到被唤醒或者被中断
    注意:
        1.调用wait方法的对象必须是同步锁
        2.调用wait方法后,当前线程会释放锁
        3.wait方法是Object类中的方法,所以任何对象都可以调用
        4.wait方法必须在同步代码块或者同步方法中使用
        5.wait方法必须使用try...catch包裹
        6.wait方法必须使用在多线程中
    进入无限等待需要使用锁在同步代码中,所以wait方法必须在同步代码块或者同步方法中使用
 */
public class Test1 {
    public static void main(String[] args) {
        Object lock = new Object();//创建一个锁对象,锁对象可以是任意对象,锁对象必须要传入要执行的同步代码中,注意同步关键字synchronized()中要加入参数lock锁,之后才能调用wait()方法并且需要捕获异常
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("线程开始执行");
                    try {
                        System.out.println("线程进入无限等待,直到被通知唤醒");
                        //wait();//由于没有使用锁对象调用,所以出现异常IllegalMonitorStateException非法监视器状态异常
                        lock.wait();//调用wait方法的对象必须是同步锁,所以这里使用锁对象调用wait方法
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("线程被唤醒,继续执行");
                }
            }
        }).start();
    }
}
