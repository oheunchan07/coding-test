import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    static int cnt = 0;
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i < n;i++) {
            T = Integer.parseInt(br.readLine());
            dp(0);
            System.out.println(cnt);
            cnt = 0;
        }
    }

    static int dp(int a) {
        if(a == T) {
            cnt++;
            return 0;
        }
        else if (a>T)
            return 0;
        return dp(a+1) + dp(a+2) + dp(a+3);
    }
}