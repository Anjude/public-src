package com.company.thread;

/**
 * Created by Anjude
 * Date: 2021/4/27 20:21
 */
public class SynchronizedDemo {

    synchronized void methodA() {
        System.out.println("Synchronized on method!" + Thread.currentThread().getName());
    }

    synchronized static void methodB() {
        System.out.println("Synchronized on static method!" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                methodB();
            }).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                new SynchronizedDemo().methodA();
            }).start();
        }

        synchronized (SynchronizedDemo.class) {
            System.out.println("Synchronized on class!" + Thread.currentThread().getName());
        }
    }
}
