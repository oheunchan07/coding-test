import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<Long> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine()) - 1;
        queue.add(0l);
        queue.add(1l);

        if (n == -1) {
            System.out.println(0);
            return;
        }
        dp(n);
        System.out.println(queue.poll());
    }
    static void dp(long n) {
        queue.add(queue.poll() + queue.peek());
        if(n != 0)
            dp(n-1);
    }
}