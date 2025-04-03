import java.util.Scanner;
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length; 
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<n;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        // int result=sol.maxSubArray(arr);
        System.out.println(sol.maxSubArray(arr));
    }
}

