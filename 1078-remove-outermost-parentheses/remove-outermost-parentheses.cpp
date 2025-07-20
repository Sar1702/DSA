class Solution {
public:
    string removeOuterParentheses(string s) {
        int c1 = 0 ,c2 = 0 ;
        string out ;

        for (int i = 0 ; i < s.size() ; i++){
            if (s[i]=='('){
                c1++;
            }
            else { c2++;  }

            if(c1 == c2 ){
                c1 = 0;
                c2 = 0 ;
            }
            if(c1 != c2 && c1 != 1){
                out += s[i];
            }
        }
        return out;
    }
};