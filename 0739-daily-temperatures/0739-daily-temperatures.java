class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        
        int ans[] = new int[n];
        int idx = n-1;
        
        for(int i = n-1; i>=0; i-- ){
            while(st.size()>0 && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            
            if(st.size()==0){
                ans[idx--] = 0;
            }else{
                ans[idx--] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}