class Solution {
    public int maxSubarraySum(int[] arr, int k) {
         int n = arr.length;
        if (k > n) return -1;

        int windowSum = 0;

        // Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i];       // add next element
            windowSum -= arr[i - k];   // remove element leaving window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}