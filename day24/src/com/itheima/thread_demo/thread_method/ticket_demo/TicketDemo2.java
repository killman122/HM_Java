package com.itheima.thread_demo.thread_method.ticket_demo;

public class TicketDemo2 implements Runnable {
    private static int ticketCount = 100;//一共有100张票在初始状态下

    @Override
    public void run() {
        while(true){//持续买票,直到票卖完了
            if (method1()) break;
        }
    }

    //非静态的同步方法能够实现的线程之间的共享数据的同步,但是如果使用静态的同步方法,则会导致所有的线程都使用同一把锁,这样就会导致线程之间的数据不能同步,所以在使用同步方法的时候,需要注意使用的是静态的同步方法还是非静态的同步方法
    private synchronized boolean method() {
        if(ticketCount > 0){//有票可以卖
            System.out.println(Thread.currentThread().getName()+"正在出售第"+(101-ticketCount)+"张票");
            ticketCount--;
            try {
                Thread.sleep(200);//如果要使用sleep的方式解决不同步的问题,则需要将时间加的比较大,大到能够在指定的时间中完成任务
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{//没票不可以卖
            return true;
        }
        return false;
    }

    //对于静态方法中的锁对象synchronized就是当前类的字节码文件对象,所以在使用静态方法的时候,需要注意使用的是静态的同步方法还是非静态的同步方法,但是静态方法必须使用静态变量,静态方法不能调用非静态成员
    //同一个类的字节码对象唯一,无论创建多少个对象都可以使用静态同步方法解决线程安全问题
    private synchronized static boolean method1() {
        if(ticketCount > 0){//有票可以卖
            System.out.println(Thread.currentThread().getName()+"正在出售第"+(101-ticketCount)+"张票");
            ticketCount--;
            try {
                Thread.sleep(200);//如果要使用sleep的方式解决不同步的问题,则需要将时间加的比较大,大到能够在指定的时间中完成任务
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{//没票不可以卖
            return true;
        }
        return false;
    }
}

class TicketTest3 {
    public static void main(String[] args) throws InterruptedException {
        TicketDemo2 ticket = new TicketDemo2();//创建任务类对象
        TicketDemo2 ticket1 = new TicketDemo2();//创建任务类对象
        TicketDemo2 ticket2 = new TicketDemo2();//创建任务类对象
        //对于创建多个任务类对象的情况可以使用静态的同步方法,但是静态方法必须使用静态变量,静态方法不能调用非静态成员
        //创建三个窗口对象(线程)
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket1,"窗口2");
        Thread thread3 = new Thread(ticket2,"窗口3");
        thread1.start();
        //thread1.join();//如果不添加join的方式执行多个线程,一定时线程不安全的,并且在使用join方法后,相当于一个线程在运行,与剩下的两个线程无关,所以在这里需要加锁
        thread2.start();
        thread3.start();
    }
}