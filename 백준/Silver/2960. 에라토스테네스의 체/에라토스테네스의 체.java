import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken())+1;
        int num = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[max];

        int cnt = 1;
        int count = 0;
        for(int i = 2;i<max;i++) {
            if(arr[i] != true) {
                for(int j = i;j<max;j = i * cnt) {
                    if(arr[j] != true) {
                        arr[j] = true;
                        count++;
                    }
                    cnt++;
                    if(count == num){
                        System.out.println(j);
                        return;
                    }
                }
                cnt = 1;
            }
        }

    }
}