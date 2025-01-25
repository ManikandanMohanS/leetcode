class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int n:nums){
            int c=(int)(Math.log10(n)+1);
            if(c%2==0){
                result++;
            }
        }
        return result;
    }
}