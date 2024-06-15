class Solution {
    int max;
    public int lengthOfLIS(int[] nums) {
        max = 1;
        // helper(nums,Integer.MIN_VALUE,0,0);
        int[] dp = new int[nums.length];
        
        dp[0] = 1;
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length; i++){
            int count = 0;
            for(int j = 0 ; j<i ; j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    
//     public void helper(int[] nums, int prev, int idx, int count){
//         if(idx>nums.length)return;
        
//         max = Math.max(count,max);
//         if(idx<nums.length && nums[idx]>prev){
//             helper(nums,nums[idx],idx+1,count+1);
//         }
//         dp[idx][]
//         helper(nums,prev,idx+1,count);
//     }
}