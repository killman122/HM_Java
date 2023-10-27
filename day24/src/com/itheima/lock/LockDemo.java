package com.itheima.lock;

import java.util.concurrent.locks.ReentrantLock;

/*
    Lock锁机制中的方法和python中进行线程同步的方法一致,都是使用了锁对象,但是在java中使用的是ReentrantLock类的对象,在python中使用的是Lock类的对象
    在使用ReentrantLock中的加锁和解锁的方法lock/unlock使用后导致,无法自行结束进程,需要进行处理,释放锁资源,否则会一直占用锁资源,导致其他线程无法使用锁资源
    所以将释放锁写在必须执行的代码块中finally中
 */
public class LockDemo implements Runnable {
    private int ticketCount = 100;//一共有100张票在初始状态下
    //使用static静态关键字后,无论创建多少个对象,在使用的时候都能够保证使用的是同一把锁,这样就能够保证线程之间的数据同步,因为静态实例对象只能通过类名.属性的方式调用
    private static ReentrantLock lock = new ReentrantLock();//创建一个锁对象,注意在使用锁的时候,必须要传入一个对象,作为锁对象,这个对象可以是任意对象,但是必须要保证多个线程使用的是同一把锁

    //使用构造器创建一个ReentrantLock类的对象
    @Override
    public void run() {
        while (true) {//持续买票,直到票卖完了
            try {
                lock.lock();//获得锁对象
                if (ticketCount > 0) {//有票可以卖
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticketCount) + "张票");
                    ticketCount--;
//                    Thread.sleep(200);//如果要使用sleep的方式解决不同步的问题,则需要将时间加的比较大,大到能够在指定的时间中完成任务
                } else {//没票不可以卖
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();//释放锁对象
            }
        }
    }
}

class TicketTest {
    public static void main(String[] args) throws InterruptedException {
        LockDemo lockDemo = new LockDemo();//创建任务类对象
        //创建三个窗口对象(线程)
        Thread thread1 = new Thread(lockDemo, "窗口1");
        Thread thread2 = new Thread(lockDemo, "窗口2");
        Thread thread3 = new Thread(lockDemo, "窗口3");
        thread1.start();
        //thread1.join();//如果不添加join的方式执行多个线程,一定时线程不安全的,并且在使用join方法后,相当于一个线程在运行,与剩下的两个线程无关,所以在这里需要加锁
        thread2.start();
        thread3.start();
    }
}
