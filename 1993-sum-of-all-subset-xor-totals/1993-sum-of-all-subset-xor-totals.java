class Solution {
    public int subsetXORSum(int[] nums) {
     return helper(nums,0,0);

    }

    public int helper(int nums[],int level,int currentSum){
        if(level==nums.length)
         return currentSum;

        int take=helper(nums,level+1,currentSum ^ nums[level]);
        int notTake=helper(nums,level+1,currentSum);

        return take+notTake;
    }
}