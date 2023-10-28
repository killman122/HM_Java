package com.itheima.threadpool_demo;

import java.util.concurrent.*;

/*
    public ThreadPoolExecutor(
	int corePoolSize, -- 核心线程数量
	int maximumPoolSize, -- 最大线程数量,最大线程数量必须大于或者等于核心线程数量
	long keepAliveTime, -- 临时线程存活时间
	TimeUnit unit, -- 临时线程存活时间单位-
	BlockingQueue<Runnable> workQueue, -- 阻塞队列,当任务数大于线程数时,无法将线程和任务一一对应,所以使用阻塞队列存储较多的任务(无法消化的任务),在调用实现类时,传入的参数是阻塞队列的容量
	ThreadFactory threadFactory, -- 创建线程的方式,通过工厂的方式创建线程
	RejectedExecutionHandler handler -- 拒绝策略,当任务量已经大于阻塞队列的任务时使用拒){}
 */
public class CustomThreadPool {
    public static void main(String[] args) {//创建自定义线程池对象
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                5,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(20),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()//这里的AbortPolicy()拒绝策略也可以换成别的函数,这里的意思是抛出异常
//                RejectedExecutionException
        );//设置

        //为线程池对象添加任务
        for (int i =0;i<=30;i++) {//当向线程池中添加的任务个数小于阻塞队列时,在执行时不会出现异常,当添加的任务个数大于阻塞队列,执行时出现异常
            threadPoolExecutor.submit(new Runnable() {//在使用submit向线程池中添加任务时,可以使用Runnable接口的实现类,也可以使用Callable接口的实现类,但是都需要重写run()方法或者是call()方法
                @Override
                public void run() {
                    System.out.println("多线程任务执行");
                }
            });
        }

        //关闭线程池,否则线程池会一直等待任务
        threadPoolExecutor.shutdown();

        //对于内部类和普通非内部类调用类
        //new A().new B();
        //new C.D();
    }
}

/*
    Java语言里，内部类可以分为四种：成员内部类、静态内部类、局部内部类和匿名内部类。这里您给出了两种内部类的示例，一种是成员内部类，一种是静态内部类：
成员内部类 类A的内部类B是一个成员内部类，它需要一个外部类对象才能实例化。这就是为什么创建B的对象需要先创建A的对象的原因。在实例化内部类B之前，必须先实例化外部类A。语法如下：
new A().new B();
以上语句表示，首先使用new A()创建了外部类A的一个对象，然后通过这个对象再创建了内部类B的一个对象。
静态内部类 类C的内部类D是一个静态内部类，静态内部类可以直接实例化，不需要外部类的对象，使用的语法与一般类的实例化方式相同：
new C.D();
这里，new C.D()创建了一个静态内部类D的对象。请注意，即使它是C的一部分，也不需要C的对象。
对于静态内部类，你可以把静态内部类当成外部类。静态内部类是独立的类，在内部类中可以定义静态的属性、方法或者静态初始化块，但是成员内部类中不能定义这些。
总的来说，通过new 外部类().new 内部类()方式创建的是成员内部类的对象，而new 外部类.静态内部类()创建的是静态内部类的对象。
 */
class A {
    class B {

    }
}

class C {
    static class D {

    }
}