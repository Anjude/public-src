package com.company.base;

import java.util.*;

/**
 * Created by Anjude on 2021/3/28 20:45
 */
public class SleepDemo {
    public static void main(String args[]) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
