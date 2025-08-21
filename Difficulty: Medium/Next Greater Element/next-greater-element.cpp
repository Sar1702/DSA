class Solution {
  public:
    vector<int> nextLargerElement(vector<int>& arr) {
        // code here
        stack<int>s;
        vector<int> ans(arr.size(),0);
        for(int i = arr.size()-1;i >= 0 ; i--){
            while(s.size() > 0 && s.top()<=arr[i]){
                s.pop();
            }
            if(s.empty()){
                ans[i]= -1;
            }
            else{
                ans[i] = s.top();
            }
            s.push(arr[i]);
        }
        return ans;
    }
};