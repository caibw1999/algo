/**
 * 描述
 * 对于明明生成的n个1到500之间的随机整数,你需要帮助他完成以下任务:
 * 删去重复的数字,即相同的数字只保留一个,把其余相同的数去掉;
 * 然后再把这些数从小到大排序,按照排好的顺序输出。
 * 你只需要输出最终的排序结果。
 * <p>
 * 输入描述:
 * 第一行输入一个整数 n(1 <=n <= 1000),代表明明生成的数字个数。
 * 此后 n 行,第 i 行输入一个整数ai(1 <= ai <= 500),代表明明生成的随机整数。
 * <p>
 * 输出描述:
 * 输出若干行,每行输出一个整数,代表输入数据排序后的结果。第一行输出最小的数字。
 */
package niuke;

import java.io.*;

public class H003 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        byte[] nums = new byte[501];

        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(in.readLine());
            nums[line] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                out.println(i);
            }
        }

        out.flush();
        in.close();
        out.close();

    }
}
