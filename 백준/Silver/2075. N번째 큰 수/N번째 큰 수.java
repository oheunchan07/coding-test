import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a*a];
        int cnt = 0;

        for(int i = 0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<a;j++) {
                arr[cnt++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[a*a-a]);
    }
}