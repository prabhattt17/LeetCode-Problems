class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer>list=new ArrayList<>();
        int idx1=0,idx2=n;
        
        for(int i=0;i<n*2;i++){
            if(i%2==0){
                list.add(nums[idx1++]);
            }else{
                list.add(nums[idx2++]);
            }
        }
        for(int i=0;i<n*2;i++){
            nums[i]=list.get(i);
        }
        return nums;
    
//         int temp1=-1,temp2=-1,idx=n;
        
//         for(int i=1;i<nums.length;i++){
//             if(i%2==1){
//                 temp1=nums[i];
//                 nums[i]=nums[idx++];
//             }else{
//                 temp2=nums[i];
//                 nums[i]=temp1;
//                 temp1=temp2;
//             }
//         }
//         return nums;
    }
}