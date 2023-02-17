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
    public int minDiffInBST(TreeNode root) {
        int min=Integer.MAX_VALUE;
        List<Integer>list=new ArrayList<>();
        helper(root,list);
        
        int diff=0;
        for(int i=0;i<list.size()-1;i++){
            diff=list.get(i+1)-list.get(i);
            min=Math.min(min,diff);
        }
        return min;
    }
    
    public void helper(TreeNode root, List<Integer>list){
       if(root==null)return;
        
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}