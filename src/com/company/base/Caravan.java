package com.company.base;

/**
 * Created by Anjude on 2021/3/28 19:52
 */
// 抽象类
abstract class Caravan {
    private double price;
    private String model;
    private String year;

    public abstract void goFast(); //抽象方法

    public abstract void changeColor();
}

abstract class SuperClass{
    abstract void m(); //抽象方法
}

class SubClass extends SuperClass{
    //实现抽象方法
    void m(){
    }
}