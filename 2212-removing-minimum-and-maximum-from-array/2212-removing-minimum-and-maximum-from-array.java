class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int ind_max = -1;
        int ind_min = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maxi) {
                ind_max = i;
                maxi = nums[i];
            }
            if (nums[i] < mini) {
                ind_min = i;
                mini = nums[i];
            }
        }

        int x = Math.min(ind_max, ind_min);
        int y = Math.max(ind_max, ind_min);

        return Math.min(Math.min(y + 1, n - x), x + 1 + n - y);
    }
}