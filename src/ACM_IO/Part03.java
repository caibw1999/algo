/*
给定若干组测试数据，读取至文件末尾为止。
每组数据有两个整数 a 和 b，请你求出 a + b 的值。
 */

package ACM_IO;

import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Part03 {
    static String line;
    static int a, b;
    static String[] parts;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((line = in.readLine()) != null) {
            parts = line.split(" ");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            out.println(a + b);
        }
        out.flush();
        in.close();
        out.close();
    }
}