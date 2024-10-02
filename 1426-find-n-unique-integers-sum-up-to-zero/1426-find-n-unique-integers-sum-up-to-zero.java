class Solution {
    public int[] sumZero(int n) {
       int i=n/2;
       int[] ans =new int[n];
       while(n-- > 0){
        if(i==0 && ans.length % 2 !=0){
            i--;
        }
        else{
            if(i==0){
                i--;
            }
            ans[n]=i--;

        }
       } 
       return ans;
    }
}