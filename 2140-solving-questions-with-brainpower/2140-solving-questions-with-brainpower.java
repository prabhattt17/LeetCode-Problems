class Solution {
    long max = 0;
    long[] dp = new long[(int)Math.pow(10,5)+1];
    public long mostPoints(int[][] questions) {
       Arrays.fill(dp,-1);
        return helper(questions,0);

    }
    
    public long helper(int[][] questions , int idx){
        if(idx>=questions.length)return 0;
        
        if(dp[idx]!=-1)return dp[idx];
        
        long select = helper(questions,idx+questions[idx][1]+1)+questions[idx][0];
        long notSelect = helper(questions,idx+1);
        
        return dp[idx]=Math.max(select, notSelect);
    }
}