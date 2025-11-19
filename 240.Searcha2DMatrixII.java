class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=n-1;

        for(int i=0;i<m;i++){
            while(start<=end){
            int mid=start+(end-start)/2;
            // int midVal=matrix[mid/n][mid%n];
            
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            start=0;
            end=n-1;
        }
        
        return false;
    }
}   