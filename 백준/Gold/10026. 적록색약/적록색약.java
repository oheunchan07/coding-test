import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    static int n;
    static int cnt = 0;
    static int cnt1 = 0;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static char[][] arr;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        visit = new boolean[n][n];
        for(int i = 0;i<n;i++) {
            String s = br.readLine();
            for(int j = 0;j<n;j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(visit[i][j] == false) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                visit[i][j] = false;

                if(arr[i][j] == 'G')
                    arr[i][j] = 'R';
            }
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(visit[i][j] == false) {
                    dfs(i, j);
                    cnt1++;
                }
            }
        }

        System.out.println(cnt + " " + cnt1);
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for(int i = 0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(!(nx < 0 || ny < 0 || nx >= n || ny >= n)) {
                if(arr[x][y] == arr[nx][ny] && !visit[nx][ny])
                    dfs(nx,ny);
            }
        }

    }
}
