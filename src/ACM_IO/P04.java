/**
 * 题目描述
 * 你的任务是计算若干整数的和。
 * <p>
 * 输入描述
 * 每行的第一个数N，表示本行后面有N个数。
 * <p>
 * 如果N=0时，表示输入结束，且这一行不要计算。
 * <p>
 * 输出描述
 * 对于每一行数据需要在相应的行输出和。
 */
package ACM_IO;

import java.util.Arrays;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[] nums = Arrays.stream(sc.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int res = 0;
            for (int num : nums) {
                res += num;
            }
            System.out.println(res);
        }
    }
}
