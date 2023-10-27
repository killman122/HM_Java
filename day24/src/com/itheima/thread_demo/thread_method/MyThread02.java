package com.itheima.thread_demo.thread_method;

/*
    **实现步骤**如下：

1. 定义任务类实现Runnable，并重写run方法(也可以使用匿名内部类实现)

2. 创建任务对象

3. 使用含有Runnable参数的构造方法，创建线程对象并指定任务。

4. 调用线程的start方法，开启线程。

#### 需求:
*   我们需要启动一个Java程序，其实默认就存在一个主线程（main方法所在线程）
*   接下来，我们在主线程启动一个线程，打印1到100的数字，主线程启动完线程后又打印1到100的数字。此时主线程和启动的线程在并发执行，观察控制台打印的结果。
 */
public class MyThread02 {
    public static void main(String[] args) {
        //创建一个任务对象
        MyRunnable myRunnable = new MyRunnable();
        //创建一个线程对象
        Thread thread = new Thread(myRunnable);
        //开启线程,又有在此处线程和任务对象没有关系,即使在此处启动了线程对之后的任务对象也不会有影响,所以需要将线程的任务放入到线程对象中
        thread.start();
        //使用main主线程打印
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);//返回此线程的名字
        }

        //接收一个Runnable接口的实现类对象,使用匿名内部类的方式创建执行的任务对象
        Thread thread1 = new Thread(new Runnable(){//使用一个匿名内部实现类当作参数传入到Thread类的构造方法中
            @Override
            public void run() {
                System.out.println("使用匿名内部类实现Runnable接口的线程2的任务");
                System.out.println(Thread.currentThread().getName());
            }
        }, "线程2");//使用匿名内部类的方式创建线程对象并可以为线程对象取名字
        thread1.start();

        //使用lambda表达式的方式完成Runnable接口的实现类对象的创建,因为Thread构造方法中的第一个参数Runnable接口中只有一个抽象方法,所以可以使用lambda表达式的方式创建,应为使用了@FunctionInterface注解完成了函数式接口的创建
        new Thread(()->{
            System.out.println("线程3的任务");
        }, "线程3").start();
    }
}

//1. 定义任务类实现Runnable，并重写run方法(也可以使用匿名内部类实现)
class MyRunnable implements Runnable {//也可以使用匿名内部类实现方法的重写,就不需要创建一个新的类了

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);//返回此线程的名字
        }
    }
}