import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    static int[] arr;
    static boolean[] visit;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n];
        dfs(0);

    }

    static void dfs(int d) {
        if(d == m) {
            for(int i = 0;i<m;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0;i<n;i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[d] = i+1;
                dfs(d+1);
                visit[i] = false;
            }
        }
    }
}