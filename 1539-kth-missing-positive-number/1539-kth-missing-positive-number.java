class Solution {
    public int findKthPositive(int[] nums, int k) {
        int[] arr = new int[1001];
        
        for(int n:nums){
            arr[n]++;
        }
        
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0)count++;
            if(count==k)return i;
        }
        
        System.out.println("n");
        return nums.length+k;
    }
}