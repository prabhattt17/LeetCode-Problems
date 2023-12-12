class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        
        int buy = prices[0], ans = 0;
        
        for(int i = 1 ;i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                ans = Math.max(ans,(prices[i]-buy));
            }
        }
        return ans;
    }
}