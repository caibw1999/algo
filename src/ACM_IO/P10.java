/**
 * 题目描述
 * 小明每天的话费是1元，运营商做活动，手机每充值K元就可以获赠1元话费，一开始小明充值M元，问最多可以用多少天？
 * 注意赠送的话费也可以参与到奖励规则中
 * <p>
 * 输入描述
 * 输入包括多个测试实例。每个测试实例包括2个整数M，K（2<=k<=M<=1000)。M=0，K=0代表输入结束。
 * <p>
 * 输出描述
 * 对于每个测试实例输出一个整数，表示M元可以用的天数。
 */
package ACM_IO;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (m == 0 && k == 0) {
                break;
            }
            // 能花的天数就是充值进去的钱
            int day = m;
            while (m >= k) {
                int keep = (m / k);//赠送的钱
                day += keep;
                m = keep + m % k; //赠送的钱加上剩余的钱 -> 待充值的钱
            }
            System.out.println(day);
        }
    }
}
