class Solution {
    public String removeDuplicateLetters(String s) {

        int[] last=new int[26];
        boolean[] seen=new boolean[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }

        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(seen[ch-'a']) continue;

            while(!st.isEmpty() && ch<st.peek() && last[st.peek()-'a']>i){
                seen[st.peek()-'a']=false;
                st.pop();
            }
            st.push(ch);
            seen[ch-'a']=true;
        }

        StringBuilder res=new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}