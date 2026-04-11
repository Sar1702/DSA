class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int num = Math.abs(nums[i]);
            if(num < min){
                min = num;
                result = nums[i];
            }
           else if(num == min){
                if(nums[i] > result){
                    result = nums[i];
                }
           }
        } 
        return result ;
    }
}