class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        if(k==0)return nums;
        long[] preSum = new long[nums.length];
        long[] postSum = new long[nums.length];
        
        for(int i = 0; i<nums.length; i++){
            if(i==0){
                preSum[i] = nums[i];
            }else{
                preSum[i] = nums[i]+preSum[i-1];
            }
        }
        
        for(int i = n-1 ; i>=0 ; i--){
            if(i==n-1){
                postSum[i] = nums[i];
            }else{
                postSum[i] = nums[i]+postSum[i+1];
            }
        }
        
        int[] ans = new int[n];
        
        Arrays.fill(ans,-1);
        if(k>n)return ans;
        
        for(int i = k; i<n-k; i++){
            if(i==k && i==n-k-1){
                                ans[i] = Math.max(ans[i],(int)((preSum[i]+(postSum[i+1]-postSum[i+k]))/(k*2+1)));

            }else if(i==k){
                ans[i] = Math.max(ans[i],(int)((preSum[i]+(postSum[i+1]-postSum[i+k+1]))/(k*2+1)));
                System.out.println(ans[i]);
            }else if(i==n-k-1){
                ans[i] = (int)((postSum[i+1]+(preSum[i]-preSum[i-k-1]))/(k*2+1));
            }else{
                ans[i] = (int)(((preSum[i]-preSum[i-k-1])+(postSum[i+1]-postSum[i+k+1]))/(k*2+1));
            }
        }
        return ans;
    }
}