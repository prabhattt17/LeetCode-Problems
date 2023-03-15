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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>q = new ArrayDeque<>();
        q.add(root);
        int lvl = 1, count = 0;
        
        while(q.size()>0){
            int size = q.size(),nc=0;
            boolean flag = false;
            if(size!=lvl){
                count++;
            }
            while(size-->0){
                TreeNode n = q.remove();
                
                if(n.left!=null){
                    if(flag==true)return false;
                    q.add(n.left);
                }else{
                    flag = true;
                }
                if(n.right!=null){
                    if(flag==true)return false;
                    q.add(n.right);
                }else{
                    flag=true;
                }
                nc++;
            }
            // if(nc!=lvl){
            //     count++;
            // }
            lvl*=2;
        }
        if(count>1)return false;
        return true;
    }
}