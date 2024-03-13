import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0;i<commands.length;i++) {
            int a1 = commands[i][0]-1;
            int a2 = commands[i][1]-1;
            int[] realArray = new int[a2-a1+1];
            int cnt = 0;
            
            for(int k = a1;k<=a2;k++){
                realArray[cnt] = array[k];
                cnt++;
            }

            Arrays.sort(realArray);
            
            for(int j = 0;j<cnt;j++) 
                System.out.print(realArray[j]+" ");
                System.out.println();
            answer.add(realArray[commands[i][2] - 1]);
        }
        
         return answer.stream().mapToInt(i->i).toArray();
    }
}