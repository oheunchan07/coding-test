import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = new ArrayList<Integer>();
        for(int i = 0;i<10;i++) {
            num.add(Integer.parseInt(br.readLine())%42);
        }
        num = num.stream().distinct().collect(Collectors.toList());
        System.out.println(num.size());
    }
}