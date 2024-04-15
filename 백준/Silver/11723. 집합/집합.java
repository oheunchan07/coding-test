import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<N;i++) {
            String M = br.readLine();
            String[] split = M.split(" ");

            switch (split[0]) {
                case "add":
                    if(!q.contains(Integer.parseInt(split[1])))
                        q.offer(Integer.parseInt(split[1]));
                    break;
                case "remove":
                    if(q.contains(Integer.parseInt(split[1])))
                    q.remove(Integer.parseInt(split[1]));
                    break;
                case "check":
                    if(q.contains(Integer.parseInt(split[1])))
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "toggle":
                    if(!q.contains(Integer.parseInt(split[1])))
                        q.offer(Integer.parseInt(split[1]));
                    else
                        q.remove(Integer.parseInt(split[1]));
                    break;
                case "all":
                    q.clear();
                    for(int j = 1;j<=20;j++)
                        q.offer(j);
                    break;
                case "empty":
                    q.clear();
                    break;
            }
        }
        bw.flush();
    }
}