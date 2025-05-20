/**
 * 输入描述
 * 每行包含一个字符和一个整数n(0< n <41)，
 * 不同的字符表示不同的花纹，
 * 整数n表示等腰三角形的高。
 * 显然其底边长为2n-1。
 * 如果遇到@字符，则表示所做出来的样板三角形已经够了。
 * <p>
 * 输出描述
 * 每个样板三角形之间应空上一行，三角形的中间为空。行末没有多余的空格。每条结果后需要再多输出一个空行。
 * <p>
 * 输入示例
 * A 4
 * <p>
 * 输出示例(0为空格)
 * 000A
 * 00A A
 * 0A   A
 * AAAAAAA
 * <p>
 */
package ACM_IO;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next();
            if ("@".equals(s)) {
                break;
            }
            int n = sc.nextInt();

            // 前 n-1 行
            for (int i = 0; i < n - 1; i++) {
                // 打印左边空格
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // 打印左边字符
                System.out.print(s);

                // 打印中间空格或右边字符
                if (i > 0) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        System.out.print(" ");
                    }
                    // 右边字符
                    System.out.print(s);
                }
                System.out.println();
            }

            // 底部行
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print(s);
            }
            System.out.println();
            System.out.println();
        }
    }
}
