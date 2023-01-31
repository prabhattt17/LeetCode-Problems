class Solution {
    class pair{
        int val;
        int age;
        pair(int val,int age){
            this.age=age;
            this.val=val;
        }
    }
    
    public int bestTeamScore(int[] scores, int[] ages) {
        pair[] arr=new pair[ages.length];
           for(int i=0;i<ages.length;i++){
               arr[i]=new pair(scores[i],ages[i]);
           }  
        Arrays.sort(arr,(a,b)->(a.age==b.age)?a.val-b.val:a.age-b.age);
       
        int[] dp=new int[ages.length];
        dp[0]=arr[0].val;
        int max=dp[0];
        
        for(int i=1;i<ages.length;i++){
            dp[i]=arr[i].val;
            for(int j=0;j<i;j++){
                if(arr[i].val>=arr[j].val){
                    dp[i]=Math.max(dp[i],dp[j]+arr[i].val);
                }
            }
            max=Math.max(max,dp[i]);
        }
        
        return max;
    }
}