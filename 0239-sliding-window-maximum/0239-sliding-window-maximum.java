class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
           int i = 0, n = nums.length;
        int[] maxs = new int[n - k + 1];
        TreeMap<Integer, Integer> window = new TreeMap<>();
        for (int j = 0; j < n; j++) {
            window.put(nums[j], window.getOrDefault(nums[j], 0) + 1);
            if (j >= k - 1) {
                maxs[i] = window.lastKey();
                int freqFirst = window.get(nums[i]);
                if (freqFirst == 1) {
                    window.remove(nums[i]);
                } else {
                    window.put(nums[i], freqFirst - 1);
                }
                i++;
            }
        }
        return maxs;

    }
}