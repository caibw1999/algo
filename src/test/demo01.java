package test;

public class demo01 {
    public static void main(String[] args) {
        int n = 10;
        String s = nestedForLoop(n);
        System.out.println("s = " + s);
    }

    public static String nestedForLoop(int n) {
        StringBuilder res = new StringBuilder();
        // 循环 i = 1, 2, ..., n-1, n
        for (int i = 1; i <= n; i++) {
            // 循环 j = 1, 2, ..., n-1, n
            for (int j = 1; j <= i; j++) {
                res.append("(" + i + ", " + j + "), ");
            }
        }
        return res.toString();
    }
}

