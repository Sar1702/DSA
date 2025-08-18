class Solution {
  public:
    int hIndex(vector<int>& citations) {
        sort(citations.begin(),citations.end());
        int n = citations.size();
        int h = 0 ;
        for(int i = 0 ; i < n ; i ++ ){
            int paper = n-i ;
            if(citations[i] >= paper){
                h = max(h , paper );
            }
        }
        return h;
        
    }
};