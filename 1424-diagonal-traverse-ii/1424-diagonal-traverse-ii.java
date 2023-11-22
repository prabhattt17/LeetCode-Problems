class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
     HashMap<Integer,List<Integer>> map = new HashMap<>();
        int row = 0 ,col = 0, te = 0;
        
        for(int i = 0; i<nums.size(); i++){
            for(int j = 0;j<nums.get(i).size(); j++){
                row = Math.max(row,i);
                col = Math.max(col,j);
                
                List<Integer> list = map.getOrDefault(i+j,new ArrayList<>());
                
                list.add(nums.get(i).get(j));
                // System.out.println((i+j)+" "+nums.get(i).get(j));
                map.put(i+j,list);
                te++;
            }
        }
        
        int[] ans = new int[te];
        int idx = 0;
        
        for(int i = 0;i<=row+col; i++){
            List<Integer> l = map.getOrDefault(i,new ArrayList<>());
            Collections.reverse(l);
            
            for(int val:l){
                ans[idx++] = val;
            }
        }
        return ans;
    }
}