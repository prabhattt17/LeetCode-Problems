class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String str:tokens){
            
            if(str.length()>1 || Character.isDigit(str.charAt(0))){
                int number = Integer.parseInt(str);
                int idx = 0;

                // while(str.length()>idx){
                //     char c = str.charAt(idx++);
                //     number=number*10+((int)(c-'0'));
                // }
                
                System.out.println(number);
                st.push(number);
            }else{
                char ch = str.charAt(0);
                
                if(ch=='+'){
                    int val1 = st.pop();
                    int val2 = st.pop();
                    
                    st.push(val2+val1);
                }else if(ch=='-'){
                    int val1 = st.pop();
                    int val2 = st.pop();
                    
                    st.push(val2-val1);
                }else if(ch=='/'){
                    int val1 = st.pop();
                    int val2 = st.pop();
                    
                    System.out.println(val1+" "+val2);
                    st.push((val2/val1));
                }else if(ch=='*'){
                    int val1 = st.pop();
                    int val2 = st.pop();
                    
                    st.push(val1*val2);
                }
            }
        }
        
        return st.pop();
    }
}