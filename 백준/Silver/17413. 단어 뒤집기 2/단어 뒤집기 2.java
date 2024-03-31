import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb= new StringBuilder();

        ArrayDeque<Character>deque = new ArrayDeque<>();

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)=='<'){
                int temp=i;
                while(s.charAt(temp)!='>'){
                    sb.append(s.charAt(temp));
                    temp++;
                }
                sb.append('>');
                i=temp;
            }
            else if(s.charAt(i) == ' ')
                sb.append(" ");
            else{
                int temp=i;
                while(temp<s.length() && s.charAt(temp) != ' ' && s.charAt(temp) != '<'){
                    deque.addLast(s.charAt(temp));
                    temp++;
                }
                int ds = deque.size();
                for(int q = 0;q < ds;q++)
                    sb.append(deque.pollLast());
                i=temp-1;
            }
        }

        System.out.println(sb.toString());
    }
}