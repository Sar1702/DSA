class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix[0].length;
        int n = matrix.length;
        int matrix2[][] = new int[m][n];
        for(int row = 0 ; row < n ; row++ ){
            for(int col = 0 ; col < m ; col++){
                matrix2[col][row] = matrix[row][col]; 
            }
        }
        return matrix2;
    }
}