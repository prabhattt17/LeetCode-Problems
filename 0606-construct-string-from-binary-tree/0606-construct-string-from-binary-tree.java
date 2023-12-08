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
    String str = "";
    public String tree2str(TreeNode root) {
        
         helper(root);
        return str.substring(1,str.length()-1);
    }
     
    public String helper(TreeNode root){
        if(root==null)return "";
        
        str+="("+root.val; 
        if(root.left==null && root.right!=null){
            str+="()";
        }
        helper(root.left);
        
        helper(root.right);
        str+=")";
        return str;
    }
}