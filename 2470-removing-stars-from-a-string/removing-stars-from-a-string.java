import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>() ;
         StringBuilder ans = new StringBuilder();
         for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
         }
            while(!st.isEmpty()){
                ans.append(st.pop());
            }
            return ans.reverse().toString();
         }
};