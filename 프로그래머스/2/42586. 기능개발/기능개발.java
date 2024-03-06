import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int []data = new int[progresses.length];
        
        for(int i = 0;i<progresses.length;i++) {
            int cnt = 0;
            data[i] = 100 - progresses[i];
            while(data[i]>0) {
                data[i] -= speeds[i];
                cnt++;
            }
            data[i] = cnt;
        }
                
        int cnt = 1;
        int max = data[0];
        for(int i = 1;i<data.length;i++) {
            if(data[i] <= max){
                cnt++;
            } else {
                max = data[i];
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);

        return answer.stream().mapToInt(i->i).toArray();
    }
}