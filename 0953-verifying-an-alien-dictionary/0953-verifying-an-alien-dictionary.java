class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        int idx=0;
        for(char ch:order.toCharArray()){
            map.put(ch,idx);
            idx++;
        }
        
        
        for(int i=0;i<words.length-1;i++){
            String s1=words[i];
            String s2=words[i+1];
            
            int len = Math.min(s1.length(),s2.length());
            
            if(s1.length()!=len && len==s2.length() && s1.startsWith(s2))return false;
            for(int j=0;j<len;j++){
            if(map.get(s1.charAt(j))>map.get(s2.charAt(j)))return false;
             if(map.get(s1.charAt(j))<map.get(s2.charAt(j)))break;
            }
        }
        
        return true;
    }
}