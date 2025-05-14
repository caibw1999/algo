/**
 * 删除有序数组的重复项 https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * <p>
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，
 * 使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * <p>
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class removeDuplicates {
    static String str;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((str = in.readLine()) != null) {
            nums = Arrays.stream(str.trim().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            out.println(removeDuplicates());

        }
        out.flush();
        in.close();
        out.close();
    }

    private static int removeDuplicates() {
        /*
        快索引比较当前位置和后一位的值，相等则快索引加1继续比较，不相等就将快索引位置的值赋值给慢索引， 并且快慢索引都加1

        int fastIndex = 0, slowIndex = 0;
        while (fastIndex < nums.length - 1) {
            if (nums[fastIndex] != nums[fastIndex + 1]) {
                nums[slowIndex++] = nums[fastIndex];
            }
            fastIndex++;
        }
        return slowIndex + 1;

        这个方法有问题，因为没将最后一次的快索引位置的值赋值给慢索引位置，返回的数组不正确
         */
        /*
        改进方法，用待指向的位置做索引, 这样会将最后的一次快索引位置的值赋值给慢索引位置
         */
        int fastIndex = 1, slowIndex = 1;
        while (fastIndex < nums.length) {
            if (nums[fastIndex] == nums[fastIndex - 1]) {
                nums[slowIndex++] = nums[fastIndex];
            }
            fastIndex++;
        }
        return slowIndex;
    }
}
