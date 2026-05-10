class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sp=new HashMap<>();
        HashMap<Character,Character> tp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(sp.containsKey(ch1)&& sp.get(ch1)!=ch2) return false;
            if(tp.containsKey(ch2)&& tp.get(ch2)!=ch1) return false;

            sp.put(ch1,ch2);
            tp.put(ch2,ch1);
        }
        return true;
    }
}