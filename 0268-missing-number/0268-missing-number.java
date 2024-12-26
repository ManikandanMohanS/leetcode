class Solution {
    public int missingNumber(int[] nums) {
      // HashSet <Integer> set=new HashSet<Integer>();
      int size=nums.length  + nums.length +1;
      int[] arr = new int[size];
int k=0;
       for(int i=0;i<nums.length+1;i++)
       {
     arr[k++]=i;
       }
       for(int i=0;i<nums.length;i++)
       {
        arr[k++]=nums[i];
       }
       int xor=0;
       for(int i=0;i<size;i++)
       {
xor=xor^arr[i];
       }
       return xor;
    }
}