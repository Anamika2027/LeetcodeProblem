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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root==null) return 0;

        TreeNode L=root.left;
        int curr=0;

        if(L!=null && L.right==null && L.left==null){
            curr=L.val;
        }

        return curr+ sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);

    }
}