import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a;
        int[][] arr = new int[2][a];
        int count = 0;
        boolean empty = true;
        boolean min = false;

        for(int i = 0;i<a;i++)
            arr[0][i] = i+1;
        for(int i = 0;i<a;i++) {
            int value = Integer.parseInt(br.readLine());
            arr[1][i] = value;
        }

        while(empty) {
            for(int i = 0;i<a;i++) {
                for(int j = 0;j<a;j++) {
                    if(arr[0][i] == arr[1][j])
                        min = true;
                }
                if(min == false) {
                    arr[0][i] = 0;
                    arr[1][i] = 0;
                    b--;
                    count++;
                }
                min = false;
            }
            if(count == 0) {
                empty = false;
            }
            count = 0;
            for(int i = 0;i<a;i++) {
                if(arr[0][i] == 0)
                    count++;
            }
            if(count == a)
                empty = false;
            count = 0;
        }
        count = 0;
        int[] answer = new int[b];
        for(int i = 0;i<a;i++) {
            if(arr[0][i] != 0) {
                answer[count] = arr[0][i];
                count++;
            }
        }

        Arrays.sort(answer);
        System.out.println(count);
        for(int j = 0;j<count;j++) {
            System.out.println(answer[j]);
        }
    }
}