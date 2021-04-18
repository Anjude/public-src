package com.company.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Class;

/**
 * Created by Anjude
 * Date: 2021/4/11 18:51
 */
public class Reflex {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception {
        //正常的调用
        Reflex a = new Reflex();
        a.setPrice(5);
        System.out.println("Apple Price:" + a.getPrice());
        //使用反射调用
        Class reflex = Class.forName("com.company.base.Reflex");
        Method setPriceMethod = reflex.getMethod("setPrice", int.class);
        Constructor reflexConstructor = reflex.getConstructor();
        Object reflexObj = reflexConstructor.newInstance();
        setPriceMethod.invoke(reflexObj, 14);
        Method getPriceMethod = reflex.getMethod("getPrice");
        System.out.println("Apple Price:" + getPriceMethod.invoke(reflexObj));
    }
}
