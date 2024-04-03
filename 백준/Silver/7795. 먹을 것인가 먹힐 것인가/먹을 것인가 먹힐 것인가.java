import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] N = new int[n];
        for(int i = 0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            Integer[] a = new Integer[A];
            Integer[] b = new Integer[B];
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<A;j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<B;j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a,Collections.reverseOrder());
            Arrays.sort(b);
            for(int j = 0;j<A;j++) {
                for(int k = 0;k<B;k++) {
                    if(a[j] > b[B - 1]) {
                        cnt += B;
                        break;
                    }
                    else if(a[j] > b[k])
                        cnt++;
                    else
                        break;
                }
                if(a[j]<=b[0])
                    break;
            }
            N[i] = cnt;
        }

        for(int i = 0;i<n;i++)
            System.out.println(N[i]);
    }
}