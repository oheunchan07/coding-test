import java.util.*;
import java.io.*;

public class Main {
    static int cnt = 0;
    static int[][] arr;
    static int r;
    static int c;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        Z((int)Math.pow(2,n),0,0);
        System.out.println(cnt);
    }

    static void Z(int s, int x, int y) {
        if(s == 1)
            return;

        int ns = s/2;
        if(r < x + ns && c < y + ns) {
            Z(ns,x,y);
        }
        if(r < x + ns && c >= y + ns) {
            cnt += s * s /4;
            Z(ns,x,y + ns);
        }
        if(r >= x + ns && c < y + ns) {
            cnt += s * s /4 * 2;
            Z(ns,x + ns,y);
        }
        if(r >= x + ns && c >= y + ns) {
            cnt += s * s /4 * 3;
            Z(ns,x+ns,y+ns);
        }
    }
}