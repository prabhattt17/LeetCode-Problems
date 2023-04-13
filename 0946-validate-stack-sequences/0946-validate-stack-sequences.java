class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st = new Stack<>();
        int idx = 0;
        for(int i =0;i<pushed.length;i++){
            
            if(pushed[i]!=popped[idx]){
                st.push(pushed[i]);
            }else{
                idx++;
                while(st.size()>0 && idx<popped.length && st.peek()==popped[idx]){
                    st.pop();
                    idx++;
                }
            }
        }
        while(st.size()>0 && idx<popped.length && st.peek()==popped[idx]){
                    st.pop();
                    idx++;
                }
        if(st.size()==0)return true;
        
        return false;
    }
}