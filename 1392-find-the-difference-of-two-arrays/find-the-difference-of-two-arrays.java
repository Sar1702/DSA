class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            set2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for( int num : set1 ){
            if(!set2.contains(num)){
                l1.add(num);
            }
        }
        
        for( int num : set2 ){
            if(!set1.contains(num)){
                l2.add(num);
            }
        }

        return Arrays.asList(l1, l2);
    }
}