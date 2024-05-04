import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] map = new boolean[6][6];
        int x = 0;
        int y = 0;
        int sx;
        int sy;
        int lx;
        int ly;

        String n = br.readLine();
        sx = n.charAt(0) - 'A';
        sy = n.charAt(1) - '1';
        lx = sx;
        ly = sy;

        for(int i = 0;i<35;i++) {
            n = br.readLine();

            x = n.charAt(0) - 'A';
            y = n.charAt(1) - '1';

            if(map[x][y] == true) {
                System.out.println("Invalid");
                return;
            }

            if (!((Math.abs(x - lx) == 2 && Math.abs(y - ly) == 1) || (Math.abs(x - lx) == 1 && Math.abs(y - ly) == 2))) {
                System.out.println("Invalid");
                return;
            }

            map[x][y] = true;

            lx = x;
            ly = y;
        }

        if(!(Math.abs(x - sx) == 2 && Math.abs(y - sy) == 1 || Math.abs(x - sx) == 1 && Math.abs(y - sy) == 2)) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}