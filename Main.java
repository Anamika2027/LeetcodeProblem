import java.util.*;
class Solution {
    public int upperBound(int[] nums, int x) {
        int n=nums.length;
        int start=0;
        int last=n-1;
        int min=n;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==x){
                if(nums[mid]>x){
                    min=mid;
                    last=mid-1;
                    
                }else{
                    start=mid+1;
                }
            }
        }
        return min;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // Input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements of sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // Find upper bound
        int result = sol.upperBound(nums, x);

        // Output
        System.out.println("Upper Bound index: " + result);
    }
}
