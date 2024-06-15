class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i = 0, j = 0 , max = 0;
     HashMap<Character,Integer> map = new HashMap<>();
        
      while(j<s.length()){
          
          while(j<s.length() && !map.containsKey(s.charAt(j))){
              map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
              j++;
          }
          
          max = Math.max(max,j-i);
          
          while(j<s.length() && i<j && map.containsKey(s.charAt(j))){
              map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
              if(map.getOrDefault(s.charAt(i),0)<=0){
                  map.remove(s.charAt(i));
              }
              i++;
          }
      }
        
        return max;
    }
}