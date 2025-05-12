/**
 * 移除元素 https://leetcode.cn/problems/remove-element/
 * <p>
 * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 示例 2: 给定 nums = [0,1,2,2,3,0,4,2], val = 2, 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class part02 {
    static String str;
    static int val;
    static int[] nums = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        while ((str = in.readLine()) != null) {
            nums = Arrays.stream(str.trim().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            val = Integer.parseInt(in.readLine());

//            out.println(removeElement1());
            out.println(removeElement2());
        }
        out.flush();
        in.close();
        out.close();
    }

    private static int removeElement1() {
        /*
        快慢指针法

        慢指针是数组长度， 用快指针去判断是否保留当前的元素， 等于目标值的话就跳过赋值，否则将快指针的元素赋值给慢指针
         */
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            // 快指针元素不是目标值
            if (nums[fastIndex] != val) {
                // 赋值给慢指针 慢指针加1
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return slowIndex;
    }

    private static int removeElement2() {
        /*
        相向指针法

        左指针向右滑动，判断左指针值是否等于移除元素。
        等于就将右指针元素赋值给左指针元素， 同时右指针向左滑动，当左指针大于右指针时停止
        不等于的话就左指针右滑，右指针不动
         */
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[r--];
            } else {
                l++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return l;
    }
}
