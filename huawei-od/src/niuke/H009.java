/**
 * 描述
 * 对于给定的正整数 n，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。具体地，如果遇到相同数字，保留在最右侧出现的第一个数字。
 * 输入描述：
 * 在一行上输入一个整数 n ( 1 <= n <= 10^8 )代表给定的整数。保证 n 的最后一位不为 0 。
 * 输出描述：
 * 在一行上输出一个整数，代表处理后的数字。
 */
package niuke;

import java.io.*;
import java.util.HashSet;

public class H009 {
    static String line;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            HashSet<Integer> hs = new HashSet<>();
            while (n > 1) {
                int i = n % 10;
                if (hs.add(i)) {
                    out.print(i);
                }
                n /= 10;
            }
            out.println();
        }
        out.flush();
        in.close();
        out.close();
    }
}
