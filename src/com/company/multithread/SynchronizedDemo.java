package com.company.multithread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Anjude
 * @date 2021/6/15 23:38
 */
public class SynchronizedDemo {
    private static final Object lock = new Object();

    public static void testWait() throws InterruptedException {
        synchronized (lock) {
            // 阻塞住，被唤醒之前不会输出aa，也就是还没离开synchronized
            lock.wait();
            System.out.println("aa");
        }
    }

    public static void testNotify() throws InterruptedException {
        synchronized (lock) {
            lock.notify();
            System.out.println("bb");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            try {
                SynchronizedDemo.testWait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                SynchronizedDemo.testNotify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
