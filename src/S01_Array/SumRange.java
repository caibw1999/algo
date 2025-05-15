/**
 * 区间和 https://kamacoder.com/problempage.php?pid=1070
 * <p>
 * 题目描述
 * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
 * <p>
 * 输入描述
 * 第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间，直至文件结束。
 */
package S01_Array;

import java.io.*;

public class SumRange {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(in.readLine());
        }
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        String line;
        int l, r;
        while ((line = in.readLine()) != null) {
            l = Integer.parseInt(line.split(" ")[0]);
            r = Integer.parseInt(line.split(" ")[1]);
            // 前r个和 减 前l个和 加上l索引位置值
            out.println(sum[r] - sum[l] + nums[l]);
        }

        out.flush();
        in.close();
        out.close();
    }
}
