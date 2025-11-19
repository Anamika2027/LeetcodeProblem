// import java.util.*;

// class Solution {
//     public int findKRotation(ArrayList<Integer> nums) {
//         int n = nums.size();
//         int start = 0;
//         int last = n - 1;

//         // If array is already sorted → no rotation
//         if (nums.get(start) < nums.get(last)) {
//             return 0;
//         }

//         while (start <= last) {
//             int mid = start + (last - start) / 2;

//             // int prev = (mid - 1 + n) % n;
//             // int next = (mid + 1) % n;

//             // Check if mid is minimum
//             if (nums.get(mid) <= nums.get(prev) && nums.get(mid) <= nums.get(next)) {
//                 return mid;
//             }

//             // If left side is sorted → answer is on right
//             if (nums.get(mid) >= nums.get(start)) {
//                 start = mid + 1;
//             } else {
//                 last = mid - 1;
//             }
//         }

//         return start;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Read size of array
//         int n = sc.nextInt();

//         ArrayList<Integer> nums = new ArrayList<>();

//         // Read elements
//         for (int i = 0; i < n; i++) {
//             nums.add(sc.nextInt());
//         }

//         // Create Solution object & call function
//         Solution obj = new Solution();
//         int result = obj.findKRotation(nums);

//         // Output rotation count
//         System.out.println(result);
//     }
// }


import java.util.*;

class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int start = 0;
        int end = n - 1;

        // If already sorted
        if (nums.get(start) < nums.get(end)) {
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is minimum (only one check needed)
            if (mid > 0 && nums.get(mid) < nums.get(mid - 1)) {
                return mid;
            }

            // If mid element >= first element → left side sorted → go right
            if (nums.get(mid) >= nums.get(0)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Solution obj = new Solution();
        int result = obj.findKRotation(nums);

        System.out.println(result);
    }
}
