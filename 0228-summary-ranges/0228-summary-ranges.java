class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        int start=0,i=0;
        List<String> ans=new ArrayList<>();
            
        while(i<nums.length){
             start=nums[i];
            
            while(i<nums.length-1 && nums[i]+1==nums[i+1])
                i++;
            
            if(start==nums[i]){
                ans.add(nums[i]+"");
                i++;
            }else {
                ans.add(start+"->"+nums[i]);
                i++;
            }
        }
        
        return ans;
    }
}