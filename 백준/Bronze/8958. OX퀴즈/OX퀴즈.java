import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            int cnt = 1;
            int score = 0;
            String a = br.readLine();
            for(int j = 0;j<a.length();j++) {
                if(a.charAt(j) == 'O') {
                    score += cnt;
                    cnt++;
                }
                else
                    cnt = 1;
            }
            System.out.println(score);
        }
    }
}