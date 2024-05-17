import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static char arr[][];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;
        cnt = n*m-1;
        System.out.println(cnt);
    }
}