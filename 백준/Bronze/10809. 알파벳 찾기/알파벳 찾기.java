import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0;i<arr.length;i++)
            arr[i] = -1;

        String a = br.readLine();
        for(int i = 0;i<a.length();i++) {
            if(arr[a.charAt(i) - 'a'] == -1)
                arr[a.charAt(i) - 'a'] = i;
        }
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}