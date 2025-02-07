class Solution {
    public int longestOnes(int[] nums, int k) {
         int left = 0, maxLength = 0, zerosCount = 0;

        for (int right = 0; right < nums.length; right++) {
            // If we encounter a 0, count it
            if (nums[right] == 0) {
                zerosCount++;
            }

            // If zeros exceed k, move the left pointer to reduce zeros
            while (zerosCount > k) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++; // Shrink the window
            }

            // Update the maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}