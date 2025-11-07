class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int last=n-1;

        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[mid]>=nums[start]){
                if(nums[mid]>target&&nums[start]<=target){
                    last=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<target&&target<=nums[last]){
                    start=mid+1;
                }else{
                    last=mid-1;
                }
            }
        }
        return -1;
    }
}