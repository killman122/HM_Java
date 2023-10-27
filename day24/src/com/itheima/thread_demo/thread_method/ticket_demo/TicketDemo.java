package com.itheima.thread_demo.thread_method.ticket_demo;

/*
    锁住多条语句操作共享数据，可以使用同步代码块实现
格式：
synchronized(任意对象) {

    多条语句操作共享数据的代码

}
- 默认情况锁是打开的，只要有一个线程进去执行代码了，锁就会关闭-
- 当线程执行完出来了，锁才会自动打开
- __锁对象可以是任意对象 , 但是多个线程必须使用同一把锁__

同步的好处和弊端

- 好处：解决了多线程的数据安全问题
- 弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 */
//在没有加锁和设置的sleep睡眠时间不够的情况下,会出现线程的竞争问题,导致线程之间的数据不能同步,所以下面的代码需要进行加锁的操作
//使用多线程能够提高代码执行的效率,但是在多线程中,如果多个线程之间有共享数据,那么就会出现线程安全问题,所以在多线程中,需要使用同步代码块来解决线程安全问题
public class TicketDemo implements Runnable {
    private int ticketCount = 100;//一共有100张票在初始状态下
    private static Object obj = new Object();//创建一个锁对象,注意在使用锁的时候,必须要传入一个对象,作为锁对象,这个对象可以是任意对象,但是必须要保证多个线程使用的是同一把锁
    //将共享数据的代码放置在锁对象中,并且锁对象必须是同一个对象,这样才能够保证多个线程使用的是同一把锁,才能够保证数据的同步
    @Override
    public void run() {
        while (true) {//持续买票,直到票卖完了
            //注意synchronized的使用位置不同,可能会导致只有一个线程执行所有任务,所以要注意synchronized的使用位置
            synchronized (this) {//注意在synchronized锁对象中如果填写的是this,也可以使用同步代码块的方式解决线程安全问题,但是在使用同步代码块的时候,必须要保证多个线程使用的是同一把锁,才能够保证数据的同步
                if (ticketCount > 0) {//有票可以卖
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticketCount) + "张票");
                    ticketCount--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {//没票不可以卖
                    break;
                }
            }
            /*
                关于锁和线程同步的问题，这里不是歧义，而是需要更细致的理解。
多个线程必须使用同一把锁：这是指在处理共享数据时，要保证所有访问（读/写）这些共享数据的线程必须共用一把锁。这样，一次只能有一个线程可以执行这段同步代码，其余想要执行的线程会被阻塞等待，即达到了线程同步的目的。
将synchronized()参数改为this：其中的this指的是当前对象。因此，对于this的理解需要看它在哪个上下文中。this在一个对象的方法中始终指代调用这个方法的对象。所以，视情况而定，使用this作为锁对象可能会导致每个线程其实都在用不同的锁。
举一个实际例子，假设你设计了一个BankAccount类，里面有一个同步方法synchronized void withdraw(double amount)允许取款。在这种情况下，this指的是当前的BankAccount实例，因此this做为锁对象是合适的，因为你想保证对同一个账户的取款操作是串行的。
然而，在你的TicketDemo类的情况下，this指的是当前TicketDemo对象。如果每个线程都有不同的TicketDemo实例，那么每个线程其实都在用不同的锁（this不同），这样无法保证对共享数据（这里是票数）的同步操作。所以在这种情况下，this作为锁并不适用，你需要所有线程都用同一个对象作为锁，就像你的代码中的private static Object obj = new Object();。
总的来说，线程同步时使用的锁对象，需要视具体情况做出选择。关键在于它必须能确保在涉及同步的所有线程之间共享。对于涉及共享数据的代码段，如果使用不同的锁，那么就无法真正实现线程同步。
             */
        }
    }
}

class TicketTest1 {
    public static void main(String[] args) throws InterruptedException {
        TicketDemo ticket = new TicketDemo();//创建任务类对象,由于创建的对象实质上只有一个,尽管是在多个线程中使用,但是在这里只有一个对象,所以可以使用同步代码块的方式解决线程安全问题,并且在使用锁对象synchronized可以只传入一个参数this表示当前的锁对象,但是这个不建议使用,如果在创建多个对象时就不能使用this会导致无法实现线程的同步
        //创建三个窗口对象(线程)
        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

