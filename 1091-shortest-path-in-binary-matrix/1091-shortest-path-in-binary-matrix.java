class Solution {
    class pair{
        int i;
        int j;
        int lvl;
        pair(int i,int j,int lvl){
            this.i=i;
            this.j=j;
            this.lvl=lvl;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1)return -1;
        int n=grid.length-1,m=grid[0].length-1;
        Queue<pair>q=new ArrayDeque<>();
        q.add(new pair(0,0,0));
        
        while(q.size()!=0){
            pair p=q.remove();
            
            if(p.i==grid.length-1 && p.j==grid[0].length-1){
                return p.lvl+1;
            }
            
            if(p.j+1<=m && grid[p.i][p.j+1]==0){
            q.add(new pair(p.i,p.j+1,p.lvl+1));
            grid[p.i][p.j+1]=1;
            }    
            if(p.j-1>=0 && grid[p.i][p.j-1]==0){
            q.add(new pair(p.i,p.j-1,p.lvl+1));
            grid[p.i][p.j-1]=1;}                                
            if(p.i+1<=n && p.j+1<=m && grid[p.i+1][p.j+1]==0){
            q.add(new pair(p.i+1,p.j+1,p.lvl+1));
            grid[p.i+1][p.j+1]=1;
            }
            if(p.i+1<=n && p.j-1>=0 && grid[p.i+1][p.j-1]==0){
            q.add(new pair(p.i+1,p.j-1,p.lvl+1));
            grid[p.i+1][p.j-1]=1;}
            if(p.i+1<=n && grid[p.i+1][p.j]==0)
            {
             q.add(new pair(p.i+1,p.j,p.lvl+1));
             grid[p.i+1][p.j]=1;}
            if(p.i-1>=0 && p.j-1>=0 && grid[p.i-1][p.j-1]==0){
              q.add(new pair(p.i-1,p.j-1,p.lvl+1));
              grid[p.i-1][p.j-1]=1;}
            if(p.i-1>=0 && p.j+1<=m && grid[p.i-1][p.j+1]==0)
            {q.add(new pair(p.i-1,p.j+1,p.lvl+1));
               grid[p.i-1][p.j+1]=1;}
            
            if(p.i-1>=0 && grid[p.i-1][p.j]==0){
             q.add(new pair(p.i-1,p.j,p.lvl+1));
             grid[p.i-1][p.j]=1;
            }
    } 
           
        
     
        return -1;   
    }
}