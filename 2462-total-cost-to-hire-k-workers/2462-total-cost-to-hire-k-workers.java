class Solution {
    class pair{
        int val;
        int idx;
        int flag;
        pair(int val,int idx,int flag){
            this.val=val;
            this.idx=idx;
            this.flag=flag;
        }
    }
    
    public long totalCost(int[] nums, int k, int candidates) {
       if(nums.length==1)return nums[0];
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->(a.val==b.val)?a.idx-b.idx:a.val-b.val);
        
        int i=0,j=nums.length-1,n=nums.length;
        long sum=0;
        
        while(i<j && i<=candidates && j>=n-candidates){
              // System.out.println(nums[i]+" "+nums[j]);
            pq.add(new pair(nums[i],i,0));
            pq.add(new pair(nums[j],j,1));
            i++;
            j--;
        }
        
        while(k -->0 && pq.size()>0){
            pair p=pq.remove();
            sum+=p.val;
            if(p.flag==0 && i<=j){
                pq.add(new pair(nums[i],i,0));
                i++;
            }else if(p.flag==1 && j>=i){
                pq.add(new pair(nums[j],j,1));
                j--;
            }
        }
        return sum;
    }
}