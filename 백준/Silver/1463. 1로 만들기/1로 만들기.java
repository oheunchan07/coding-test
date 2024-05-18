import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        min = n;

        dp(n,0);

        System.out.println(min);
    }

    static void dp(int n, int cnt) {
        if(min > cnt) {
            if (n == 1) {
                if (min > cnt)
                    min = cnt;
            } else if (n > 1) {
                if (n % 3 == 0) {
                    dp(n / 3, cnt + 1);
                }
                if (n % 2 == 0) {
                    dp(n / 2, cnt + 1);
                }
                dp(n - 1, cnt + 1);
            }
        }
    }
}