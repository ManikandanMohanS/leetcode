class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int  max=0;
      int currentones=0;

      for(int i=0;i<nums.length;i++){
       
       
       if(nums[i]==1){
       currentones++;
      }
         if(nums[i]!=1){
      max=Math.max(max,currentones) ;
       currentones=0;
      }
      }
       max=Math.max(max,currentones) ;
  return max;
    }
}