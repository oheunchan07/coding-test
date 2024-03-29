import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());


        for(int i = 0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        boolean f;
        if(arr[x][y] == 0) {
            arr[x][y] = 2;
            cnt++;
        }

        if(d == 1)
            d = 3;
        else if(d == 3)
            d = 1;
        while (true) {
            f = true;

            for(int i = 0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(arr[nx][ny] == 0) {
                    d++;
                    f = false;
                    if(d%4 == 3) {
                        if (arr[x][y + 1] == 0) {
                            y++;
                            break;
                        }
                    } else if(d%4 == 0) {
                        if (arr[x-1][y] == 0) {
                            x--;
                            break;
                        }
                    } else if(d%4 == 1) {
                        if (arr[x][y-1] == 0) {
                            y--;
                            break;
                        }
                    } else if(d%4 == 2) {
                        if (arr[x+1][y] == 0) {
                            x++;
                            break;
                        }
                    }
                }
            }

            if(arr[x][y] == 0) {
                arr[x][y] = cnt +2;
                cnt++;
            }

            if(f) {
                if(d%4 == 3) {
                    if (arr[x][y - 1] != 1) {
                        y--;
                        continue;
                    }
                } else if(d % 4 == 0) {
                    if (arr[x + 1][y] != 1) {
                        x++;
                        continue;
                    }
                } else if(d % 4 == 1) {
                    if (arr[x][y + 1] != 1) {
                        y++;
                        continue;
                    }
                } else if(d % 4 == 2) {
                    if (arr[x-1][y] != 1) {
                        x--;
                        continue;
                    }
                }
                break;
            }
        }

        System.out.println(cnt);
    }
}