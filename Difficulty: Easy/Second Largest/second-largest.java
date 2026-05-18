class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = -1;
        int max2 = -1 ;
        for(int i = 0 ; i < n ; i++){
            if(max < arr[i]){
            max2 = max;
            max = arr[i];
            }
             else if(arr[i] < max && arr[i] > max2){
                max2 = arr[i];
            }
            
        }
        return max2;
    }
}