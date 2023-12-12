class Solution {
    public int maxSubArray(int[] nums) {
     int ans = 0,max = Integer.MIN_VALUE;
        
     for(int i = 0;i<nums.length; i++){
         ans+=nums[i];
         
         if(nums[i]>ans){
             ans = nums[i];
         }
         
         max = Math.max(max,ans);
     }
        return max;
    }
}