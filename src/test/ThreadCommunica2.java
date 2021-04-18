package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anjude
 * Date: 2021/4/7 23:28
 */
public class ThreadCommunica2 {
    public static void main(String[] args) throws IOException {
        System.out.println("子进程被调用成功!");

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String strLine = bfr.readLine();
            if (strLine != null) {
                System.out.println("hi:" + strLine);
            }
        }

        //读取父进程输入流
//        bfr = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            String strLine = bfr.readLine();
//            if (strLine != null) {
//                System.out.println(strLine);//这个地方的输出在子进程控制台是无法输出的，只可以在父进程获取子进程的输出
//            } else {
//                return;
//            }
//        }
    }

}
