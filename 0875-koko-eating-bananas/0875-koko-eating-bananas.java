class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     long low=1, high = 0;
        for(int n:piles){
            high=Math.max(n,high);
        }
        
        long k = high;
        while(low<=high){
            long mid = (low+high)/2;
            long count = 0;
            
            for(int n: piles){
                count+=(int)Math.ceil(n/(mid*1.0));
            }
            
            if(count<=h){
                k = Math.min(k,mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)k;
    }
}