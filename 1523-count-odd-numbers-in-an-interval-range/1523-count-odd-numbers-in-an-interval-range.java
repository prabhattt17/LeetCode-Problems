class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        
        int total=(high-low-1)+2;
        
        if(total%2==1){
            if(low%2==1){
                count+=(total/2)+1;
            }else{
                count+=(total/2);
            }
        }else{
            count+=(total/2);
        }
        return count;
    }
}