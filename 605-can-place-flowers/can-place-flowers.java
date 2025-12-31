class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length-1;
        if(n== 0) return true;
        for(int i = 0 ; i <= k ; i++){
            if(flowerbed[i]==0){
               int  left = 0;
                int right = 0;
            if(i>0){
                left = flowerbed[i-1];
            }
            if(i<k){
                right = flowerbed[i+1];
            }
            if(left == 0 && right == 0){
                flowerbed[i]=1;
                n--;
            }
            if(n==0){
                return true;
            }

            }
        }
        
        return false;
    }
}