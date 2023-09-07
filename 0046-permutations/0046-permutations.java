class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        helper(visited,nums,res,new ArrayList<>());
        return res;
    }
    
    public void helper(boolean[] visited , int[] nums, List<List<Integer>>res , List<Integer>list){
    if(list.size()==nums.length){
        res.add(new ArrayList<>(list));
        return ;
    }
    
    for(int i =0;i<nums.length; i++){
        if(visited[i]==false){
        list.add(nums[i]);
        visited[i]=true;
        helper(visited,nums,res,list);
        list.remove(list.size()-1);
        visited[i] =false;
        }
    }
     return;
    }
}