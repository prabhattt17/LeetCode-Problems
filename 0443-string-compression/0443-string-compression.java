class Solution {
    public int compress(char[] chars) {
        
        int idx = 0,i = 0 ,j = 0,count = 0;
        List<Character>list =  new ArrayList<>();
        
        while(j<chars.length){
            count = 0;
             while(j<chars.length && chars[i]==chars[j]){
                 j++;
                 count++;
             }
            
            list.add(chars[i]);
            // System.out.println(count);
            if(count>1 && count<10){
                list.add((char)(count+'0'));
            }else if(count>=10 && count<100){
                // System.out.println(count);
                list.add((char)((count/10)+'0'));
                list.add((char)((char)((count%10)+'0')));
            }else if(count>=100 && count<1000){
                list.add((char)((count/100)+'0'));
                list.add((char)((char)((count%100)+'0')));
                list.add((char)((char)((count%100)+'0')));
            }else if(count>=1000){
                list.add((char)((count/1000)+'0'));
                list.add((char)((char)((count%1000)+'0')));
                list.add((char)((char)((count%1000)+'0')));
                list.add((char)((char)((count%1000)+'0')));
            }
            i=j;
        }
                         
        for(int k = 0;k<list.size() ;k++){
            chars[k] = list.get(k);
        }
                         
        return list.size();
    }
}