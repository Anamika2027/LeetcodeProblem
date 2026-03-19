/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
    
        TreeNode LHS=lowestCommonAncestor(root.left,p,q);
        TreeNode RHS=lowestCommonAncestor(root.right,p,q);
        if(LHS!=null && RHS!=null) return root;
        return (LHS!=null)?LHS:RHS;
    }
}