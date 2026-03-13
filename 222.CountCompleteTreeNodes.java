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
    public int totalNodes(TreeNode root){
        if(root==null) return 0;
        int leftCount=totalNodes(root.left);
        int rightCount=totalNodes(root.right);
        return 1+leftCount+rightCount;
    }
    public int countNodes(TreeNode root) {
    
        return totalNodes(root);
    }
}