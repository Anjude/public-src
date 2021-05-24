package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/2 0:25
 */
public class Main {
    static public void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            list.add(i);
        }
        list.removeIf(filter -> filter % 2 == 0); /* 删除list中的所有偶数 */
        System.out.println(list); /* [1, 3, 5, 7, 9] */

    }
}
