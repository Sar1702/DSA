class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
           int[] ans = new int[k];

        for(int i = 0 ; i < k ; i++){
            int max =0 ;
            int key =0 ;
            for(int x : map.keySet()){
                if(map.get(x) > max){
                    max = map.get(x);
                    key = x;
                }
            }
            
            ans[i] = key;
            map.remove(key);
        }
        return ans;
    }
}