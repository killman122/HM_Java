package com.itheima.waitnotify_demo2;

/*
    厨师:
    生产者步骤：
1，判断桌子上是否有汉堡包
    如果有就等待，如果没有才生产。
2，把汉堡包放在桌子上。
3，叫醒等待的消费者开吃。

 */
public class Cook implements Runnable {
    @Override
    public void run() {
        while (true) {//一直生产汉堡,直到汉堡数量为10
            if (Desk.count == 0) {//当这里为0表示生产了10个汉堡
                synchronized (Desk.LOCK) {
                    Desk.LOCK.notifyAll();
                }
            }else {
                //生产的数量不够10个
                //判断桌子上是否有汉堡
                if (Desk.flag){
                    //桌子上有汉堡
                    try {
                        Desk.LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {//桌子上没有汉堡
                    //生产汉堡
                    Desk.count--;//需要生产的汉堡的数量减少一个
                    System.out.println(Thread.currentThread().getName()+"生产了一个汉堡包,桌子上现在有"+Desk.count+"个汉堡包");
                    //生产完毕之后,叫醒等待的消费者
                    Desk.flag = true;//桌子上汉堡的状态为有食物
                    synchronized (Desk.LOCK) {//锁对象是桌子
                        Desk.LOCK.notifyAll();//唤醒消费者
                    }
                }
            }
        }
    }
}
