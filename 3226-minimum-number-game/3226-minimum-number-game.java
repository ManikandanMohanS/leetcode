class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[nums.length];
        for(int i=1;i<nums.length;i=i+2){
          arr[i-1]=nums[i];
          arr[i]=nums[i-1];
        }
        return arr;
    }
}