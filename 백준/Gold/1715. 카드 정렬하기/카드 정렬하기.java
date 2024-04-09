import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();

        for (int i=0; i<n; i++) {
            pQ.add(Integer.parseInt(br.readLine()));
        }

        int num = 0;
        while (pQ.size() > 1) {
            int sum  = pQ.poll() + pQ.poll();
            num += sum;
            pQ.add(sum);
        }

        System.out.println(num);
    }
}