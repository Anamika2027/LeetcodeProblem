class Solution {
    public int secondLargestElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }else if(nums[i]>secondLargest&& nums[i]!=largest){
                secondLargest=nums[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}