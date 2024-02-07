class Solution {
    class Pair{
        char ch;
        int frq;
        
        Pair(char ch,int frq){
            this.ch = ch;
            this.frq = frq;
        }
    }
    
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Pair> pq  = new PriorityQueue<>((a,b)-> b.frq-a.frq);
        
         for(Map.Entry<Character, Integer> m : map.entrySet()){
              pq.add(new Pair(m.getKey(),m.getValue()));
         }
        
        StringBuilder sb = new StringBuilder();
        
        while(pq.size()!=0){
            Pair p = pq.remove();
            
            for(int i = 0;i<p.frq; i++){
                sb.append(p.ch);
            }
        }
        
        return sb.toString();
    }
}