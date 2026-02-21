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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int level=0;

        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);

        while(!Q.isEmpty()){
            int size=Q.size();
            List<Integer> temp=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode curr=Q.poll();

                temp.add(curr.val);
                if(curr.left!=null) Q.offer(curr.left);
                if(curr.right!=null) Q.offer(curr.right);
            }

            if(level%2==1) Collections.reverse(temp);
            
            ans.add(temp);
            level++;
        }
        return ans;
    }
}