import java.util.Scanner;
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int min_price=prices[0];
        int max_profit=0;   
        for(int i=1;i<n;i++){
            max_profit=Math.max(max_profit,prices[i]-min_price);
            min_price=Math.min(min_price,prices[i]);
        }
        return max_profit;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        System.out.println(ob.maxProfit(nums));
    }
}