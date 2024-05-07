import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        int[] arr = new int[26];

        for(int i = 0;i<a.length();i++) {
            int b;
            if(a.charAt(i) < 97)
                b = a.charAt(i)-'A';
            else
                b = a.charAt(i)-'a';
            arr[b]++;
        }
        int max = 0;
        int maxNum = 0;
        for(int i = 0;i<26;i++) {
            if(max<arr[i]) {
                max = arr[i];
                maxNum = i;
            }
        }
        for(int i = 0;i<26;i++) {
            if(arr[maxNum] == arr[i] && maxNum != i) {
                System.out.println("?");
                return;
            }
        }

        System.out.println((char)(maxNum+65));
    }
}