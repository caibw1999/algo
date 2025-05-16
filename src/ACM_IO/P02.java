/**
 * 题目描述
 * 计算a+b，但输入方式有所改变。
 * <p>
 * 输入描述
 * 第一行是一个整数N，表示后面会有N行a和b，通过空格隔开。
 * <p>
 * 输出描述
 * 对于输入的每对a和b，你需要在相应的行输出a、b的和。
 * 如第二对a和b，对应的和也输出在第二行。
 */
package ACM_IO;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
                sc.nextLine();
            }
        }

    }
}
