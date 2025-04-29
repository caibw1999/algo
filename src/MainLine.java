import java.io.*;
import java.util.Arrays;

/**
 * @Description:
 * @Author: BoWen
 * @Date: 2025/4/29 17:29
 */

public class MainLine {
    public static String line;
    public static String[] parts;
    public static int target;

    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader("src/input.txt"));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while ((line = in.readLine()) != null) {
            parts = line.split(" ");
            target = Integer.parseInt(in.readLine());
            out.println(Arrays.toString(parts));
            out.println(target);
        }
        out.flush();
        in.close();
        out.close();
    }
}
