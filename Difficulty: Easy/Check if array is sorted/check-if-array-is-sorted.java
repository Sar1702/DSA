class Solution {
    public boolean isSorted(int[] arr) {
        int n = arr.length;
        int i = 0 ;
        while(i < n - 1){
            if(arr[i] < arr[i+1] || arr[i] == arr[i+1]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
        
    }
}