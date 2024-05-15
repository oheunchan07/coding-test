import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    static char[][] arr;
    static int cnt;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        arr = new char[n][m];

        for (int i = 0;i<n;i++) {
            String s = br.readLine();
            for (int j = 0 ;j<m;j++) {
                arr[i][j] = s.charAt(j);
                if(s.charAt(j) == 'I') {
                    x = i;
                    y = j;
                }
            }
        }

        dfs(x,y);
        if(cnt>0)
            System.out.println(cnt);
        else
            System.out.println("TT");
    }

    static void dfs(int x, int y) {
        if(arr[x][y] == 'P'){
            cnt++;
        }
        arr[x][y] = 'X';

        for(int i = 0;i<4;i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (!(nx < 0 || nx >= n || ny < 0 || ny >= m)) {
                if(arr[nx][ny] != 'X') {
                    dfs(nx, ny);
                }
            }
        }
    }
}