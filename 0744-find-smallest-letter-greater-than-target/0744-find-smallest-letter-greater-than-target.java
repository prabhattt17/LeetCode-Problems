class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch = letters[0];
        
        int i = 0 ,j = letters.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
                
            if(letters[mid]>target){
                ch = letters[mid];
                j = mid-1;
            }else if(letters[mid]<=target){
               i = mid+1;
            }
        }
        return ch;
    }
}