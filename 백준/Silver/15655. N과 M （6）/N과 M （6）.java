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
                if(d > 0){
                    if(arrN[i]<arr[d-1]) {
                        continue;
                    }
                }
                visit[i] = true;
                arr[d] = arrN[i];
                dfs(d+1);
                visit[i] = false;
            }
        }
    }
}