class Solution {
    public int[] closestPrimes(int left, int right) {

        List<Integer> prime=new ArrayList<>();
       for (int i = left; i <= right; i++) {
    if (i < 2) continue; // Ignore numbers less than 2
    boolean isPrime = true;
    
    for (int j = 2; j * j <= i; j++) { // Check up to sqrt(i)
        if (i % j == 0) {
            isPrime = false;
            break; // No need to check further
        }
    }
    
    if (isPrime) {
        prime.add(i);
    }
}
        int[] arr = prime.stream().mapToInt(Integer::intValue).toArray();
          int  result[]=new int[2];
        if(arr.length<2){
  result[0]=-1;
            result[1]=-1;
         return result;
        }
        int ans[]=new int[arr.length-1];
        for(int i=0;i<ans.length;i++){

            ans[i]=arr[i+1]-arr[i];
        }
        int min=Integer.MAX_VALUE;

         for(int i=0;i<ans.length;i++){
              if(min>ans[i])
                 min=ans[i];
           }
           int ansindex=-1;
             for(int i=0;i<ans.length;i++){
              if(min==ans[i]){
                  ansindex=i;
                  break;
           }
             }

 
      if(ansindex==-1){
            result[0]=-1;
            result[1]=-1;
         return result;
     }
          
            result[0]=arr[ansindex];
            result[1]=arr[ansindex+1];
         return result;
   }


   
}