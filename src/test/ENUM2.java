package test;

import static test.Seasons.*;

/**
 * @author Anjude
 * @Date 2021/5/13 22:07
 */
public class ENUM2 {
    static Seasons s = FALL;

    public static void main(String[] args) {
        System.out.println(s.getClass());
        System.out.println(s.name());
    }
}
