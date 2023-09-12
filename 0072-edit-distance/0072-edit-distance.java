class Solution {
    int[][] dp = new int[501][501];
    public int minDistance(String word1, String word2) {
        return helper(word1,word2,word1.length()-1,word2.length()-1);
    }
    
    public int helper(String s1,String s2,int i,int j){
        if(i<0 && j<0)return 0;
        if(i<0){
            return (j+1);
        }
        if(j<0){
            return (i+1);
            
        }
        
        if(dp[i][j]!=0)return dp[i][j];
        
        int ans = 0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=helper(s1,s2,i-1,j-1);
        }else{
            ans=Math.min(helper(s1,s2,i-1,j),(Math.min(helper(s1,s2,i-1,j-1),helper(s1,s2,i,j-1))))+1;
        }
        
        return dp[i][j]=ans;
    }
}