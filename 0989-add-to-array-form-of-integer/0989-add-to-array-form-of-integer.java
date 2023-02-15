class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer>list=new ArrayList<>();
        
        int sum=0, carry=0, idx=nums.length-1;
        
        while(k>0 || idx>=0){
            sum=carry;
            
            if(idx>=0)sum+=nums[idx--];
            
            if(k>0){
            sum+=(k%10);
            k/=10;
            }
            
            list.add(sum%10);
            carry=sum/10;
        }
        
        if(carry!=0){
            list.add(carry);
        }
        
        Collections.reverse(list);
        return list;
    }
}