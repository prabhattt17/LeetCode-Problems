class Solution {
    public int diagonalSum(int[][] mat) {
        int rowStart = 0 , rowEnd = mat.length-1, colStart = 0 , colEnd = mat[0].length-1;
        
        int sum = 0 ;
        
        while(rowStart<mat.length){
            
             if(colStart!=colEnd){
                 sum+=mat[rowStart][colStart++]+mat[rowStart++][colEnd--];
             }else{
                 sum+=mat[rowStart++][colEnd--];
                 colStart++;
             }
        }
        
        
        return sum;
    }
}