class Solution {
    class pair{
        int i;
        int j;
        int step;
        pair(int i,int j,int step){
            this.i=i;
            this.j=j;
            this.step=step;
        }
    }
    
    public int maxDistance(int[][] grid) {
            Queue<pair>q = new ArrayDeque<>();
            int n=grid.length;
        
        int zero=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    q.add(new pair(i,j,0));
                }else{
                    zero++;
                }
            }
        }
        
        if(zero==0)return -1;
        int res=-1,ans=0;
        while(q.size()!=0){
            pair p=q.remove();
            res=Math.max(res,p.step);
            
            if(p.i+1<n && grid[p.i+1][p.j]==0){
                q.add(new pair(p.i+1,p.j,p.step+1));
                grid[p.i+1][p.j]=1;
            }
            if(p.i-1>=0 && grid[p.i-1][p.j]==0){
                q.add(new pair(p.i-1,p.j,p.step+1));
                grid[p.i-1][p.j]=1;
            }
            if(p.j+1<n && grid[p.i][p.j+1]==0){
                q.add(new pair(p.i,p.j+1,p.step+1));
                grid[p.i][p.j+1]=1;
            }
            if(p.j-1>=0 && grid[p.i][p.j-1]==0){
                q.add(new pair(p.i,p.j-1,p.step+1));
                grid[p.i][p.j-1]=1;
            }
        }
        
        return res;
    }
}