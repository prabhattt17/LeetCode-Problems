class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        int n = grid.length;
        
        for(int i = 0;i<n; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j<n; j++){
                l.add(grid[i][j]);
            }
            map.put(l,map.getOrDefault(l,0)+1);
        }
        
        int count = 0;
        
         for(int i = 0;i<n; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j<n; j++){
                l.add(grid[j][i]);
            }
           
             if(map.containsKey(l)){
                 count+=map.get(l);
             }
        }
        return count;
        
    }
}