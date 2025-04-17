class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
             return 0;
                
        int peak=nums[0];
        int peakInd=0;
        if(nums.length==2){
            if(peak>nums[1])
                return 0;
            else
                return 1;    
        }
        int max=0;
        for(int i=1;i<nums.length-1;i++){
          if(nums[max]<nums[i])max=i;
              if(nums[i-1]<nums[i] && nums[i+1]<nums[i] ){
                if(peak<nums[i]){
                    peak=nums[i];
                    return i;
                }
              }
        }
          if(nums[max]<nums[nums.length-1])max=nums.length-1;
        return  peakInd==0?max:peakInd;
    }
}