class Solution {
    public int[] nextGreaterElements(int[] nums) {
       
        int n=nums.length;
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!st.isEmpty()&&st.peek()<=nums[index]){
                st.pop();
            }
            
            if(i<n){
                result[index]=(!st.isEmpty())?st.peek():-1;
            }
            st.push(nums[index]);
        }

        return result;
    }
}