class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for(int i :prices){
            if(min1>i){
                min2 = min1;
                min1 = i;
            }else if(min2>i){
                min2 = i;
            }
        }
        
        int ans = money-(min1+min2);
        
        if(ans<0){
            return money;
        }else{
            return money-(min1+min2);
        }
    }
}