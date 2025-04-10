class Solution {
    public int[] searchRange(int[] nums, int target) {


int[] arr=new int[2];
  arr[0]=-1;    
   for(int i=0;i<nums.length;i++){
    if(nums[i]>target){
        break;
    }
         if(nums[i]==target){
            if(arr[0]==-1)
               arr[0]=i;
            else
                arr[1]=i;   
         }
   }
  if(arr[0]==-1){
    arr[1]=-1;
  }
  if(arr[1]==0 && arr[0]!=0)
      arr[1]=arr[0];

        return arr;
    }
}