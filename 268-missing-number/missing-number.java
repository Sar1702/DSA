class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x1 = 0;
        int x2 = 0;
        for(int i = 0 ; i < n ; i++){
            x1 ^= (i+1);
            x2 ^= nums[i];
        }
        return x1^x2;
    }
}