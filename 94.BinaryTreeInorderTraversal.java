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

    void inorder(TreeNode root,List<Integer> lt){
        if(root==null) return;
        inorder(root.left,lt);
        lt.add(root.val);
        inorder(root.right,lt);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> lt=new ArrayList<>();
        inorder(root,lt);
        return lt;
    }
}