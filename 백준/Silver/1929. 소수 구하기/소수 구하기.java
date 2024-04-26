import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n + 1];

        arr[0] = arr[1] = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(!arr[i]){
                for(int j = i*i; j<= n; j += i){
                    arr[j] = true;
                }
            }
        }

        for(int i = m;i<n+1;i++) {
            if(arr[i] == false)
                System.out.println(i);
        }
    }
}