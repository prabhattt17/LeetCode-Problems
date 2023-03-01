class Solution {
    public int[] sortArray(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    
    public int[] helper(int[] nums,int low,int high){
        if(low>=high){
            int[] a = new int[1];
            a[0] = nums[low];
            return a;
        }
        
        int mid = (low+high)/2;
        
        int[] left = helper(nums,low,mid);
        int[] right = helper(nums,mid+1,high);
        
        int[] arr = merge(left,right);
        return arr;
    }
    
    public int[] merge(int[] left,int[] right){
        int i = 0 ,j = 0 , k =0;
        int[] ans = new int[left.length+right.length];
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k++] = left[i++];
            }else{
                ans[k++] = right[j++];
            }
        }
        
        while(i<left.length){
            ans[k++] = left[i++];
        }
        while(j<right.length){
            ans[k++] = right[j++];
        }
        
        return ans;
    }
}