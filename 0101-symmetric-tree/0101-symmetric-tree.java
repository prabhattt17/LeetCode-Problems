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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        if(root.left==null && root.right==null)return true;
        if(root.left==null || root.right==null)return false;
        if(root.left.val!=root.right.val)return false;
        return helper(root.left,root.right);
    }
    
    public boolean helper(TreeNode a, TreeNode b){
        if(a==null && b==null)return true;
        if(a==null || b==null)return false;
        
        if(a.left!=null && b.right!=null){
            if(a.left.val!=b.right.val)return false;
        }
        if(a.right!=null && b.left!=null){
            if(b.left.val!=a.right.val)return false;
        }
        
        return helper(a.left,b.right) && helper(a.right,b.left);
    }
}