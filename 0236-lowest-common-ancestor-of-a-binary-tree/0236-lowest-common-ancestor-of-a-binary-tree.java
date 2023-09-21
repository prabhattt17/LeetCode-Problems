/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        
        helper(root,p,list1);
        helper(root,q,list2);
        
        TreeNode temp = null;
        
        for(int i = 0 ; i<Math.min(list1.size(),list2.size()) ; i++){
            if(list1.get(i).val==list2.get(i).val){
                temp = list1.get(i);
            }else{
                return temp;
            }
        }
     
        return temp;
    }
    
    public boolean helper(TreeNode root, TreeNode n, List<TreeNode>list){
        if(root==null)return false;
        
        if(root.val==n.val){
            list.add(root);
            return true;
        }

        list.add(root);
      if( helper(root.left,n,list) || helper(root.right,n,list) )return true;
        
        list.remove(list.size()-1);
        
        return false;
    }
}