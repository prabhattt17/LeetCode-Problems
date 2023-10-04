class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        int low = 0, high = nums.length - 1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(mid==0){
                if(nums[mid+1]!=nums[mid])return nums[mid];
            }else if(mid==nums.length-1){
                if(nums[mid]!=nums[mid-1])return nums[mid];
            }else{
                if(nums[mid+1]!=nums[mid] && nums[mid]!=nums[mid-1])return nums[mid];
            }
            
            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]!=nums[mid-1]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}