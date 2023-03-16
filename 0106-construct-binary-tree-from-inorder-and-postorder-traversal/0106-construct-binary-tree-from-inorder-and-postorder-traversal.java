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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder,postorder,0,n-1,0,n-1);
    }
    
    public TreeNode helper(int[] inOrder, int[] postOrder, int ps, int pe, int is, int ie){
        if(is>ie || ps>pe)return null;
        
        int idx = -1;
        for(int i=0;i<inOrder.length;i++){
            if(inOrder[i]==postOrder[pe]){
                idx=i;
                break;
            }
        }
        TreeNode root = new TreeNode(inOrder[idx]);
        
        int te = idx-is;
        root.left = helper(inOrder,postOrder,ps,ps+te-1,is,is+idx-1);
        root.right = helper(inOrder,postOrder,ps+te,pe-1,is+te+1,ie);
        return root;
    }
}