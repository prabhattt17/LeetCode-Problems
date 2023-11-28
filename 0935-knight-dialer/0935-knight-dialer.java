class Solution {
    Integer[][] dp = new Integer[5005][10];
     int mod = (int)(Math.pow(10,9)+7);
    
    public int knightDialer(int n) {
        int[][] arr = {{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
        
        int ans = 0;
        for(int i = 0; i<=9 ; i++){
         ans=(ans+helper(n-1,i,arr))%mod;  
        }
        
        return ans;
    }
    
    public int helper(int n ,int pos, int[][] arr){
        if(n==0)return 1;
        
        if(dp[n][pos]!=null){
            return dp[n][pos];
        }
        
        int res = 0;
        for(int nextPos:arr[pos]){
            // System.out.println(pos+" "+nextPos);
            res=(res+helper(n-1,nextPos,arr))%mod;
        }
        
        return dp[n][pos]=res;
    }
}