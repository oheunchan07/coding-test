import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int temp = 0;
        System.out.print(arr[0] + " ");
        for(int i = 1;i<n;i++) {
            if(arr[i] != arr[temp]) {
                temp = i;
                System.out.print(arr[i] + " ");
            }
        }
    }
}