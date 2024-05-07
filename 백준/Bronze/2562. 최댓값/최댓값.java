import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for(int i = 0;i<9;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxNum = 0;
        for(int i = 0;i<9;i++) {
            if(max<arr[i]) {
                max = arr[i];
                maxNum = i;
            }
        }
        System.out.println(max);
        System.out.print(maxNum + 1);
    }
}