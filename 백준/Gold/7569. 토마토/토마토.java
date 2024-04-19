import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] dx = {-1, 1, 0, 0, 0 ,0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dh = {0, 0, -0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        int[][][] arr = new int[n][m][h];

        for(int k = 0;k<h;k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        queue.add(new int[]{i, j, k});
                    }
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] tomato = queue.poll();
            int x = tomato[0];
            int y = tomato[1];
            int z = tomato[2];

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nh = z + dh[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || nh < 0 || nh >= h) continue;
                if (arr[nx][ny][nh] == 0) {
                    arr[nx][ny][nh] = arr[x][y][z] + 1;
                    queue.add(new int[]{nx, ny, nh});
                }
            }
        }
        boolean bool = false;
        for(int k = 0;k<h;k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j][k] == 0)
                        bool = true;
                }
            }
        }
        int cnt = 0;
        if (bool) {
            System.out.println("-1");
        } else {
            for(int k = 0;k<h;k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (cnt < arr[i][j][k]) {
                            cnt = arr[i][j][k];
                        }
                    }
                }
            }
            System.out.println(cnt - 1);
        }

    }
}