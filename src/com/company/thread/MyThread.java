package com.company.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Anjude
 * @date 2021/5/22 0:37
 */
public class MyThread extends Thread {

    /**
     * 创建一个同步锁（重入锁）
     */
    static Lock lock = new ReentrantLock();

    /**
     * 创建一个全局变量
     */
    static int vae = 1;

    @Override
    public void run() {
        //获取线程名字
        String name = Thread.currentThread().getName();

        //当全局变量小于10时，进入该循环
        int end = 10;
        while (vae < end) {
            //给线程加锁，即一次只能一个线程控制里面的代码
            lock.lock();
            try {
                if (vae < 10 && vae > 0) {
                    try {
                        //打印控制里面代码的线程名字
                        System.out.print(name + ":\t");
                        //打印下一行时睡眠0.2秒
                        Thread.sleep(200);
                        //v的值不能大于全局变量vae值
                        for (int v = 1; v <= vae; v++) {
                            System.out.print(v + "*" + vae + "=" + (vae * v) + "\t");
                            //打印每一列时睡眠0.2秒
                            Thread.sleep(200);
                        }
                        //全局变量自增
                        vae++;
                        //每一行打印完就换行
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                //释放锁
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        //线程多少都可以，按要求的来就行
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "线程一");
        Thread t2 = new Thread(mt, "线程二");
        Thread t3 = new Thread(mt, "线程三");
        Thread t4 = new Thread(mt, "线程四");
        Thread t5 = new Thread(mt, "线程五");
        Thread t6 = new Thread(mt, "线程六");
        Thread t7 = new Thread(mt, "线程七");
        Thread t8 = new Thread(mt, "线程八");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

}
