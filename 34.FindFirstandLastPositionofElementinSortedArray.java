class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int last=n-1;
        int max=-1;
        int min=-1;
        int[] result=new int[2];
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                min=mid;
                last=mid-1;
            }else if(nums[mid]>target){
                last=mid-1;
            }else{
                start=mid+1;
            }
        }

        start = 0;
        last = n - 1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                max=mid;
                start=mid+1;
            }else if(nums[mid]>target){
                last=mid-1;
            }else{
                start=mid+1;
            }
        }

        result[0]=min;
        result[1]=max;
        return result;
    }
}

