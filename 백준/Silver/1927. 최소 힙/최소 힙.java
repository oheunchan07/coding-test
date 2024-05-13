import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(pQ.size() == 0)
                    System.out.println(0);
                else
                    System.out.println(pQ.poll());
            } else {
                pQ.add(x);
            }
        }
    }
}