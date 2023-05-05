class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0, max = 0;
        
        for(int i = 0; i<k ; i++){
            char ch = s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            
            sb.append(ch);
        }
        
        max = Math.max(max,count);

        int j = 0;
        
        for(int i = k; i<s.length(); i++){
            char c1 = sb.charAt(j++);
            char c2 = s.charAt(i);
            
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'){
                count--;
            }
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'){
                count++;
            }
            
            System.out.println(i+" "+j+" "+c1+" "+c2+" "+count);
            max = Math.max(max,count);
            sb.append(c2);
        }
        
        return max;
    }
}