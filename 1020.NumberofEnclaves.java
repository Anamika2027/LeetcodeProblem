class Solution {
    public int numEnclaves(int[][] grid) {
        
        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++){
            dfs(grid,i,0);
            dfs(grid,i,cols-1);
        }
        for(int j=0;j<cols;j++){
            dfs(grid,0,j);
            dfs(grid,rows-1,j);
        }
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][]grid,int i,int j){
        
        int rows=grid.length;
        int cols=grid[0].length;

        if(i>=rows||i<0||j>=cols||j<0||grid[i][j]!=1) return;

        grid[i][j]=2;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}