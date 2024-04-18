import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> passwordMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            passwordMap.put(site, password);
        }

        for(int i = 0; i < m; i++) {
            String siteToFind = br.readLine();
            System.out.println(passwordMap.get(siteToFind));
        }
    }
}
