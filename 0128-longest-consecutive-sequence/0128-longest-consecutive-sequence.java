import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int c_max = 1, o_max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue; // Ignore duplicates

            if (nums[i] - nums[i - 1] == 1) {
                c_max++;
            } else {
                o_max = Math.max(o_max, c_max);
                c_max = 1; // Reset count
            }
        }

        return Math.max(o_max, c_max);
    }
}
