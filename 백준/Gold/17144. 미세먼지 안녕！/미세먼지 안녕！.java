import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;

        int[][] arr = new int[r][c];
        Queue<int[]> queue = new LinkedList<>();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int top = -1;
        int bottom = -1;

        for(int i = 0;i<r;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<c;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == -1) {
                    if (top == -1) {
                        top = i;
                    } else {
                        bottom = i;
                    }
                }
            }
        }

        while (t != cnt) {
            for(int i = 0;i<r;i++) {
                for(int j = 0;j<c;j++) {
                    if (arr[i][j] >= 5) {
                        queue.add(new int[]{i, j});
                    }
                }
            }

            cnt++;
            int s = queue.size();
            int[][] temp = new int[r][c];
            for(int i = 0;i<s;i++) {
                int[] v = queue.poll();
                int x = v[0];
                int y = v[1];
                int vCount = 0;
                int min = 0;

                for(int j = 0;j<4;j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (!(nx < 0 || nx >= r || ny < 0 || ny >= c)) {
                        if(arr[nx][ny] != -1) {
                            min = arr[x][y] / 5;
                            temp[nx][ny] += min;
                            vCount++;
                        }
                    }
                }

                temp[x][y] -= (min * vCount);
            }

            for(int i = 0;i<r;i++) {
                for(int j = 0;j<c;j++) {
                    arr[i][j] += temp[i][j];
                }
            }

            for (int i = top - 1; i > 0; i--) {
                arr[i][0] = arr[i - 1][0];
            }
            for (int j = 0; j < c - 1; j++) {
                arr[0][j] = arr[0][j + 1];
            }
            for (int i = 0; i < top; i++) {
                arr[i][c - 1] = arr[i + 1][c - 1];
            }
            for (int j = c - 1; j > 1; j--) {
                arr[top][j] = arr[top][j - 1];
            }
            arr[top][1] = 0;

            for (int i = bottom + 1; i < r - 1; i++) {
                arr[i][0] = arr[i + 1][0];
            }
            for (int j = 0; j < c - 1; j++) {
                arr[r - 1][j] = arr[r - 1][j + 1];
            }
            for (int i = r - 1; i > bottom; i--) {
                arr[i][c - 1] = arr[i - 1][c - 1];
            }
            for (int j = c - 1; j > 1; j--) {
                arr[bottom][j] = arr[bottom][j - 1];
            }
            arr[bottom][1] = 0;
        }

        int sum = 0;
        for(int i = 0;i<r;i++) {
            for(int j = 0;j<c;j++) {
                if(arr[i][j] != -1)
                    sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}