class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int  end=nums.length-1;
        int start=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]%2==0){
                ans[start]=nums[i];
                start++;
              }
              else{
                 ans[end]=nums[i];
                end--;
              }
        }
        return ans;
    }
}