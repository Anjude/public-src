package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anjude
 * Date: 2021/4/2 0:25
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String as = in.readLine();
        Animal a = new Cat(18, "male");
        Cat c = new Cat(18, "female");
        System.out.println(a.hello() + a.test());
        System.out.println(c.hello() + c.miao() + c.test());
    }
}
