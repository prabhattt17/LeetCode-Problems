class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i = s.length()-1; i>=0;i--){
            char ch = s.charAt(i);
            
            if(ch=='*'){
                count++;
            }else{
            if(count==0 && s.charAt(i)!='*'){
                sb.insert(0,ch);
            }else{
                count--;
            }}
            // if(ch=='*'){
            //     int count = 0;
            //     while(i>=0 && s.charAt(i)=='*'){
            //         i--;
            //         count++;
            //     }
            //     while(i>=0 && count!=0 && s.charAt(i)!='*'){
            //         i--;
            //         count--;
            //     }
            //     System.out.println(count);
            // }else{
            //     sb.insert(0,ch);
            //     i--;
            // }
        }
        return sb.toString();
    }
}