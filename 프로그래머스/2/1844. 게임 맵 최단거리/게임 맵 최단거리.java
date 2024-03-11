import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int row = maps.length;
        int column = maps[0].length;
        boolean visit[][];
        int x = 0;
        int y = 0;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<int[]> que = new LinkedList<>();

        visit = new boolean[row][column];
        que.add(new int[]{x,y,1});
        visit[0][0] = true;
        
        while(!que.isEmpty()) {
            int temp[] = que.poll();
            x = temp[0];
            y = temp[1];
            int cnt = temp[2];
            
            if(x == row - 1&& y == column - 1){
               return cnt;
            }
            for(int i = 0;i<4;i++) {
                int dxx = x+dx[i];
                int dyy = y+dy[i];
            
                if(dxx < 0 || dxx >= row || dyy < 0 || dyy >= column) continue;
                if(maps[dxx][dyy] == 0) continue;
                if(!visit[dxx][dyy] && maps[dxx][dyy] == 1) {
                    visit[dxx][dyy] = true;
                    que.add(new int[]{dxx, dyy, cnt+1});
                }
            }
            
        }
        return answer;
    }
}