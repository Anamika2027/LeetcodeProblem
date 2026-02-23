/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int sum=0;
        int curr=root.val;
        if(curr>=low && curr<=high){
            sum+=curr;
        }
            
        sum+=rangeSumBST(root.right,low,high);
        sum+=rangeSumBST(root.left,low,high);
    
        return sum;
    }
} com