import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        int[][] arr = new int[K][N+1];

        for (int i = 0; i < K; i++)
            arr[i][0] = 1;

        for (int i = 0; i < N+1; i++)
            arr[0][i] = 1;

        for (int i = 1; i < K; i++) {
            for (int j = 1; j < N+1; j++) {
                arr[i][j] += (arr[i][j - 1] + arr[i - 1][j]) % 1000000000;
            }
        }

        System.out.println(arr[K-1][N]);
    }
}