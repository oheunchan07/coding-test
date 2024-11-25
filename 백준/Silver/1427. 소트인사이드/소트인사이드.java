import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        Integer[] n = new Integer[a.length()];

        for(int i = 0;i<a.length();i++) {
            n[i] = (a.charAt(i))- 48 ;
        }

        Arrays.sort(n, Collections.reverseOrder());

        for(int i = 0;i<a.length();i++) {
            System.out.print(n[i]);
        }
    }
}