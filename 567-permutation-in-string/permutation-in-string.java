class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length();i++){
            char ch= s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int left = 0 ; 
        int right = s1.length() - 1; 
        while(right < s2.length()){
            HashMap<Character,Integer> window = new HashMap<>();
            for(int i = left ; i <= right ; i++){
                char ch= s2.charAt(i);
                window.put(ch, window.getOrDefault(ch,0)+1);
            }
            if(map.equals(window)){
                return true;
            }
            left++;
            right++;
       }
       return false;
    }
}