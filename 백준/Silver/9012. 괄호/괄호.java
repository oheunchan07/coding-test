import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            String s = br.readLine();
            char[] str = s.toCharArray();
            int cnt = 0;

            for(int j = 0;j<str.length;j++) {
                if(str[j] == '(')
                    cnt++;
                else if (str[j] == ')')
                    cnt--;
                if(cnt == -1){
                    break;
                }
            }

            if(cnt != 0){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }
}