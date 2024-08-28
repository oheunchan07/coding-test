import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for(int i = 0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<3;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2]-o1[2];
            }
        });

        int[] country = new int[1000];
        int temp = 0;
        for(int i = 0;i<3 + temp;i++) {
            country[i] = arr[i][0];
            if(i < 2)
                System.out.println(arr[i][0] + " " + arr[i][1]);
            else {
                if(country[0] == country[1] && country[0] == country[i])
                    temp++;
                else
                    System.out.println(arr[i][0] + " " + arr[i][1]);
            }
        }
    }
}