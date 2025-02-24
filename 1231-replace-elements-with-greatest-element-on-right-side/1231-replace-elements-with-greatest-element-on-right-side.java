class Solution {
    public int[] replaceElements(int[] arr) {
       int  ans[]=new int [arr.length];
       Arrays.fill(ans,-1);

       int currentMax=-1;
       for(int i=arr.length-1;i>=0;i--){
           ans[i]=  currentMax;
          currentMax=Math.max( currentMax,arr[i]);

       }

return ans;
    }
}