class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int p=0,q=n-1;
            while(p<q){
            int temp=matrix[i][p];
            matrix[i][p]=matrix[i][q];
            matrix[i][q]=temp;
            p++;
            q--;
            }
        }
    }
}