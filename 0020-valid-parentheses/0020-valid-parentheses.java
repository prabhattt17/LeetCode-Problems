class Solution {
    public boolean isValid(String x) {
         Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            
             
            else if( ch==')'){
                if(st.size()==0 || st.peek()!='('){
                    return false;
                }else{
                    st.pop();
                }
            }
            
            else if( ch=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    return false;
                }else{
                    st.pop();
                }
        }else if( ch==']'){
                if(st.size()==0 || st.peek()!='['){
                    return false;
                }else{
                    st.pop();
                }
    }
}
if(st.size()==0) 
 return true;
 else
  return false;
    }
}