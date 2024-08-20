class Solution {
    public String thousandSeparator(int n) {
        int count=0;
         String result="";
         int rem=0;
        if(n==0)
           return "0";
        while(n>0){
          rem=n%10;
            n=n/10;
             result=rem+result;
             count++;
             if(count%3==0 && n>0)
             {

                result="."+result;

             }
        }
        return result;
    }

}