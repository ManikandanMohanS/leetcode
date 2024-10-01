class Solution {
    public int[] shuffle(int[] nums, int n) {
       int newarr[]=new  int[nums.length];
    
       for(int i=0;i<n;i++){
        newarr[2*i]=nums[i];
        newarr[(2*i)+1]= nums[n+i];
       }
    return newarr;
    }
}