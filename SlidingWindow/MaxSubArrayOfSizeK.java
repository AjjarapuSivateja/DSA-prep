package SlidingWindow;

public class MaxSubArrayOfSizeK {
    //GeeksForGeeks-https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int n = arr.length;
        if (n < k) return 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
