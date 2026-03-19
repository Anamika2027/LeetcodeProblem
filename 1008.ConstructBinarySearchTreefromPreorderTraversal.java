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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public TreeNode constructBST(int[] preorder,long min,long max){
        
        if(index>=preorder.length) return null;
        int val=preorder[index];
        if(val<min || val>max) return null;
        TreeNode root=new TreeNode(val);
        index++;
        root.left=constructBST(preorder,min,val);
        root.right=constructBST(preorder,val,max);
        return root;    
    }
}