/**
 * 题目描述
 * 你的任务是计算若干整数的和。
 * <p>
 * 输入描述
 * 输入的第一行为一个整数N，接下来N行每行先输入一个整数M，然后在同一行内输入M个整数。
 * <p>
 * 输出描述
 * 对于每组输入，输出M个数的和，每组输出之间输出一个空行。
 */
package ACM_IO;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            while (n > 0) {
                int m = sc.nextInt();
                int res = 0;
                while (m-- > 0) {
                    res += sc.nextInt();
                }
                System.out.println(res);
                // 最后一组不用加空行
                if (n-- > 1) {
                    System.out.println();
                }
            }
        }
    }
}
