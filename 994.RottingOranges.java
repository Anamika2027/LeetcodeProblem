import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] vis = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j, 0});
                    vis[i][j] = true;
                }
            }
        }

        int ans = 0;

        while(!q.isEmpty()){

            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            int time = curr[2];

            ans = Math.max(ans, time);

            if(i+1 < rows && !vis[i+1][j] && grid[i+1][j] == 1){
                q.add(new int[]{i+1, j, time+1});
                vis[i+1][j] = true;
            }
            if(i-1 >= 0 && !vis[i-1][j] && grid[i-1][j] == 1){
                q.add(new int[]{i-1, j, time+1});
                vis[i-1][j] = true;
            }
            if(j+1 < cols && !vis[i][j+1] && grid[i][j+1] == 1){
                q.add(new int[]{i, j+1, time+1});
                vis[i][j+1] = true;
            }
            if(j-1 >= 0 && !vis[i][j-1] && grid[i][j-1] == 1){
                q.add(new int[]{i, j-1, time+1});
                vis[i][j-1] = true;
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1 && !vis[i][j]) return -1;
            }
        }

        return ans;
    }
}