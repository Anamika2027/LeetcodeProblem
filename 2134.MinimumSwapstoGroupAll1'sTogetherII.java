class Solution {
    public int minSwaps(int[] nums) {
        
        int n=nums.length;
        int windowSize=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                windowSize++;
            }
        }

        if (windowSize == 0) return 0;

        int c1=0;
        for(int i=0;i<windowSize;i++){
            if(nums[i]==1) c1++;
        }
        int ans=c1;

        for(int i=1;i<n;i++){
            if(nums[i-1]==1) c1--;
            int k=(i+windowSize-1)%n;
            if(nums[k]==1) c1++;
            ans=Math.max(ans,c1);
        }
        return windowSize-ans;

        // int k=count;
        // int start=0;
        // int end=0;
        // int minSwap=Integer.MAX_VALUE;
        
        // int swaps=0;
        // while(end<n){
        //     if(end==k){
        //         left++;
                
        //     }
        //     if(nums[end]==1){
        //         c1++;
        //     }
        //     swaps=count-c1;
        //     swaps=Maths.min(swaps,minSwaps);

        // }

    }
}