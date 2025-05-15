/**
 * 力扣题目链接 : https://leetcode.cn/problems/squares-of-a-sorted-array/
 * <p>
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class SortedSquares {
    static String line;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((line = in.readLine()) != null) {
            nums = Arrays.stream(line.trim().split(",")).mapToInt(Integer::parseInt).toArray();
            out.println(sortedSquares());
        }
        out.flush();
        in.close();
        out.close();
    }

    private static String sortedSquares() {
        /*
        用双指针，左右索引位置平方值大的放在新数组中，相应的索引左移或右移
         */
        int left = 0, right = nums.length - 1, index = nums.length - 1;
        int[] new_nums = new int[nums.length];
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                new_nums[index--] = l;
                left++;
            } else {
                new_nums[index--] = r;
                right--;
            }
        }

        return Arrays.toString(new_nums);
    }
}
