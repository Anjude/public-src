package com.company.multithread;

/**
 * @author Anjude
 * @date 2021/6/13 22:55
 */
public class SaleTicketDemo01 {
    public static void main(String[] args) {
        // 多个售票员售票
        Ticket ticket = new Ticket();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "C").start();
    }
}

// 资源类
class Ticket {
    // 拥有30张票
    private int num = 30;

    // 使用synchronized同步执行卖票操作
    public synchronized void sale() {
        if (num > 0) {
            // 卖票
            System.out.println(Thread.currentThread().getName() + ": " + --num);
        }
    }
}
