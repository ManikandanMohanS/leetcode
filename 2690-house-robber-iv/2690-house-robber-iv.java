class Solution {
    private static final int MAX = 1_000_000_001;
    
    public int minCapability(int[] nums, int k) {
        return binSearch(nums, k, 1, MAX);
    }
    
    private boolean check(int[] nums, int k, int value) {
        int n = nums.length;
        int prev = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            int next = current;
            if (nums[i] <= value) {
                next = Math.max(current, prev + 1);
            }
            prev = current;
            current = next;
        }
        return current >= k;
    }
    
    private int binSearch(int[] nums, int k, int left, int right) {
        if (left >= right) return right;
        int mid = left + (right - left) / 2;
        return check(nums, k, mid)
                ? binSearch(nums, k, left, mid)
                : binSearch(nums, k, mid + 1, right);
    }
}