class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length ; 
        int mini = (n/3) + 1 ;
        List<Integer> ls = new ArrayList<>();
        Map<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i< n; i++){
            int num = nums[i];
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }

            if(map.get(num) == mini){
                ls.add(num);
            }
            if(ls.size() == 2 )
            break;
        }
        return ls;
    }
}