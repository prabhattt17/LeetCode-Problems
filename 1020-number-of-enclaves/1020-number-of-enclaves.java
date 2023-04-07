class Solution {
    public int numEnclaves(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            if(grid[0][i]==1 && visited[0][i]==false){
                helper(grid,0,i,visited);
            }
            if(grid[grid.length-1][i]==1 && visited[grid.length-1][i]==false){
                helper(grid,grid.length-1,i,visited);
            }
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==1 && visited[i][0]==false){
                helper(grid,i,0,visited);
            }
            if(grid[i][grid[0].length-1]==1 && visited[i][grid[0].length-1]==false){
                helper(grid,i,grid[0].length-1,visited);
            }
        }
        
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    
    public void helper(int[][] grid,int row,int col,boolean[][] visited){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1 || grid[row][col]==0 || visited[row][col]==true){
            return;
        }
        visited[row][col]=true;
        grid[row][col]=0;
        helper(grid,row+1,col,visited);
        helper(grid,row-1,col,visited);
        helper(grid,row,col+1,visited);
        helper(grid,row,col-1,visited);
    }
}