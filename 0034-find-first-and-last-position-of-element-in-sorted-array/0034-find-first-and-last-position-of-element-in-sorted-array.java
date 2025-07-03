class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1) {
                    arr[0] = i;  // first time found
                }
                arr[1] = i;      // always update last seen
            } else if (nums[i] > target) {
                break; // since sorted, no need to continue
            }
        }

        return arr;
    }
}
