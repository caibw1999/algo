/**
 * 二分查找 https://leetcode.cn/problems/binary-search/description/
 * <p>
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target,
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class part01 {

    static String lines;
    static int[] nums = new int[10000];
    static int target;


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((lines = in.readLine()) != null) {
            nums = Arrays.stream(lines.trim().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            target = Integer.parseInt(in.readLine());

            out.println(binarySearch());
        }
        out.flush();
        in.close();
        out.close();
    }

    private static int binarySearch() {
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return -1;
    }
}
