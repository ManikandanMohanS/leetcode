class Solution {
    public int differenceOfSums(int n, int m) {
        int n1=0;
        int n2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                n1=n1+i;
            }
            else{
                n2=n2+i;
            }
        }
        return n1-n2;
    }
}