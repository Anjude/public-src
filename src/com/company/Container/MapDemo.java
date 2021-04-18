package com.company.Container;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Anjude
 * Date: 2021/4/18 15:28
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<>();
        Map<String, String> h = new HashMap<>();
        Map<String, String> t = new Hashtable<>();
        Map<String, String> c = new ConcurrentHashMap<>();
        Map<String, String> l = new LinkedHashMap<>();
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for (String value : Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}
