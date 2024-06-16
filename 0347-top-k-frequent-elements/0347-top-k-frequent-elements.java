class Solution {
    class Pair{
        int val;
        int frq;
        
        Pair(int val,int frq){
            this.val = val;
            this.frq = frq;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.frq-a.frq);

        for(int key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        
        int ans[] = new int[k];
        int idx = 0;
        
        while(k-->0){
            Pair p = pq.remove();
            ans[idx++] = p.val;
        }
        
        return ans;
    }
}