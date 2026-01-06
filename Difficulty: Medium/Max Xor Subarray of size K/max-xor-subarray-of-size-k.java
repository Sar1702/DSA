class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (k > n) return 0;

        int currXor = 0;

        // XOR of first window
        for (int i = 0; i < k; i++) {
            currXor ^= arr[i];
        }

        int maxXor = currXor;

        // Sliding window
        for (int i = k; i < n; i++) {
            currXor ^= arr[i - k]; // remove left element
            currXor ^= arr[i];     // add right element
            maxXor = Math.max(maxXor, currXor);
        }

        return maxXor;
    }
}
