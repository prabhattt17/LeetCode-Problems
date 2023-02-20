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
        Queue<TreeNode>q=new ArrayDeque<>();
        List<List<Integer>>res = new ArrayList<>();
        if(root==null)return res;
        int lvl = 0;
        q.add(root);
        
        while(q.size()!=0){
            int size=q.size();
            List<Integer>list = new ArrayList<>();
            
            while(size -->0){
                TreeNode temp = q.remove();
                if(lvl%2==0){
                    list.add(temp.val);
                }else{
                    if(list.size()==0){
                        list.add(temp.val);
                    }else{
                        list.add(0,temp.val);
                    }
                }
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            res.add(list);
            lvl+=1;
        }
        return res; 
    }
}