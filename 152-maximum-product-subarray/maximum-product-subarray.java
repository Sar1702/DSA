class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length; 
        int leftmax = 1; 
        int rightmax= 1; 
        int ans = nums[0];
        for(int i = 0 ; i < n ; i++){
            if(leftmax == 0 ){
                leftmax = 1;
            }
            if(rightmax == 0 ){
                rightmax = 1;
            }

            leftmax *= nums[i];

            rightmax *= nums[n - i - 1];

            ans = Math.max(ans,Math.max(leftmax,rightmax));

        }

        return ans;
    }
}