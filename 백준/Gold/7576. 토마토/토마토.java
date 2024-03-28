import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.add(new int[]{i, j});
                }

            }
        }

        while(!queue.isEmpty()) {
            int[] tomato = queue.poll();
            int x = tomato[0];
            int y = tomato[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = arr[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0)
                    bool = true;
            }
        }

        int cnt = 0;
        if (bool) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (cnt < arr[i][j]) {
                        cnt = arr[i][j];
                    }
                }
            }
            System.out.println(cnt - 1);
        }

    }
}