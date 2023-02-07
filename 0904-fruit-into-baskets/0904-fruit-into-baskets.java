class Solution {
    public int totalFruit(int[] nums) {
        if(nums.length==1)return 1;
        HashMap<Integer,Integer>map=new HashMap<>();
        // HashSet<Integer>set=new HashSet<>();
        int i=0,j=0,n=nums.length,count=0,max=0,flag=0;
        
        while(j<n){
            
            while(j<n && map.size()<3){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                j++;
                count++;
            }
            
            if(j==n && map.size()<=2){
                flag=1;
            }
            
            System.out.println(count);
            max=Math.max(count,max);
            
            while(map.size()>2 && i<j){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.getOrDefault(nums[i],0)<=0){
                    map.remove(nums[i]);
                }
                i++;
                count--;
            }
            
        }
        
           if(flag==1 && count>=max)return max;
            //  if(j=n && map.size()<=2){
            //     return Math.max(max,count);
            // }
        
        return max-1;
    }
}