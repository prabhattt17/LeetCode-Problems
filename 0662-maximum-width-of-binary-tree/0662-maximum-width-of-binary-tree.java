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

class Pair{
    TreeNode n;
    int idx;
    Pair(TreeNode n,int idx){
        this.n = n;
        this.idx = idx;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     Queue<Pair>q = new ArrayDeque<>();
        
        q.add(new Pair(root,0));
        int max = 0;
        
        while(q.size()!=0){
            int size = q.size();
            int left = 0, right = 0;
            
            while(size -->0){
                Pair p = q.remove();
                right = p.idx;
                
                if(left==0){
                    left = p.idx;
                }
                
                if(p.n.left!=null)q.add(new Pair(p.n.left,(p.idx*2)+1));
                if(p.n.right!=null)q.add(new Pair(p.n.right,(p.idx*2)+2));
            }
            max = Math.max(max,right-left+1);
        }
        
        return max;
    }
}