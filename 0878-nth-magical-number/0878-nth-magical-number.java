class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
         long A = a, B = b;
        long mod = (long)(Math.pow(10,9)+7);
        
        
        long left = Math.min(a,b), right = (long)n*Math.min(a,b);
        
        long lcm = LCM(a,b);     
		
        long ans = 0, low = left, high = right;
        
        while (low<=high) {
            
            long mid = (low+high)/2;
            
            long count = ((mid/a)+(mid/b)-(mid/lcm));
            
            if(count>n){
                high = mid - 1;
            }else if(count<n){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        
        return (int)(ans % mod);
    } 
    
     public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    public int LCM(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}