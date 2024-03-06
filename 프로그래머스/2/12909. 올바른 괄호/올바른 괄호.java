class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char []str = s.toCharArray();
        int cnt = 0;
        
        for(int i = 0;i<str.length;i++) {
            if(str[i] == '(')
                cnt++;
            else if (str[i] == ')')
                cnt--;
            if(cnt == -1)
                return false;
        }
        
        if(cnt != 0)
            answer = false;
        
        return answer;
    }
}