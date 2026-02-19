class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int total=0;

        for(int i=0;i<s.length();i++){
            int curr=m.get(s.charAt(i));

            if(i<s.length()-1 && curr<m.get(s.charAt(i+1))){
                total-=curr;
            }else{
                total+=curr;
            }
        }
        return total;
    }
}