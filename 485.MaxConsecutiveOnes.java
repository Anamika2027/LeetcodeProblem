class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxcount=0;
        int i=0;
        while(i<n){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(maxcount,count);
                i++;
            }
            else{
                count=0;
                i++;
            }
        }
        return maxcount;
    }
}