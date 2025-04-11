class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int count=0;
       while(low<=high){
          String lVal=Integer.toString(low);
          int len=lVal.length();
              if(len%2==0){
                 String firstHalf=lVal.substring(0,len/2);
                 String secondHalf=lVal.substring(len/2,len);
                     
                    if(digitSum(firstHalf)==digitSum(secondHalf))
                         count++;
                }
             low++;
           }
       return count;
    }

    public static int digitSum(String currDigit){
       int digit=Integer.parseInt(currDigit);
       int sum=0;
       while(digit!=0){
        sum=sum+(digit%10);
        digit=digit/10;
       }
      return sum; 
    }
}