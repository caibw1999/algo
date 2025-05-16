/**
 * 题目描述
 * 有一天, 小明收到一张奇怪的信, 信上要小明计算出给定数各个位上数字为偶数的和。
 * 例如：5548，结果为12，等于 4 + 8 。
 * 小明很苦恼，想请你帮忙解决这个问题。
 * <p>
 * 输入描述
 * 输入数据有多组。每组占一行，只有一个整整数，保证数字在32位整型范围内。
 * <p>
 * 输出描述
 * 对于每组输入数据，输出一行，每组数据下方有一个空行。
 */
package ACM_IO;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int res = 0;
            while (n > 0) {
                int temp = n % 10;
                if (temp % 2 == 0) {
                    res += temp;
                }
                n /= 10;
            }
            System.out.println(res + "\n");
        }
    }
}
