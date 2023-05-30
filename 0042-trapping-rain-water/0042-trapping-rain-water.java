class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int sum = 0, max = 0;
        
        for(int i = 0; i<height.length; i++){
            
            while(st.size()>0 && height[st.peek()]<=height[i]){
                int value = height[st.peek()];
                st.pop();
                
                if(st.size()<=0)break;
                
                int prvValue = height[st.peek()];
                int prvIdx = st.peek();
                
                int width = i-prvIdx-1;
                sum+= width*(Math.min(height[i],prvValue)-value);
                max = Math.max(max,sum);
            }
            st.push(i);
        }
        
        return max;
    }
}