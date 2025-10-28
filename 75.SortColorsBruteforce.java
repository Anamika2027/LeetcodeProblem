import java.util.Scanner;
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: Check if swapping occurs
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) { // Swap if the element is greater
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Stop if no swaps (already sorted)
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        sol.sortColors(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}