/**
 * 题目描述
 * 小明发现和小宇有共同祖先！现在小明想知道小宇是他的长辈，晚辈，还是兄弟。
 * <p>
 * 输入描述
 * 输入包含多组测试数据。每组首先输入一个整数N（N<=10），接下来N行，每行输入两个整数a和b，表示a的父亲是b（1<=a,b<=30）。小明的编号为1，小宇的编号为2。
 * 输入数据保证每个人只有一个父亲。
 * <p>
 * 输出描述
 * 对于每组输入，如果小宇是小明的晚辈，则输出“You are my younger”，如果小宇是小明的长辈，则输出“You are my elder”，如果是同辈则输出“You are my brother”。
 */

package ACM_IO;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[31];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                nums[a] = b;
            }
            int ming = getAncestor(1, nums);
            int yu = getAncestor(2, nums);
            if (ming == yu) {
                System.out.println("You are my brother");
            } else if (ming < yu) {
                System.out.println("You are my younger");
            } else {
                System.out.println("You are my elder");
            }


        }
    }

    private static int getAncestor(int i, int[] nums) {
        int count = 0;
        while (nums[i] != 0) {
            i = nums[i];
            count++;
        }
        return count;
    }
}
