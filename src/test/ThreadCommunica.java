package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anjude
 * Date: 2021/4/7 23:25
 */
public class ThreadCommunica {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("java com.test.process.T3");

        ProcessBuilder pb = new ProcessBuilder("java", "com.test.process.T3");
        Process p = pb.start();

        BufferedInputStream in = new BufferedInputStream(p.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
