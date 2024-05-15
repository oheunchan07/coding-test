import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    static int[] arr;
    static int[] arrN;
    static boolean[] visit;
    static int n;
    static int m;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        arrN = new int[n];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++)
            arrN[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrN);

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
            arr[d] = arrN[i];
            dfs(d+1);
        }
    }
}