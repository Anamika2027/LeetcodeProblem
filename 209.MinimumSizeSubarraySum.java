class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int n=nums.length;
        // int minSize=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         int size=j-i+1;
        //         sum+=nums[j];
        //         if(sum>=target){
        //            minSize=Math.min(size,minSize);
        //         }
                
        //     }
        // }
        // return minSize==Integer.MAX_VALUE?0:minSize;

        int n=nums.length;
        int left=0;
       
        int sum=0;
        int minSize=Integer.MAX_VALUE;
         for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    
}