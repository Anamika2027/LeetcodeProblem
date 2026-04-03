class Solution {
    public int[][] updateMatrix(int[][] mat) {
       
       int rows=mat.length;
       int cols=mat[0].length;
       Queue<int[]> q=new LinkedList<>();

       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(mat[i][j]==0){
                q.add(new int[]{i,j});
            }else{
                mat[i][j]=-1;
            }
        }
       }

       while(!q.isEmpty()){

        int[] curr=q.poll();

        int i=curr[0];
        int j=curr[1];

        if(i+1<rows&&mat[i+1][j]==-1){
            mat[i+1][j]=mat[i][j]+1;
            q.add(new int[]{i+1,j});
        }
        if(i-1>=0&&mat[i-1][j]==-1){
            mat[i-1][j]=mat[i][j]+1;
            q.add(new int[]{i-1,j});
        }
        if(j+1<cols&&mat[i][j+1]==-1){
            mat[i][j+1]=mat[i][j]+1;
            q.add(new int[]{i,j+1});
        }
        if(j-1>=0&&mat[i][j-1]==-1){
            mat[i][j-1]=mat[i][j]+1;
            q.add(new int[]{i,j-1});
        }
       }

        return mat;
    }
}