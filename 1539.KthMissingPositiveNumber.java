class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int start=0;
        int last=n-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            int missing=arr[mid]-(mid+1);

            if(k>missing){
                start=mid+1;
            }else{
                last=mid-1;
            }
        }
        return k+start;
    }
}