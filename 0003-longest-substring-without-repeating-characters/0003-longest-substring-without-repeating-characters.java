class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i = 0, j = 0 , max = 0;
     // HashMap<Character,Integer> map = new HashMap<>();
     HashSet<Character> set = new HashSet<>();
        
      while(j<s.length()){
         while(j<s.length() && !set.contains(s.charAt(j))){
             set.add(s.charAt(j));
             j++;
         }
         
         max = Math.max(max,j-i); 
          while(j<s.length() && i<j && set.contains(s.charAt(j))){
              set.remove(s.charAt(i++));
          }
      }
        
        return max;
    }
}