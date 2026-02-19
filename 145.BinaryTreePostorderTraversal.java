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

    void postorder(TreeNode root,List<Integer> lt){
        if(root==null) return;
        postorder(root.left,lt);
        postorder(root.right,lt);
        lt.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lt=new ArrayList<>();
        postorder(root,lt);
        return lt;
    }
}