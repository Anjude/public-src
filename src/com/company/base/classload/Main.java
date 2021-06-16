package com.company.base.classload;

import java.io.IOException;

/**
 * Created by Anjude
 * Date: 2021/4/2 0:25
 */
public class Main {
    static public void main(String[] args) throws IOException {
        Animal a = new Cat(1);
        a = new Cat(1);
    }
}
