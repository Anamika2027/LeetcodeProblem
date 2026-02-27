class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid==null || grid.length==0) return 0;
        int count=0;
        int rows=grid.length;
        int col=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    grid(grid,i,j);
                }
            }
        }

        return count;
    }

    public void grid(char[][]grid,int i,int j){
        int rows=grid.length;
        int col=grid[0].length;

        if(i<0 || j<0 || i>=rows || j>=col || grid[i][j]=='0') return;

        grid[i][j]='0';
        grid(grid,i+1,j);
        grid(grid,i-1,j);
        grid(grid,i,j+1);
        grid(grid,i,j-1);
    }



}