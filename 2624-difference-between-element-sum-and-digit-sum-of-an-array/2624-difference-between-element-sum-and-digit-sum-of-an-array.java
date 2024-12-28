class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
         esum=esum+nums[i];
         if(nums[i]<10){
        dsum=dsum+nums[i];
         }
         else{
         int   t=nums[i];
            while(t!=0){
                int rem=t%10;
                t=t/10;
                dsum=dsum+rem;
            }
         }
        }
        return esum-dsum;
    }
}