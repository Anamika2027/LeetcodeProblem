class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        int min=1;
        for(int num:nums){
            max=Math.max(max,num);
        }

        while(min<max){
            int mid=min+(max-min)/2;
            int sum=0;
            for(int num:nums){
                sum+=(int)Math.ceil((double)num/mid);
            }
            if(sum<=threshold){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
        
    }
}