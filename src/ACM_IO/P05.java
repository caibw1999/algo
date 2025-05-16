/**
 * 题目描述
 * 你的任务是计算两个整数的和。
 * <p>
 * 输入描述
 * 输入包含若干行，每行输入两个整数a和b，由空格分隔。
 * <p>
 * 输出描述
 * 对于每组输入，输出a和b的和，每行输出后接一个空行。
 */
package ACM_IO;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            System.out.println(sc.nextInt()+sc.nextInt());
            System.out.println();;
        }
    }
}
