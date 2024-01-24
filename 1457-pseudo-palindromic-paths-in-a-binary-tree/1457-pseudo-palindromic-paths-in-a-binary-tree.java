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
    int count = 0;
    int[] arr = new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
      
        helper(root);
        return count;
    }
    public void helper(TreeNode root){
        if(root==null)return ;
        
        arr[root.val]++;
        if(root.left==null && root.right==null){
            int ans = 0;
            for(int i = 1; i<=9; i++){
                if(arr[i]%2==1){
                    ans++;
                }
            }
            
            if(ans<=1){
                count++;
            }
        }
      
        helper(root.left);
        helper(root.right);
        
        arr[root.val]--;
    }
}