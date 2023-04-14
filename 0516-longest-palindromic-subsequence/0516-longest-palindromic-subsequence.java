class Solution {
    int[][] dp = new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        if(s.length()==1)return 1;
        return helper(s,0,s.length()-1);
    }
    
    public int helper(String s, int i, int j){
        if(i>j)return 0;
        if(i==j)return 1;
        
        if(dp[i][j]!=0)return dp[i][j];
        int max = 0;
        if(s.charAt(i)==s.charAt(j)){
            max+=helper(s,i+1,j-1)+2;
        }else{
            max+=Math.max(helper(s,i+1,j),helper(s,i,j-1));
        }
        return dp[i][j]=max;
    }
}