class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;

        for(int i=0;i<=n-1;i++){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                if(st.peek()<-asteroids[i]){
                    st.pop();
                    continue;
                }else if(st.peek()==-asteroids[i]){
                    st.pop();
                }
                destroyed=true;
                break;
            }

            if(!destroyed){
                st.push(asteroids[i]);
            }
        }

        int[] result=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }

        return result;
    }
}