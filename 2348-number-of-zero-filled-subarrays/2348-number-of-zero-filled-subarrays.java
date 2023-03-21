class Solution {
    public long zeroFilledSubarray(int[] nums) {
      long ans = 0, count = 0;
        
        for(int n:nums){
            if(n == 0){
                count++;
            }else{
                 ans+=(count*(count+1))/2;
                 count = 0;
            }
        }
          ans+=(count*(count+1))/2;
        
        return ans;
    }
}