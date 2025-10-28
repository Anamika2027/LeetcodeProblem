import java.util.*;
class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> Leader=new ArrayList<>();
        int n=nums.length;
        int max=nums[n-1];
        Leader.add(max);
        for(int i=n-2;i>=0;i--){
            if(max<nums[i]){
                Leader.add(nums[i]);
            }
            max=Math.max(max,nums[i]);

        }
        Collections.reverse(Leader);
        return Leader;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> ans = s.leaders(nums);  
        System.out.println(ans);
    }
}