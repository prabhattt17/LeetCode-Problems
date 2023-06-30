class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
         long A = a, B = b;
        long mod = (long)(Math.pow(10,9)+7);
        
        
        long left = Math.min(a,b), right = (long)n*Math.min(a,b);
        
        long lcm = LCM(a,b);     
		
        while (left < right) {
            long m = left+(right-left)/2;
			
            if ((m / a) + (m / b) - (m / lcm) < n) left = m + 1;   
			
            else right = m;
        }
        return (int)(left % mod);
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