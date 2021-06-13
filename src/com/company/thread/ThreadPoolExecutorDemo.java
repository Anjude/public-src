package com.company.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Anjude
 * Date: 2021/4/28 20:38
 */
public class ThreadPoolExecutorDemo {
    ThreadPoolExecutor pool = new ThreadPoolExecutor(
            30, 800,
            100000, TimeUnit.SECONDS,
            new ArrayBlockingQueue(10)
    );

}
