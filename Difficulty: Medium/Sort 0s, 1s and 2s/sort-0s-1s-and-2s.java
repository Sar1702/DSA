class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        int zerocount = 0;
        int onecount = 0 ;
        int twocount = 0 ;
        for(int i = 0 ; i < n ; i++  ){
            if(arr[i] == 0 ){
                zerocount++;
            }
            if(arr[i] == 1 ){
                onecount++;
            }
            if(arr[i] == 2 ){
                twocount++;
            }
        }
        int index = 0 ;
        while (zerocount-- > 0){
            arr[index++] = 0;
        }
         while (onecount-- > 0){
            arr[index++] = 1;
        }
         while (twocount-- > 0){
            arr[index++] = 2;
        }
    }
}