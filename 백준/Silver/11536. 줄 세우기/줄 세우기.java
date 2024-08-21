import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] s = new String[n];
        String[] temp = new String[n];

        for(int i = 0;i<n;i++) {
            s[i] = br.readLine();
            temp[i] = s[i];
        }

        Arrays.sort(s);

        if(Arrays.equals(s,temp)) {
            System.out.println("INCREASING");
            return;
        }

        Arrays.sort(s, Collections.reverseOrder());

        if(Arrays.equals(s,temp)) {
            System.out.println("DECREASING");
            return;
        }
        System.out.println("NEITHER");

    }
}