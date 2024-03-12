class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        int cnt = 0;
        
        if(x1 == false && x2 == false)
            cnt++;    
        if(x3 == false && x4 == false)
            cnt++;
        if(cnt>0)
            answer = false;
        
        return answer;
    }
}