class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor=image[sr][sc];
        if(originalColor==color) return image;
        dfs(image,sr,sc,originalColor,color);
        return image;
    }

    public void dfs(int[][] image,int i,int j,int originalColor,int color){
        int rows=image.length;
        int cols=image[0].length;

        if(i<0 || j<0 || i>=rows || j>=cols){
            return;
        }

        if(image[i][j]!=originalColor){
            return;
        }

        image[i][j]=color;

        dfs(image,i+1,j,originalColor,color);
        dfs(image,i-1,j,originalColor,color);
        dfs(image,i,j+1,originalColor,color);
        dfs(image,i,j-1,originalColor,color);
    }
}