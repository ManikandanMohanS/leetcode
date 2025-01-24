class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] res = new int[nums.length+1];
        for(int num:nums){
            res[num]++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}