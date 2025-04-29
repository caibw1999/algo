import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class MainToken {
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //读单个字符串
        StreamTokenizer in = new StreamTokenizer(br);

        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) in.nval;
            in.nextToken();
            m = (int) in.nval;
            out.println(m + n);
        }
        out.flush();
        out.close();
    }
}