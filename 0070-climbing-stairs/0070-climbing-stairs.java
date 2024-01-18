class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        // return helper(n);
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i<=n ;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
    
//     public int helper(int n){
//           if(n==0)return 1;
//         if(n<0)return 0;
        
//         if(dp[n]!=0){return dp[n];}
        
//         int ans = 0 ;
//         ans+=helper(n-1);
//         ans+=helper(n-2);
        
//         return dp[n] = ans;
//     }
}