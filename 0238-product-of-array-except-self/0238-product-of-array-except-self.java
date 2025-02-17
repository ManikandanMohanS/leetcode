class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arrR[]=new int [n];
        arrR[n-1]=1;
        int arrL[]=new int [n];
        arrL[0]=1;
      for(int i=1;i<n;i++){
             arrL[i] =arrL[i-1]*nums[i-1];
        }
       for(int i=n-2;i>-1;i--){
        arrR[i]=arrR[i+1]*nums[i+1];
       }

       for(int i=0;i<n;i++){
        nums[i]=arrL[i]*arrR[i];
       }
return nums;
    }
}