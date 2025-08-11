class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
      int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
       
        if(sum%3!=0){
              return false;
       }
       int equalSum=sum/3;
        sum=0;
      int  equalCount=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==equalSum){
                   equalCount++;
                   sum=0;
            
                if(equalCount==2 && i<arr.length-1 ){
                   return true;
                   }
             }
        }
     return false;

    }
}