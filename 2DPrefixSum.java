class Solution {
    public int[][] PrefixSum(int n, int[][] forest) { //n is size of forest or number of rows and columns
        int[][] prefixSum=new int[n][n];
        prefixSum[0][0]=forest[0][0];
        for(int i=1;i<n;i++){
            prefixSum[i][0]=prefixSum[i-1][0]+forest[i][0];
        }
        for(int j=1;j<n;j++){
            prefixSum[0][j]=prefixSum[0][j-1]+forest[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                prefixSum[i][j]=prefixSum[i-1][j]+prefixSum[i][j-1]-prefixSum[i-1][j-1]+forest[i][j];
            }
        }
        return prefixSum;
}
}
