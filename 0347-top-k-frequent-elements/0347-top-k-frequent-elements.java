class Solution {
    public class Pair{
        int elm;
        int frq;
        Pair(int elm,int frq){
            this.elm = elm;
            this.frq = frq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.frq-b.frq);
        int[] ans = new int[k];
        int idx = k-1;
        
        for(int key:map.keySet()){
            int frq = map.get(key);
            
            if(k==0 && pq.size()>0 && pq.peek().frq<frq){
                pq.remove();
                pq.add(new Pair(key,frq));
            }else if(k>0){
                pq.add(new Pair(key,frq));
                k--;
            }
        }
        
    
        
        while(pq.size()!=0){
            Pair p = pq.remove();
            ans[idx--] = p.elm;
        }
        
        return ans;
    }
}