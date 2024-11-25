import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[8][2];
        int[] arr1 = new int[5];

        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 8; i++) {
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int max = 0;

        for (int i = 0; i < 5; i++) {
            max += arr[i][0];
        }
        System.out.println(max);
        for (int i = 0; i < 5; i++) {
            arr1[i] = arr[i][1];
        }
        Arrays.sort(arr1);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]+ " ");
        }
    }

}