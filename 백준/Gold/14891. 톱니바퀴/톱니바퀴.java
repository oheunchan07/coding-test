import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][8];

        for(int i = 0; i<4 ;i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken()) - 1;

            int[] d = new int[4];
            d[number] = Integer.parseInt(st.nextToken());

            for(int j=number-1; j>=0; j--) {
                if(arr[j][2] != arr[j+1][6]) {
                    d[j] = d[j+1] * -1;
                }else {
                    break;
                }
            }

            for(int j = number + 1; j<4; j++) {
                if (arr[j][6] != arr[j - 1][2]) {
                    d[j] = d[j - 1] * -1;
                } else {
                    break;
                }
            }

            int temp = 0;

            for(int j=0; j<4; j++) {
                if(d[j] == 1) {
                    temp = arr[j][7];
                    for(int k=7; k>0; k--) {
                        arr[j][k] = arr[j][k-1];
                    }
                    arr[j][0] = temp;
                }
                if(d[j] == -1) {
                    temp = arr[j][0];
                    for(int k=0; k<7; k++) {
                        arr[j][k] = arr[j][k+1];
                    }
                    arr[j][7] = temp;
                }
            }
        }

        int cnt = 0;
        if(arr[0][0] == 1)
            cnt += 1;
        if(arr[1][0] == 1)
            cnt += 2;
        if(arr[2][0] == 1)
            cnt += 4;
        if(arr[3][0] == 1)
            cnt += 8;

        System.out.println(cnt);
    }
}