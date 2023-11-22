class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
     HashMap<Integer,List<Integer>> map = new HashMap<>();
        int row = 0 ,col = 0, te = 0;
        
        for(int i = nums.size()-1; i>=0; i--){
            for(int j = nums.get(i).size()-1;j>=0; j--){
                row = Math.max(row,i);
                col = Math.max(col,j);
                
                List<Integer> list = map.getOrDefault(i+j,new ArrayList<>());
                
                list.add(nums.get(i).get(j));
                map.put(i+j,list);
                te++;
            }
        }
        
        int[] ans = new int[te];
        int idx = 0;
        
        for(int i = 0;i<=row+col; i++){
            List<Integer> l = map.getOrDefault(i,new ArrayList<>());
            
            for(int val:l){
                ans[idx++] = val;
            }
        }
        return ans;
    }
}