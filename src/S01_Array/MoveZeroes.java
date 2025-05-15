/**
 * 移动0 https://leetcode.cn/problems/move-zeroes/description/
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
package S01_Array;

import java.io.*;
import java.util.Arrays;

public class MoveZeroes {
    static String str;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        while ((str = in.readLine()) != null) {
            nums = Arrays.stream(str.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            moveZeroes();
        }
    }

    private static void moveZeroes() {
        int fastIndex = 0;
        int slowIndex = 0;
        int temp;
        /*
        快慢索引一起向右滑动，当遇到零的时候满索引在原地等，快索引先行一步去找非0值和慢索引交换，交换后慢索引继续向前，快索引继续找非0值交换
        ---------------另一种解释---------------
        快慢索引一起向前，非零值时两者交换，为0时快索引向前找非0值再交换

         */
        while (fastIndex < nums.length) {
            if (nums[fastIndex] != 0) {
                temp = nums[slowIndex];
                nums[slowIndex] = nums[fastIndex];
                nums[fastIndex] = temp;
                slowIndex++;
            }
            fastIndex++;
        }
    }
}
