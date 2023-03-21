class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int[] ans = new int[nums.length];
        int count = 0;
        for(int i = 2;i<nums.length;i++){
            if((nums[i]-nums[i-1])==(nums[i-1]-nums[i-2])){
                ans[i]+=ans[i-1]+1;
                count+=ans[i];
            }
        }

    
        return count;
    }
}