class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0 ;
        int maxalt = 0 ;
        int n = gain.length;
        for(int i = 0 ; i < n ; i++){
         current = current + gain[i];
         if(current > maxalt){
            maxalt = current;
         }
            

        }
        return maxalt;
    }
}