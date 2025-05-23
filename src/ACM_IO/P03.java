/**
 * 题目描述
 * 你的任务依然是计算a+b。
 * <p>
 * 输入描述
 * 输入中每行是一对a和b。其中会有一对是0和0标志着输入结束，且这一对不要计算。
 * <p>
 * 输出描述
 * 对于输入的每对a和b，你需要在相应的行输出a、b的和。
 * 如第二对a和b，他们的和也输出在第二行。
 */

package ACM_IO;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);

        }
    }
}