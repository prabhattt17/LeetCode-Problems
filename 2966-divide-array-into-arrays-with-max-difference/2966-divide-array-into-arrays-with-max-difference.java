class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length/3][3];
        
        int idx = 0,m = 0, j = 0,count = 1;
        
        while(idx<nums.length){
            
            int min = nums[idx];
            int n = 3*count;
            
            System.out.println(n);
           for(int i = idx; i<n ; i++){
               if((nums[i]-min)<=k){
                   ans[j][m++] = nums[i];
                   // System.out.println(ans[j][m++]);
               }else{
                   return new int[0][0];
               }
           }
            j++;
            m = 0;
           idx = count*3;
           count++;
        }
        
        return ans;
    }
}