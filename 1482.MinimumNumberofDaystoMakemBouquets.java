class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;

        if((long)m*k>n){
            return -1;
        }

        int min=Integer.MAX_VALUE;
        int max=0;
        for(int day:bloomDay){
            max=Math.max(max,day);
            min=Math.min(min,day);
        }

        while(min<max){
            int mid=min+(max-min)/2;
            int flowers=0;
            int bouquets=0;
            for(int day:bloomDay){
                
                if(day<=mid){
                    flowers++;
                    if(flowers==k){
                        bouquets++;
                        flowers=0;
                    }  
                }else{
                    flowers=0;
                }
            }

            if(bouquets>=m){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
}