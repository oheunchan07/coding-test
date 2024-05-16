import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] arr;
    static int min = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i = 0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(min);
    }

    static void dfs(int wall) {
        if(wall == 3) {
            bfs();
            return;
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    dfs(wall+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 2) {
                    q.add(new int[]{i,j});
                }
            }
        }

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = arr[i].clone();
        }


        while(!q.isEmpty()) {
            int[] a = q.poll();
            int x = a[0];
            int y = a[1];

            for(int k=0; k<4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (!(nx < 0 || nx >= n || ny < 0 || ny >= m)) {
                    if(map[nx][ny] == 0) {
                        q.add(new int[]{nx,ny});
                        map[nx][ny] = 2;
                    }
                }
            }
        }

        int cnt = 0;

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                if(map[i][j] == 0)
                    cnt++;
            }
        }

        if(min<cnt)
            min = cnt;
    }
}