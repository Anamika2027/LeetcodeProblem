class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int last=n-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                return true;
            }

            if(nums[mid]==nums[start]&&nums[mid]==nums[last]){
                start++;
                last--;
                continue;
            }
            if(nums[mid]>=nums[start]){
                if(nums[start]<=target&&nums[mid]>=target){
                    last=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[last]>=target&&nums[mid]<=target){
                    start=mid+1;
                }else{
                    last=mid-1;
                }
            }
            
        }
        return false;
        
    }
}