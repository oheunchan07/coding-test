import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n>=0) {
            if(n%5 == 0) {
                System.out.println(n/5 +cnt);
                return;
            }
            n -= 3;
            cnt++;
        }
        System.out.println("-1");
    }
}