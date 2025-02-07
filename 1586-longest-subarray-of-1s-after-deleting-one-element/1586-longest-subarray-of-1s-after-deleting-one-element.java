class Solution {
    public int longestSubarray(int[] nums) {
         int n = nums.length;

        int count = 0;
        int prev = 0;
        int ans = 0;

        for(int i =0;i<nums.length;i++) {
             if(nums[i] == 1) {
                count++;
             }else {
                ans = Math.max(ans, count + prev);
                prev = count;
                count = 0;
             }
        }
           ans = Math.max(ans, count + prev);
        
        return ans == nums.length ? ans -1:ans;
    }
}