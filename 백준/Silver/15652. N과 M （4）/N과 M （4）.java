import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    static int[] arr;
    static int n;
    static int m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(0);
        bw.flush();

    }

    static void dfs(int d) throws IOException {
        if(d == m) {
            for(int i = 0;i<m;i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 0;i<n;i++) {
            if(d > 0){
                if(i + 1<arr[d-1]) {
                    continue;
                }
            }
            arr[d] = i+1;
            dfs(d+1);
        }
    }
}