package com.itheima.thread_demo.thread_method.ticket_demo;
//①定义一个类Ticket实现Runnable接口，里面定义一个成员变量：private int ticketCount = 100;
/*②在Ticket类中重写run()方法实现卖票，代码步骤如下

       	A：判断票数大于0，就卖票，并告知是哪个窗口卖的

       	B：票数要减1

       	C：卖光之后，线程停止
*/
public class Ticket implements Runnable {
    private int ticketCount = 100;//一共有100张票在初始状态下

    @Override
    public void run() {
        while(true){//持续买票,直到票卖完了
            if(ticketCount > 0){//有票可以卖
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(101-ticketCount)+"张票");
                ticketCount--;
                try {
                    Thread.sleep(200);//如果要使用sleep的方式解决不同步的问题,则需要将时间加的比较大,大到能够在指定的时间中完成任务
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{//没票不可以卖
                break;
            }
        }
    }
}

class TicketTest {
    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket();//创建任务类对象
        //创建三个窗口对象(线程)
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3 = new Thread(ticket,"窗口3");
        thread1.start();
        //thread1.join();//如果不添加join的方式执行多个线程,一定时线程不安全的,并且在使用join方法后,相当于一个线程在运行,与剩下的两个线程无关,所以在这里需要加锁
        thread2.start();
        thread3.start();
    }
}