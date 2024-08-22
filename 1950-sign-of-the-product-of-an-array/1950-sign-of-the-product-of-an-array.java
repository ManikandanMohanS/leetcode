class Solution {
    public int arraySign(int[] nums) {
       int negativenumber=0;
       for(int n: nums){
        if(n<0) negativenumber++;
        if(n==0) return 0;


       }  
    return   negativenumber%2==0?1:-1;
    }
}