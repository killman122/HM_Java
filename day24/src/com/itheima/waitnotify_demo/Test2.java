package com.itheima.waitnotify_demo;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();//创建一个锁对象,锁对象可以是任意对象,锁对象必须要传入要执行的同步代码中,注意同步关键字synchronized()中要加入参数lock锁,之后才能调用wait()方法并且需要捕获异常
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName()+"线程开始执行");
                    try {
                        System.out.println(Thread.currentThread().getName()+"线程进入无限等待,直到被通知唤醒");
                        //wait();//由于没有使用锁对象调用,所以出现异常IllegalMonitorStateException非法监视器状态异常
                        lock.wait();//调用wait方法的对象必须是同步锁,所以这里使用锁对象调用wait方法,并且使用wait释放锁
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"线程被唤醒,执行完成");
                }//释放锁
            }
        },"A").start();
        Thread.sleep(3000);//等待3秒,否则B线程执行但是A线程没有执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName()+"线程开始执行");
                    System.out.println(Thread.currentThread().getName()+"线程唤醒A线程");
                    //wait();//由于没有使用锁对象调用,所以出现异常IllegalMonitorStateException非法监视器状态异常
                    lock.notify();//不释放锁,调用唤醒方法,通知正在等待的线程,唤醒线程的顺序是随机的,所以在这里唤醒的是A线程,并且注意在使用唤醒notify()的时候不需要添加try...catch捕获异常
                    System.out.println(Thread.currentThread().getName()+"线程执行完毕");
                }//释放锁
            }
        },"B").start();
    }
}
