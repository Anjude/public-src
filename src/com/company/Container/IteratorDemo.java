package com.company.Container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/18 14:13
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        // 1、获取list的迭代器对象
        Iterator<String> it = list.iterator();
        //调用迭代器的hasNext方法，判断是否有下一个元素
        while (it.hasNext()) {
            //将迭代器的下标移动一位，并得到当前位置的元素值
            System.out.println(it.next());
        }
        // 2、foreach遍历、底层仍旧是iterator
        list.forEach(item -> System.out.println(item));
        list.forEach(item -> {
            if ("b".equals(item)) {
                System.out.println(item);
            }
        });
    }
}
