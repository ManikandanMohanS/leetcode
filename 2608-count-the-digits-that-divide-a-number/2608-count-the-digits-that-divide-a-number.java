class Solution {
    public int countDigits(int num) {
        int temp=num;
        int k=0;

        while(temp!=0){
            int rem=temp%10;
            temp/=10;
            if(num%rem==0){
                k++;
            }

        }
        return k;
    }
}