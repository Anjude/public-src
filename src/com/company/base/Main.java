package com.company.base;

class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}

public class Main {
    public static void main(String[] args) {
        int i = 1; //int类型变量
        System.out.println(getType(i)); //打印变量类型为int
    }

    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}