class Solution {
    public int[][] diagonalSort(int[][] mat) {
       int n = mat.length;
       int m = mat[0].length;
       for(int col = 0 ; col < m ; col++){
            sort(mat,0,col,n,m);
       } 
       for(int row = 1 ; row < n ; row++){
            sort(mat,row,0,n,m);
       }
       return mat;
    }
    public void sort(int[][] mat , int row , int col , int n , int m ){
        List<Integer> values = new ArrayList<>();
        int r = row, c = col;
        while(r < n && c < m){
            values.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(values);
        int ind = 0 ;
         r = row;
         c = col;
        while(r < n && c < m){
            mat[r][c] = values.get(ind++);          
            r++;
            c++;
        }
    }
}