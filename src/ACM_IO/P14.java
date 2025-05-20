/**
 * 题目描述
 * 输出一个词组中每个单词的首字母的大写组合。
 * <p>
 * 输入描述
 * 输入的第一行是一个整数n，表示一共有n组测试数据。（输入只有一个n，没有多组n的输入）
 * 接下来有n行，每组测试数据占一行，每行有一个词组，每个词组由一个或多个单词组成；
 * 每组的单词个数不超过10个，每个单词有一个或多个大写或小写字母组成；
 * 单词长度不超过10，由一个或多个空格分隔这些单词。
 * <p>
 * 输出描述
 * 请为每组测试数据输出规定的缩写，每组输出占一行。
 * <p>
 * 输入示例
 * 1
 * ad dfa     fgs
 * <p>
 * 输出示例
 * ADF
 * <p>
 * 提示信息
 * 注意：单词之间可能有多个空格
 */
package ACM_IO;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().toUpperCase();
            String[] strs = line.trim().split("\\s+");

            for (String str : strs) {
                sb.append(str.charAt(0));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
