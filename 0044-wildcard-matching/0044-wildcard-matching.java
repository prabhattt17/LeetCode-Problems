class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length()+1][s.length()+1];
        
        for(int i = 0;i<dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    if(p.charAt(i-1)=='*'){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    char c1 = p.charAt(i-1);
                    char c2 = s.charAt(j-1);
                    
                    if(c1==c2){
                        dp[i][j] = dp[i-1][j-1];
                    }else if(c1=='?'){
                        dp[i][j] = dp[i-1][j-1];
                    }else if(c1=='*'){
                         dp[i][j]=dp[i-1][j];
                        
                        if(dp[i][j-1]==true){
                            dp[i][j]=true;
                        }
                    }else{
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}


 //   - a  b. c d 
 // - t
 // a   t 
 // *        
 // b
 // c
 // d