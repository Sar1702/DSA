class Solution {
    public boolean checkPerfectNumber(int num) {
         ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i < num ; i++){
            if(num % i == 0) {
                ls.add(i);
            }
        }
        int result = 0 ;
        for (int divisor : ls) {
         result = result + divisor;
        }
        if(result == num){
            return true;
        }
        else return false;
    }
}