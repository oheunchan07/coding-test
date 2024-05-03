import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1;i<n+1;i++) {
            queue.add(i);
        }

        int cnt = 0;
        System.out.print("<");
        while(queue.size() != 1) {
            cnt++;
            if(cnt % k != 0) {
                queue.add(queue.poll());
            }
            else {
                System.out.print(queue.poll() + ", ");
            }
        }
        System.out.print(queue.poll() + ">");
    }
}