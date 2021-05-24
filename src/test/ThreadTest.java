package test;

/**
 * 未完成的多线程同步买票实例
 *
 * @author Anjude
 * @date 2021/5/22 1:04
 */
public class ThreadTest implements Runnable {
    /**
     * 定义票数
     */
    private static volatile int ticket = 10;

    @Override
    public synchronized void run() {
        int times = 10;
        for (int i = 0; i < times; i++) {
            if (ticket < 1) {
                System.out.println("票数不足");
                return;
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + ticket);
        }
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        new Thread(test, "thread-1: ").start();
        new Thread(test, "thread-2: ").start();
        new Thread(test, "thread-3: ").start();
    }
}
