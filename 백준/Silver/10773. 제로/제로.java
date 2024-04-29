import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> queue = new Stack<>();

        for(int i = 0;i<k;i++) {
            int n = Integer.parseInt(br.readLine());
            if(n != 0)
                queue.push(n);
            else
                queue.pop();
        }

        int sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.pop();
        }
        System.out.println(sum);
    }
}