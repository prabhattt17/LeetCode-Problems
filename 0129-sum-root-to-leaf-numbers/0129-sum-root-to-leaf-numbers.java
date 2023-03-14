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
    public int sumNumbers(TreeNode root) {
        int sum =0;
        int asf=0;
        int ans=helper(root,sum,asf);
        return ans;
    }
    public int helper(TreeNode root,int sum,int asf){
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            sum+=asf*10+root.val;
            asf=0;
            return sum;
        }
     
       return helper(root.left,sum,asf*10+root.val)+helper(root.right,sum,asf*10+root.val);
        
    
    }
}