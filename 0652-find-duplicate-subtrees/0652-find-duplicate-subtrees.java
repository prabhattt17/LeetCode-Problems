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
    // HashSet<Integer>set=new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer>map =new HashMap<>();
        List<TreeNode>list=new ArrayList<>();
        helper(root,list,map);
        return list;
    }
    
    public String helper(TreeNode root,List<TreeNode>list,HashMap<String,Integer>map){
        if(root==null)return "";
        
       String left = helper(root.left,list,map);
       String right = helper(root.right,list,map);
        
        String s="";
        s=root.val+" "+left+" "+right;
        map.put(s,map.getOrDefault(s,0)+1);
        
        if(map.getOrDefault(s,0)==2){
            System.out.println(s);
                list.add(root);
        }
        return s;
    }
}