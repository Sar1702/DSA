class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int profit = 0;

        for (int i = 0, minPrice = prices[0]; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int currProfit = prices[i] - minPrice;
            if (currProfit > profit) {
                profit = currProfit;
            }
        }

        return profit;
    }
};
