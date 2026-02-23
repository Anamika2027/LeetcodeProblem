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
        if(root==p||root==q) return root;
      
        TreeNode rs=lowestCommonAncestor(root.right,p,q);

        TreeNode ls=lowestCommonAncestor(root.left,p,q);
        
        if(rs!=null && ls!=null)return root;

        if(ls!=null) return ls;
        return rs;
    }
}