class Solution {
    public long coloredCells(int n) {
       if(n==1)
            return 1l;
        long result=1;
        long i=n-1;
        while(n>1){
            result+=(i*4l);
            i--;
            n--;
        }
        return result;
    }
}