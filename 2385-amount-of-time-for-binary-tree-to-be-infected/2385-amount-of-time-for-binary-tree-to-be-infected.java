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
    class pair{
        int val; 
        int time;
        pair(int val,int time){
            this.val=val;
            this.time=time;
        }
    }
    
    public int amountOfTime(TreeNode root, int start) {
        Queue<TreeNode>q=new ArrayDeque<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                TreeNode n=q.remove();
                if(n.left!=null){
                    List<Integer>l=map.getOrDefault(n.val,new ArrayList<>());
                    l.add(n.left.val);
                    List<Integer>l1=map.getOrDefault(n.left.val,new ArrayList<>());
                    l1.add(n.val);
                    map.put(n.val,l);
                    map.put(n.left.val,l1);
                    q.add(n.left);
                }
                if(n.right!=null){
                    List<Integer>l=map.getOrDefault(n.val,new ArrayList<>());
                    l.add(n.right.val);
                    List<Integer>l1=map.getOrDefault(n.right.val,new ArrayList<>());
                    l1.add(n.val);
                    map.put(n.val,l);
                    map.put(n.right.val,l1);
                    q.add(n.right);
                }
            }
        }
        
        List<Integer>arr=map.get(start);
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
          HashSet<Integer>set=new HashSet<>();
          Queue<pair>qq=new ArrayDeque<>();
          qq.add(new pair(start,0));
          int time=0;
        
        while(qq.size()!=0){
            pair p=qq.remove();
            
            if(set.contains(p.val))continue;
            set.add(p.val);
            time=Math.max(time,p.time);
            
            List<Integer>list=map.getOrDefault(p.val,new ArrayList<>());
            for(int nbr:list){
                if(!set.contains(nbr))
                 qq.add(new pair(nbr,p.time+1));
            }
        }
        return time;
    }
}