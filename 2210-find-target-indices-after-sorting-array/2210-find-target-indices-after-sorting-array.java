class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> myList =new ArrayList<>();
          for(int i=0;i<nums.length;i++){
            if(nums[i]== target){
              myList.add(i);  
            }
          }

return myList;
    }
}