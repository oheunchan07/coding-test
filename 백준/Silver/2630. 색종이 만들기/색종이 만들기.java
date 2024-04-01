import java.util.*;
import java.io.*;

public class Main {

    public static int[][] arr;
    public static int w = 0;
    public static int b = 0;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        arr = new int[a][a];

        for(int i = 0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        part(0,0,a);

        System.out.println(w);
        System.out.println(b);
    }

    public static void part(int r, int c, int s) {
        int first = arr[r][c];
        boolean color = true;
        for(int i = r;i<r+s;i++) {
            for(int j = c;j<c+s;j++) {
                if(arr[i][j] != first)
                    color = false;
            }
        }

        if(color) {
            if(arr[r][c] == 0) {
                w++;
            }
            else
                b++;
            return;
        }

        part(r,c,s/2);
        part(r,c+s/2,s/2);
        part(r+s/2,c,s/2);
        part(r+s/2,c+s/2,s/2);
    }
}