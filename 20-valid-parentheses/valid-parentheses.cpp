class Solution {
public:
    bool isValid(string s) {
        stack<char> stk;
        char curr; 
        for(char c : s){
            if(c == '(' || c == '['|| c == '{'){
                stk.push(c);
            }
            else{
                if(stk.empty()) return false;
                curr = stk.top();
                stk.pop();
                if(curr == '(' && c != ')' ) return false;
                else if(curr == '[' && c != ']') return false ;
                else if(curr == '{' && c != '}') return false ;

            }
            
        }

        return stk.empty();
    }
};