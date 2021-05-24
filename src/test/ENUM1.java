package test;

import static test.Seasons.FALL;

/**
 * @author Anjude
 * @Date 2021/5/13 22:06
 */
public class ENUM1 {
    private static Seasons s = FALL;

    public static void main(String[] args) {
        System.out.println(s.getClass());
        System.out.println(s.name());
    }
}
