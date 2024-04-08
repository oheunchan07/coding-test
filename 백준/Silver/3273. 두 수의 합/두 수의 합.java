import java.util.*;
        import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            if(set.contains(x-arr[i]))
                cnt++;
        }

        System.out.println(cnt/2);
    }
}