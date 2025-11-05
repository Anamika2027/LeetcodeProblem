import java.util.Arrays;
class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int[] result=new int[2];
        
        int[] arr=Arrays.copyOf(nums,n);    
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                result[0]=arr[i];
                break;
            }
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];  
        }
        int total=n*(n+1)/2;
        int missing=total-sum;
        result[1]=missing;
        
        return result;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {3, 5, 4, 1, 1};
        int[] ans1 = sol.findMissingRepeatingNumbers(nums1);
        System.out.println("Repeating: " + ans1[0] + ", Missing: " + ans1[1]);

        // Example 2
        int[] nums2 = {1, 2, 3, 6, 7, 5, 7};
        int[] ans2 = sol.findMissingRepeatingNumbers(nums2);
        System.out.println("Repeating: " + ans2[0] + ", Missing: " + ans2[1]);
    }
}
