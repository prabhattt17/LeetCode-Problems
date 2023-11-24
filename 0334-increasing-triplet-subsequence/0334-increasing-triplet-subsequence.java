class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)return false;
        
        int[] s=new int[nums.length];
        int[] b=new int[nums.length];
        
        int min=0;
        int max=0;//Integer.MIN_VALUE;
        
        s[0]=nums[0];
        min=s[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                s[i]=min;
                System.out.println(s[i]);
            }else{
                s[i]=nums[i];
                min=nums[i];
            }
        }    
        
        b[b.length-1]=nums[b.length-1];
        max=b[b.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<max){
                
                b[i]=max;
                System.out.println(s[i]);
            }else{
                b[i]=nums[i];
                max=nums[i];
            }
        }   
        
        for(int i=1;i<nums.length-1;i++){

        if(nums[i]>s[i] && nums[i]<b[i])return true;
        }
        
        return false;
    }
}