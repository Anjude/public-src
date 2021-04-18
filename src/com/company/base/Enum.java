package com.company.base;

/**
 * Created by Anjude on 2021/3/29 12:45
 */
public class Enum {
    enum Color {
        RED, GREEN, BLUE;
    }

    // 执行输出结果
    public static void main(String[] args) {
        int i = 1; // 基本数据类型类型变量
        System.out.println("基本数据类型类型变量" + getType(i)); //打印变量类型为int

        Color c1 = Color.RED;   // 包装类型变量
        System.out.println("包装类型变量" + c1 + c1.getClass().getName());
    }

    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); // 使用int类型的getClass()方法
    }
}
