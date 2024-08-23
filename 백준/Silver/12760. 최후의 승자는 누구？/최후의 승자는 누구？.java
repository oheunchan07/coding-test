import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] card = new int[n][m];
        int[] score = new int[n];

        for(int i = 0;i<n;i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0;j<m;j++) {
                card[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(card[i]);
        }

        for(int i = 0;i<m;i++) {
            int max = 0;
            for(int j = 0;j<n;j++) {
                if(card[j][i] > max) {
                    max = card[j][i];
                }
            }
            for(int j = 0;j<n;j++) {
                if(max == card[j][i])
                    score[j]++;
            }
        }

        int max = 0;
        for(int i = 0;i<n;i++) {
            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int i = 0;i<n;i++) {
            if(score[i] == max) {
                System.out.print(i+1 + " ");
            }
        }
    }
}