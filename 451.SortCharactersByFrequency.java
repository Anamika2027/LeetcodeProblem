class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> mp=new HashMap<>();

        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        List<Character> l=new ArrayList<>(mp.keySet());

        Collections.sort(l,(a,b)->mp.get(b)-mp.get(a));

        StringBuilder sb=new StringBuilder();
        for(char c:l){
            int freq=mp.get(c);
            while(freq-->0){
                sb.append(c);
            } 
        }
        return sb.toString();
    }
}