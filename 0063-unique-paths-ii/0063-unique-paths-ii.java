class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int m = grid.length, n = grid[0].length;
        if(grid[m-1][n-1]==1)return 0;
        dp[m-1][n-1]=1;
        
        for(int i = m-1; i>=0; i--){
            for(int j = n-1; j>=0; j--){
                if(i==0 && j == 0){
                    break;
                }else if(i==0){
                  if(grid[i][j-1]==0){
                      dp[i][j-1]+=dp[i][j];
                  }
              }else if(j==0){
                  if(grid[i-1][j]==0){
                      dp[i-1][j]+=dp[i][j];
                  }
              }else{
                  if(grid[i][j-1]==0){
                      dp[i][j-1]+=dp[i][j];
                  }
                  if(grid[i-1][j]==0){
                      dp[i-1][j]+=dp[i][j];
                  }
              }
            }
        }
        return dp[0][0];
    }
}