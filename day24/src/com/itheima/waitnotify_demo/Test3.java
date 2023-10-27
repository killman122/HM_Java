package com.itheima.waitnotify_demo;
/*
    线程进入计时等待并唤醒
        注意:
            1 进入计时等待的线程,时间结束前可以被其他线程唤醒,时间结束后会自动唤醒
            2 sleep方法只有时间到了才能够自动苏醒,不能强制苏醒
        wait(1000)能在1s中内被唤醒,也可以等待1s后自动唤醒
        sleep(1000)不能在1s中内被唤醒,只能等待1s后自动唤醒
 */
public class Test3 {
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
                        lock.wait(1000);//调用wait方法的对象必须是同步锁,所以这里使用锁对象调用wait方法
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("线程被唤醒,继续执行");
                }
            }
        }).start();
    }
}