class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length-k+1];
        
        for(int i = 0; i<k ; i++){
            while(dq.size()>0 && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
        }
        
        int idx = 0;
        ans[idx++] = nums[dq.peek()];
        
        for(int i = k ; i<nums.length ; i++){
            while(dq.size()>0 && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
            
            
            if(dq.peek()<=i-k){
                dq.removeFirst();
            }
            
            ans[idx++] = nums[dq.peek()];
        }
        
        return ans;
    }
}