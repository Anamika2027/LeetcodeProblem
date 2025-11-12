class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int n=weights.length;
       int min=0;
       for(int num:weights){
        min=Math.max(min,num);
       }
       
       int max=0;
       for(int num:weights){
        max+=num;
       }

       while(min<max){
        int mid=min+(max-min)/2;
        int con=0;
        int dr=1;
        for(int weight:weights){
            if(con+weight>mid){
                dr++;
                con=0;
            }
            con+=weight;
        }

        if(dr>days){
            min=mid+1;
        }else{
            max=mid;
        }
       }
       return min;
    }
}