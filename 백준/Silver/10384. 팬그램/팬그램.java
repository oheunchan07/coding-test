import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            int[] arr = new int[26];
            String s = br.readLine();

            for(int j = 0;j<s.length();j++) {
                int temp = s.charAt(j);
                if((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 123)) {
                    if (temp < 97)
                        temp -= 65;
                    else
                        temp -= 97;
                    arr[temp]++;
                }
            }

            Arrays.sort(arr);

            System.out.print("Case " + (i+1) + ": ");
            switch (arr[0]) {
                case 0:
                    System.out.println("Not a pangram");
                    break;
                case 1:
                    System.out.println("Pangram!");
                    break;
                case 2:
                    System.out.println("Double pangram!!");
                    break;
                case 3:
                    System.out.println("Triple pangram!!!");
                    break;
            }
        }
    }
}