class Solution {
    public int longestConsecutive(int[] nums) {
        int n =  nums.length;
        Arrays.sort(nums);
        int currmax = 1 ;
        int max = 1 ;
        if(n == 0 ) return 0;
        for(int i = 1  ; i <  n ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] == nums[i-1] + 1){
                currmax++;
            }else{
                max = Math.max(max,currmax);
                currmax = 1 ;
            }

        }
        return Math.max(max,currmax);
    }
}