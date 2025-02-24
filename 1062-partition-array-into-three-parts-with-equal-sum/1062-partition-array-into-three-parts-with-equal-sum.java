class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;

        // Step 1: Compute total sum of array
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Check if total sum is divisible by 3
        if (totalSum % 3 != 0) {
            return false;
        }

        int targetSum = totalSum / 3;  // Each partition should sum to this value
        int currentSum = 0;
        int partitionCount = 0;

        // Step 3: Iterate through the array and find partitions
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // If we found a partition, reset sum and increment count
            if (currentSum == targetSum) {
                partitionCount++;
                currentSum = 0;

                // We need exactly three partitions
                if (partitionCount == 2 && i < arr.length - 1) {
                    return true;
                }
            }
        }

        return false; // If we couldn't find three valid partitions
    }
}
