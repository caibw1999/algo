/**
 * 题目描述
 * 每门课的成绩分为A、B、C、D、F五个等级，为了计算平均绩点，规定A、B、C、D、F分别代表4分、3分、2分、1分、0分。
 * <p>
 * 输入描述
 * 有多组测试样例。每组输入数据占一行，由一个或多个大写字母组成，字母之间由空格分隔。
 * <p>
 * 输出描述
 * 每组输出结果占一行。如果输入的大写字母都在集合｛A,B,C,D,F｝中，则输出对应的平均绩点，结果保留两位小数。
 * 否则，输出“Unknown”。
 */
package ACM_IO;

import java.util.HashMap;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);
        map.put("F", 0);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            // 分割字符串
            String[] line = sc.nextLine().trim().split(" ");

            double score = 0.0;
            boolean invalid = false;

            for (String s : line) {
                if (!map.containsKey(s)) {
                    invalid = true;
                    break;
                }
                score += map.get(s);
            }

            if (invalid) {
                System.out.println("Unknown");
            } else {
                System.out.printf("%.2f%n", score / line.length);
            }
        }
    }
}
