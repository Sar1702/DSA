class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];
        for(int col = 0 ; col < m ; col++){
            int max = 0 ;
            for(int row = 0 ; row < n ; row++){
                int value = matrix[row][col];
                if(value > max){
                    max = value;
                }
              
            }
             for(int row = 0 ; row < n ; row++){
                int val = matrix[row][col];
                if(val == -1 ){
                    ans[row][col] = max;
                }
                else{
                    ans[row][col] = val;
                }
               }
        }
        return ans;
    }
}