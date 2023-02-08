class Solution {
    public int jump(int[] nums) {
        int[] dp =new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[nums.length-1]=0;
        
        for(int i=nums.length-2;i>=0;i--){
            for(int jump=1;jump<=nums[i];jump++){
                if(jump+i<nums.length && dp[jump+i]!=Integer.MAX_VALUE)
                 dp[i]=Math.min(dp[i],dp[jump+i]+1);
            }
        }
        
        return dp[0];
    }
}