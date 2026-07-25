class Solution {
    public int romanToInt(String s) {
        int res = 0 ;
        Map<Character , Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int n = s.length();
        for(int i = 0 ; i< n ; i++){
            if(i < n-1 &&roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                res -= roman.get(s.charAt(i));
            }
            else{
                     res += roman.get(s.charAt(i));
           
            }
        }
        return res ;
    } 
}