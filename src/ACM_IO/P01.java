/**
 * 你的任务是计算a+b。
 * <p>
 * 输入描述
 * 输入包含一系列的a和b对，通过空格隔开。一对a和b占一行。
 * <p>
 * 输出描述
 * 对于输入的每对a和b，你需要依次输出a、b的和。
 * 如对于输入中的第二对a和b，在输出中它们的和应该也在第二行。
 */
package ACM_IO;

import java.util.Scanner;

public class P01 {
    //    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//
//        String line;
//        while ((line = in.readLine()) != null) {
//            int a = Integer.parseInt(line.split(" ")[0]);
//            int b = Integer.parseInt(line.split(" ")[1]);
//
//            out.println(a + b);
//        }
//        out.flush();
//        in.close();
//        out.close();
//    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
