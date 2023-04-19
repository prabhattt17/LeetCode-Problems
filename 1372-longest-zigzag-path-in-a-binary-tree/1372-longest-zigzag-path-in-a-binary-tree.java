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
    class Pair{
        int leftSlope;
        int rightSlope;
        int max;
        Pair(int leftSlope,int rightSlope,int max){
            this.leftSlope=leftSlope;
            this.rightSlope=rightSlope;
            this.max=max;
        }
    }
    public int longestZigZag(TreeNode root) {
        if(root.left==null && root.right==null)return 0;
        Pair p=solve(root);
        return p.max;
    }
    public Pair solve(TreeNode root){
      if(root==null)return new Pair(-1,-1,0);
        
        Pair p = new Pair(0,0,0);
        
        Pair leftPair = solve(root.left);
        Pair rightPair = solve(root.right);
        
        p.leftSlope = leftPair.rightSlope+1;
        p.rightSlope = rightPair.leftSlope+1;
        
        p.max = Math.max(Math.max(leftPair.max,rightPair.max),Math.max(p.leftSlope,p.rightSlope));
        
        return p;
    
    }
}