import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] coin = new int[n];

        for(int i = 0;i<n;i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i = n - 1;i>=0;i--) {
            while (coin[i] <= total) {
                total -= coin[i];
                count++;
            }
        }

        System.out.println(count);
    }
}