class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";  // base case: empty vector

        int n = strs.size();
        
        // base case: any empty string
        for (int i = 0; i < n; i++) {
            if (strs[i].empty()) return "";
        }

        sort(strs.begin(), strs.end());
        string a = strs[0], b = strs[n - 1], ans = "";

        for (int i = 0; i < min(a.size(), b.size()); i++) {
            if (a[i] == b[i]) {
                ans += a[i];
            } else {
                break;
            }
        }

        return ans;
    }
};
