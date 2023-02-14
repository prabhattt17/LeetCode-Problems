class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
         int sum = 0, carry = 0,i=a.length()-1, j = b.length()-1;
        
         while(i>=0 || j>=0){
             sum=carry;
             
             if(j>=0)sum+=b.charAt(j--)-'0';
             if(i>=0)sum+=a.charAt(i--)-'0';
             
             sb.append(sum%2);
             carry = sum/2;
         }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}