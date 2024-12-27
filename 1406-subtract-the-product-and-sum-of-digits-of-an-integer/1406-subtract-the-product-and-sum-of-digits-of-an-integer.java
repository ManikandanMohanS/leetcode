class Solution {
    public int subtractProductAndSum(int n) {
        int t=n;
        int rem=0;
        int sum=0;
        int mul=1;

        while(t!=0){
              rem=t%10;
              t=t/10;
              sum=sum+rem;
              mul=mul*rem;
        }
        return mul-sum;
    }
}