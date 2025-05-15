/**
 * 比较含退格的字符串 https://leetcode.cn/problems/backspace-string-compare/
 * <p>
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 */
package S01_Array;

import java.io.*;

public class BackspaceCompare {
    static String line, s, t;
    static char[] chars;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        while ((line = in.readLine()) != null) {
            s = line.split(" ")[0];
            t = line.split(" ")[1];

            out.println(backspaceCompare());
        }
        out.flush();
        in.close();
        out.close();
    }

    private static boolean backspaceCompare() {
        /*
        用快慢索引处理字符串，遇到 #， 快索引前进1，慢索引后退1，再将快索引值赋值给慢索引, 将数组转成字符串并且截取到慢索引
         */
        s = helper(s.toCharArray());
        t = helper(t.toCharArray());
        return s.equals(t);
    }

    private static String helper(char[] chars) {
        int f = 0, s = 0;
        while (f < chars.length) {
            if (chars[f] != '#') {
                chars[s++] = chars[f++];
            } else {
                f++;
                if (s > 0) {
                    s--;
                }
            }
        }
        return new String(chars).substring(0, s);
    }

}
