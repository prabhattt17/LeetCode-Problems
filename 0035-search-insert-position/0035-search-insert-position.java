class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])return 0;
        if(target>nums[nums.length-1])return nums.length;
        int low = 0 , high = nums.length-1, idx = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(nums[mid]== target)return mid;
            
            System.out.println(nums[mid]);
            if(nums[mid]>target)high=mid-1;
            else if(nums[mid]<target)low=mid+1;
            
            idx = mid;
        }
        return (nums[idx]<target)?idx+1:idx;
    }
}