/**
 * 209.长度最小的子数组 https://leetcode.cn/problems/minimum-size-subarray-sum/
 * <p>
 * 给定一个含有 n 个正整数的数组和一个正整数 s,
 * 找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。
 * 如果不存在符合条件的子数组，返回 0。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class MinSubArrayLen {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((line = in.readLine()) != null) {
            int[] nums = Arrays.stream(line.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int s = Integer.parseInt(in.readLine());

            out.println(minSubArrayLen(nums, s));
        }
        out.flush();
        in.close();
        out.close();
    }

    private static int minSubArrayLen(int[] nums, int s) {
        /*
        滑动窗口法
        窗口就是 满足其和 ≥ s 的长度最小的 连续 子数组。
        窗口的起始位置：如果当前窗口的值大于等于s了，窗口就要向前移动了（也就是该缩小了）。
        窗口的结束位置：窗口的结束位置就是遍历数组的指针，也就是for循环里的索引。
         */
        int left = 0, sum = 0, result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        }
        return result;
    }
}
