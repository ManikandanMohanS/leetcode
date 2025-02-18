class Solution {
    public int climbStairs(int n) {
        int c=0;
       int arr[]=new int[n+1];
      arr[0]=1;
      arr[1]=2;
      if(n>2){
      for(int  i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];
      }
      } 
        
        return arr[n-1];
    }
}