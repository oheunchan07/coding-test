import java.util.*;
import java.io.*;

public class Main {

    static int x;
    static int y;
    static int map[][];
    static boolean f[][];

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int count = 0;
            map = new int[x][y];
            f = new boolean[x][y];

            for(int j = 0;j<k;j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                map[X][Y] = 1;
            }

            for(int j = 0;j<x;j++) {
                for(int a = 0;a<y;a++) {
                    if(map[j][a] == 1 && f[j][a] == false) {
                        dfs(j,a);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }

   static void dfs(int X, int Y) {
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        f[X][Y] = true;
        for(int i = 0;i<4;i++) {
            int dxx = X+dx[i];
            int dyy = Y+dy[i];
            if(dxx>=0 && dyy>=0&&dxx<x&&dyy<y) {
                if(map[dxx][dyy] == 1&&f[dxx][dyy] == false)
                    dfs(dxx,dyy);
            }
        }
   }
}