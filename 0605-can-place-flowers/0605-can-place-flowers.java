class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(n==0) return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1){
                return true;
            }
            return false;
        }
        
        for(int i=0;i<flowerbed.length && count<n;i++){
            if(i==0 ){
                if( i+1<flowerbed.length && flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    count++;
                }
            }else if(i==flowerbed.length-1 ){
                if(i-1>=0 &&flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    count++;
                }
            }
            else{
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }
            }
        }
        if(count==n)return true;
        
        return false;
    }
}