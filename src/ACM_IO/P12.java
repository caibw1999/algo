/**
 * 题目描述
 * 先要求你从键盘输入一个整数n（1<=n<=9），打印出指定的数字图形。
 * <p>
 * 输入描述
 * 输入包含多组测试数据。每组输入一个整数n（1<=n<=9）。
 * <p>
 * 输出描述
 * 对于每组输入，输出指定的数字图形。
 * 注意：每行最后一个数字后没有任何字符。
 * <p>
 * 输入示例
 * 3
 * <p>
 * 输出示例(0为空格)
 * 001
 * 0121
 * 12321
 * 00121
 * 001
 */

package ACM_IO;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("5 6");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[2 * n - 1];
            StringBuilder str = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                //空格
                for (int j = 0; j < n - i; j++) {
                    str.append(" ");
                }

                // 数字
                for (int j = 1; j <= i; j++) {
                    str.append(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    str.append(j);
                }

                str.append("\n");

            }

            for (int i = n - 1; i >= 1; i--) {
                //空格
                for (int j = 0; j < n - i; j++) {
                    str.append(" ");
                }

                // 数字
                for (int j = 1; j <= i; j++) {
                    str.append(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    str.append(j);
                }

                str.append("\n");

            }

            System.out.println(str);

        }
    }
}
