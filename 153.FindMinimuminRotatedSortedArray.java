class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int last=n-1;
       
        while(start<last){
            int mid=start+(last-start)/2;
            
            if(nums[mid]>nums[last]){
                start=mid+1;
            }else{
                last=mid;
            }
        }
        return nums[start];
    }
}