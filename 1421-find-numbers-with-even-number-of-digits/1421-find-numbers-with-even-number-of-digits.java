class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int n:nums){
            int c=0;

            while(n!=0){
                n=n/10;
                c++;
            }
            if(c%2==0){
                result++;
            }
        }
        return result;
    }
}