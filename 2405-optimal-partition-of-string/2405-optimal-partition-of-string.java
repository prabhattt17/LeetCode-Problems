class Solution {
    public int partitionString(String s) {
        int count = 1;
        
        int[] frq = new int[26];
        
        for(char ch:s.toCharArray()){
            if(frq[ch-'a']!=0){
                count++;
                frq = new int[26];
            }
             frq[ch-'a']++;
            
        }
        
        return count;
    }
}