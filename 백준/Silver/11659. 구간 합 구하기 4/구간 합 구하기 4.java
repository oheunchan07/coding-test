import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int  m = Integer.parseInt(st.nextToken());
        int[] cumsum = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1;i<n+1;i++) {
            cumsum[i] = cumsum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            bw.write((cumsum[end] - cumsum[start - 1])+"\n");
        }

        bw.flush();
    }
}