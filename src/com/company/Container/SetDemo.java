package com.company.Container;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/18 16:59
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        Set<String> l = new LinkedHashSet<>();
        Set<String> t = new TreeSet<>();
        for(Iterator iter = t.iterator(); iter.hasNext(); ) {
            iter.next();
        }

    }
}
