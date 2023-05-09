class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0 , rowEnd = matrix.length-1 , colStart = 0 , colEnd = matrix[0].length-1 ;
        
        int totalElements = matrix.length*matrix[0].length;
        List<Integer> list = new ArrayList<>();
        
        while(totalElements>0){
            for(int i = colStart; i<=colEnd && totalElements>0; i++){
                list.add(matrix[rowStart][i]);
                totalElements--;
            }
            rowStart++;
            
            for(int i = rowStart; i<=rowEnd && totalElements>0; i++){
                list.add(matrix[i][colEnd]);
                totalElements--;
            }
            colEnd--;
            
            for(int i = colEnd ; i>=colStart && totalElements>0; i--){
                list.add(matrix[rowEnd][i]);
                totalElements--;
            }
            rowEnd--;
            
            for(int i =rowEnd; i>=rowStart && totalElements>0 ; i--){
                list.add(matrix[i][colStart]);
                totalElements--;
            }
            colStart++;
            
            
        }
        
        return list;
    }
}