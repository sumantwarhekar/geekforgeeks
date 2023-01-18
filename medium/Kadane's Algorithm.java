class Solution {
    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}