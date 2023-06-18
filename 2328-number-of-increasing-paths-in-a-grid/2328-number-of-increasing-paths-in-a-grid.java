class Solution {
   public int countPaths(int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;
        long dp [][] = new long[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++ ){
                if(dp[i][j] == 0) dfs(matrix,i,j,dp);
            }
        }
        long ans = 0;
        long mod = 1000000007;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m; j++){
                ans= ((ans % mod) + (dp[i][j] % mod)) % mod;
            }
        }
        
        return (int)ans;
       
    }
    
    
    
     int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
     public long dfs(int [][] mat , int i , int j , long dp [][]){
        if(dp[i][j] != 0) return dp[i][j];
        long ans = 0;
        for(int k = 0 ; k < dir.length ; k++){
            int row = i+ dir[k][0];
            int col = j + dir[k][1];
            if(row >= 0 && col >= 0 && row < mat.length && col < mat[0].length && mat[row][col] > mat[i][j]){
                ans += dfs(mat,row,col,dp);
            }
        }
         int m=1000000007;
        return dp[i][j] = (ans+1)%m;
    }
}