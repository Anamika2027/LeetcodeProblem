class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        
        int n=arr.length;
        int[] nge=new int[n];

        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek()<=arr[i] ){
                st.pop();
            }

            if(!st.isEmpty()){
                nge[i]=st.peek();
            }else{
                nge[i]=-1;
            }
            st.push(arr[i]);
        }

        
        for(int i=0;i<n;i++){
            mp.put(arr[i],nge[i]);
        }

        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=mp.get(nums1[i]);
        }
        
        return result;

    }
}