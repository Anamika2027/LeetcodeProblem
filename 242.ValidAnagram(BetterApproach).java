class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] arr1=s.toCharArray();
        // char[] arr2=t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1,arr2);
        if(s.length() !=t.length()) return false;

        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int num:freq){
            if(num!=0) return false;
        }
        return true;
    }
}