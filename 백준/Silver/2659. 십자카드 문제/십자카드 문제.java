import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[4];
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());
        a[2] = Integer.parseInt(st.nextToken());
        a[3] = Integer.parseInt(st.nextToken());

        int[] n = new int[4];
        n[0] = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
        n[1] = a[1] * 1000 + a[2] * 100 + a[3] * 10 + a[0];
        n[2] = a[2] * 1000 + a[3] * 100 + a[0] * 10 + a[1];
        n[3] = a[3] * 1000 + a[0] * 100 + a[1] * 10 + a[2];

        Arrays.sort(n);

        int cnt = 0;
        for(int i = n[0];i >= 1111; i--) {
            String s = Integer.toString(i);
            boolean b = false;
            for(int j = 0;j<4;j++) {
                if(s.charAt(j) == 0) {
                    b = true;
                    break;
                }
                a[j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if(b)
                continue;

            n[0] = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
            n[1] = a[1] * 1000 + a[2] * 100 + a[3] * 10 + a[0];
            n[2] = a[2] * 1000 + a[3] * 100 + a[0] * 10 + a[1];
            n[3] = a[3] * 1000 + a[0] * 100 + a[1] * 10 + a[2];

            Arrays.sort(n);
            if(n[0] == i)
                cnt++;
        }

        System.out.println(cnt);
    }
}