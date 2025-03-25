import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        if(nums.length==2){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
            return;
        }
         int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        ob.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}