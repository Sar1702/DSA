class Solution {
    public int matrixSum(int[][] nums) {
         for(int[] row:nums){
            Arrays.sort(row);
        }
        int sum = 0;
        int n = nums.length;
        int m = nums[0].length;
        for(int col = 0 ; col < m ; col++){
            int max = 0;
            for(int row = 0 ; row < n ; row++){
                if(nums[row][col] > max){
                    max = nums[row][col];
                }
                
            }
             sum += max;
        } 
        return sum;
    }
}