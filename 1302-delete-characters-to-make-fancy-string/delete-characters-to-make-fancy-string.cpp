class Solution {
public:
    string makeFancyString(string s) {
        string result ;
        int cnt = 1 ;
        for(int i = 1 ; i< s.size(); i++){
            if(s[i] == s[i-1]){
                cnt++;
            }
            else{
                cnt = 1;
            }

            if(cnt < 3 ){
                result += s[i-1];
            }
        }
        result += s.back();
        return result;
    }
};