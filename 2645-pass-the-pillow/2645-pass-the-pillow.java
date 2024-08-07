class Solution {
    public int passThePillow(int n, int time) {
        int rem=time%(2*n-2);
        if(rem<=n-1){
            return rem+1;

        }
        else{
            return (2*n-2)-rem+1;
        }
    }
}