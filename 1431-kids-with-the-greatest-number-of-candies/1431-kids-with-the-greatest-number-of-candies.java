class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        
        int max = 0;
        for(int n:candies){
            max = Math.max(max,n);
        }
        
        for(int n:candies){
            if(n+extraCandies>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        
        return list;
    }
}