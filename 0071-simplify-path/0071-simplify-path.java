class Solution {
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        path.trim();
        String []arr = path.split("/");
        
        StringBuilder sb = new StringBuilder();
        
        for(String s:arr){

           if(s.equals("..")){
               if(st.size()>0){
                   st.pop();
               }
           }else if(s.equals(".") || s.equals(" ")){
               continue;
           }else if(s.length()>=1){
               st.push(s);
           }
        }
        
        while(st.size()!=0){
            String str = st.pop();
            sb.insert(0,str);
            sb.insert(0,"/");
        }
        if(sb.length()==0)return "/";
        return sb.toString();
    }
}