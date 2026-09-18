class Solution {
    public String mergeAlternately(String word1, String word2) {
    int i = 0 , j = 0 ;
    StringBuilder s = new StringBuilder();
    int n = word1.length();
    int m = word2.length();
     while(i < n && j < m ){
        s.append(word1.charAt(i));
        s.append(word2.charAt(j));
        i++;
        j++;
    }

    while(i < n ){
        s.append(word1.charAt(i++)); 
        
    }
    while(j < m ){
        s.append(word2.charAt(j++));
    }
    return s.toString();
    }
}