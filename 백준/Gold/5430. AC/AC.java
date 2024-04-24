import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String s = br.readLine();
            char[] cmd = s.toCharArray();

            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            boolean b = false;
            boolean error = false;
            Deque<Integer> dq = new ArrayDeque<>();

            for(int j = 0; j < n; j++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            for(int j = 0; j < cmd.length; j++) {
                if(cmd[j] == 'R') {
                    b = !b;
                }
                else if(cmd[j] == 'D') {
                    if(b == true) {
                        if(dq.pollLast() == null){
                            bw.write("error\n");
                            error = true;
                            break;
                        }
                    }
                    else {
                        if(dq.pollFirst() == null){
                            bw.write("error\n");
                            error = true;
                            break;
                        }
                    }
                }
            }

            if(error == true) {
                continue;
            }

            if(n == 0){
                bw.write("[]\n");
                continue;
            }

            bw.write("[");
            while (!dq.isEmpty()){
                if(b == true)
                    bw.write(dq.pollLast().toString());
                else
                    bw.write(dq.pollFirst().toString());
                if(dq.size() != 0)
                    bw.write(",");
            }
            bw.write("]\n");
            b = false;
            error = false;
        }
        bw.flush();
    }
}
