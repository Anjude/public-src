package com.company.base;

/**
 * Created by Anjude on 2021/3/28 20:39
 */

import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String args[]) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", dNow);
    }
}
