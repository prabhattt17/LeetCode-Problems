class Solution {
    public int maxProfit(int[] prices) {
     
        int max=Integer.MIN_VALUE;
        int ans=0;
        int price=prices[0];
        
        for(int i=0;i<prices.length;i++){
            
            if(price<prices[i]){
                ans=prices[i]-price;
            }else{
                ans=0;
                price=prices[i];
                
            }
            
            max=Math.max(ans,max);
        }
        return max;
        
        
    }
}