class Solution {
public:
    static vector<int> freq;

    static bool compare(char a, char b) {
        if (freq[a] == freq[b])
            return a < b;  // Optional: lexicographic order for same frequency
        return freq[a] > freq[b];  // Higher frequency comes first
    }

    string frequencySort(string s) {
        // Reset the frequency array
        fill(freq.begin(), freq.end(), 0);

        // Count character frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s[i]]++;
        }

        // Sort using our static comparator
        sort(s.begin(), s.end(), compare);

        return s;
    }
};

// Define the static freq vector outside the class
vector<int> Solution::freq(128, 0);
