/*
 给定t组测试数据。
 每组数据有两个整数a和b,请你求出a+b的值。
 */
package ACM_IO;

import java.io.*;

public class Part04 {
    static int t, a, b;
    static String line;
    static String[] parts;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(in.readLine().split(" ")[0]);
        int flag = 0;
        while (flag < t) {
            line = in.readLine();
            parts = line.split(" ");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[0]);
            out.println(a + b);
            flag += 1;
        }
        out.flush();
        in.close();
        out.close();

    }
}
