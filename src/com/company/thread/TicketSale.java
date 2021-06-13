package com.company.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Anjude
 * @date 2021/6/8 22:21
 */
public class TicketSale {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();
        new Thread(() -> {
            for (int i = 1; i < 30; i++) {
                ticket.sale();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 1; i < 30; i++) {
                ticket.sale();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 1; i < 30; i++) {
                ticket.sale();
            }
        }, "C").start();
    }

}

class Ticket1 {
    private int number = 30;

    public synchronized void sale() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出了" + (number-- - 1) + "票，剩余：" + number);
        }
    }
}


class Ticket2 {
    private int number = 30;
    // 加锁
    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        try {
            // 业务代码
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + (number-- - 1) + "票，剩余：" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            lock.unlock();
        }
    }
}
