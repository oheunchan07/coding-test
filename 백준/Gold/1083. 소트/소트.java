import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<a;i++)
            arr.add(Integer.parseInt(st.nextToken()));
        int cnt = Integer.parseInt(br.readLine());

        int moveCnt = 0, change = 0;
        while (moveCnt < cnt && change < a - 1) {
            int maxNum = arr.get(change);
            int max = -1;
            int value = change + 1;
            int count = 1;
            while (moveCnt + count <= cnt && value < a) {
                int num = arr.get(value);
                if (num > maxNum) {
                    maxNum = num;
                    max = value;
                }
                count++;
                value++;
            }

            if (max != -1) {
                arr.remove(max);
                arr.add(change, maxNum);
                moveCnt += max - change;
            }
            change++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
        br.close();
    }
}