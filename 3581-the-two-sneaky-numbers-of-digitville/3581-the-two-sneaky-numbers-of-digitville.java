class Solution {
    public int[] getSneakyNumbers(int[] nums) {
           Arrays.sort(nums);
        int[] ans = new int[2];
        int index=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1] ) 
           {
            ans[index++] = nums[i];
           }
        }
        return ans;
         }
    
}