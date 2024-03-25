import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[10];
        if(n!=0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                arr[a] = true;
            }
        }
        
        int result =Math.abs(target - 100);
        for(int i = 0;i<999999;i++) {
            String s = String.valueOf(i);
            boolean broke = false;

            for(int j = 0;j<s.length();j++) {
                if(arr[s.charAt(j) - '0'] == true) {
                    broke = true;
                    break;
                }
            }

            if(broke == false) {
                int min = Math.abs(target - i) + s.length();
                if(min < result)
                    result = min;
            }
        }

        System.out.println(result);
    }
}