class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res =0;
         for(int i=0;i<nums.size();i++){
            for(int j=1+i;j<nums.size();j++){
                    if(nums.get(i)+nums.get(j) <target){
                        res++;
                    }
             }
         }

        return res;
    }
}