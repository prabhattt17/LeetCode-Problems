class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> lists = new ArrayList<>();
        
        for(int i = 0; i<numCourses; i++){
            lists.add(new ArrayList<>());
        }
        
        for(int[] arr:prerequisites){
            int courseNum = arr[0];
            int coursePre = arr[1];
            
            lists.get(arr[0]).add(arr[1]);
        }
        
        int[] visited = new int[numCourses];
        
        for(int i = 0; i<numCourses; i++){
            if(visited[i]==0){
                if(Dfs(lists,i,visited)==false)return false;
            }
        }
        
        return true;
    }
    
    public boolean Dfs(List<List<Integer>> graph , int node , int[] visited){
        if(visited[node]==2)return true;
        if(visited[node]==1)return false;
        
        visited[node] = 1;
        for(int n:graph.get(node)){
            if(Dfs(graph,n,visited)==false)return false;
        }
        visited[node] = 2;
        return true;
    }
}