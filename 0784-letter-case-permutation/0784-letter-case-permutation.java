class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>list = new ArrayList<>();
        
        Queue<String>q = new ArrayDeque<>();
        q.add(s);
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))continue;
            int size = q.size();
            while(size-->0){
                String str = q.remove();
                char[] ch = str.toCharArray();
                
                ch[i]=Character.toUpperCase(ch[i]);
                q.add(String.valueOf(ch));
                
                ch[i]=Character.toLowerCase(ch[i]);
                q.add(String.valueOf(ch));
            }
        }
        
        while(q.size()!=0){
            list.add(q.remove());
        }
        
        return list;
    }
}