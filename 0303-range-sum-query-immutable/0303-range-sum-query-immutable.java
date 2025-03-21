class NumArray {
    private int[] prefix; // Declare the prefix array

    public NumArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return; // Handle edge case where nums is empty
        
        prefix = new int[n]; // Initialize the prefix array
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + nums[i];
    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right]; 
        return prefix[right] - prefix[left - 1]; 
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */