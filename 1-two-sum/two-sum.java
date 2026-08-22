class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mAp = new HashMap<>();
        for(int i = 0 ; i < n ; i++ ){
            int remaining = target - nums[i];
            if(mAp.containsKey(remaining)){
                return new int[]{mAp.get(remaining),i};
            }
            mAp.put(nums[i], i );
        }
        return new int[]{};
    }
}