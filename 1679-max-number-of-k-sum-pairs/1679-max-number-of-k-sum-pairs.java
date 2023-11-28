class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        
        for(int i :nums){
        if(map.containsKey(k-i)){
            ans++;
            if(map.get(k-i)==1){
                map.remove(k-i);
            }else{
                map.put(k-i,map.getOrDefault(k-i,0)-1);
            }
        }else{
            map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        return ans;
    }
}