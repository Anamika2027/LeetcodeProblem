class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int min=0;
        int max=m*n-1;
        
        while(min<=max){
            int mid=min+(max-min)/2;
            int midVal=matrix[mid/n][mid%n];
            if(midVal==target){
                return true;
            }else if(midVal<target){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return false;
    }
}