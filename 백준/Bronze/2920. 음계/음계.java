import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        StringTokenizer st1 = new StringTokenizer(a);

        if(Integer.parseInt(st.nextToken()) == 1) {
            if(Integer.parseInt(st.nextToken()) == 2) {
                if(Integer.parseInt(st.nextToken()) == 3) {
                    if(Integer.parseInt(st.nextToken()) == 4) {
                        if(Integer.parseInt(st.nextToken()) == 5) {
                            if(Integer.parseInt(st.nextToken()) == 6) {
                                if(Integer.parseInt(st.nextToken()) == 7) {
                                    if(Integer.parseInt(st.nextToken()) == 8) {
                                        System.out.println("ascending");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(Integer.parseInt(st1.nextToken()) == 8) {
            if(Integer.parseInt(st1.nextToken()) == 7) {
                if(Integer.parseInt(st1.nextToken()) == 6) {
                    if(Integer.parseInt(st1.nextToken()) == 5) {
                        if(Integer.parseInt(st1.nextToken()) == 4) {
                            if(Integer.parseInt(st1.nextToken()) == 3) {
                                if(Integer.parseInt(st1.nextToken()) == 2) {
                                    if(Integer.parseInt(st1.nextToken()) == 1) {
                                        System.out.println("descending");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("mixed");
    }
}