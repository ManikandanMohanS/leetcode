class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> mylist =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mylist.add(index[i],nums[i]);
        }
    int t[]=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        t[i]=mylist.get(i);
        }
      return t;  
    }
}