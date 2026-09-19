class Solution {
    public int sqr(int x){
        return x * x ; 
    }
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++){
           arr[i] = sqr(nums[i]);
      }  
       Arrays.sort(arr);
       return arr;
    } 
}