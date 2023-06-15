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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        int sum = root.val, level = 1,lvl = 1;
        
        while(q.size()>0){
            int size = q.size();
            int totalSum = 0 ;
            
            while(size-->0){
                TreeNode n = q.remove();
                totalSum+=n.val;
                
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            if(totalSum>sum){
                sum = totalSum;
                level = lvl;
            }
            lvl++;
        }
        return level;
    }
}