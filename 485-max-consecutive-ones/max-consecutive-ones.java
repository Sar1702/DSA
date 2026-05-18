class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0 ;
        int maxone = 0 ;
        for(int i = 0 ; i < n ; i++){
           
            if(nums[i] == 1 ){
                count++;
                 if(count > maxone ) maxone = count ; 
            }
           
            else count = 0 ;
        }
        return maxone ;
    }
}