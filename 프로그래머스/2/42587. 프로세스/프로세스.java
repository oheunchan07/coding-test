import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities)
            queue.offer(i);
        
        while(!queue.isEmpty()) {
            for(int i = 0;i<priorities.length;i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                         
                
                    if(i == location)
                        return answer;
                }
            }
        }
        
        return answer;
    }
}