package com.company.base;

/**
 * Created by Anjude on 2021/3/22 14:23
 */
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}