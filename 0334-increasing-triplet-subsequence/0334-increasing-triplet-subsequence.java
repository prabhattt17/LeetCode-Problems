class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        // 20,100,10,12,5,13
        int one=Integer.MAX_VALUE,two=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-1;i++){
            if(one>=nums[i]){
                one=nums[i];
            }else if(two>=nums[i]){
                two=nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}