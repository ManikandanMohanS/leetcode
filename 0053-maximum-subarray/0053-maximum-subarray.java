class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];  // dp[i] stores the max subarray sum ending at i
        dp[0] = nums[0];  // Base case

        int maxSum = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);  // DP transition
            maxSum = Math.max(maxSum, dp[i]);  // Update the maximum sum
        }

        return maxSum;
    }
}
