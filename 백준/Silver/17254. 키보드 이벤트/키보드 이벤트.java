import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] s = new int[m][3];

        for(int i = 0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<3;j++){
                if(j == 2) {
                    s[i][j] = st.nextToken().charAt(0);
                } else
                    s[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(s, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        for (int i = 0;i<m;i++) {
            System.out.print( (char) s[i][2]);
        }

    }
}