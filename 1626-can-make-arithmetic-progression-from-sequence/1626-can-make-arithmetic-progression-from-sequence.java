class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      Arrays.sort(arr);
        int def=arr[1]-arr[0];
    for(int i=0;i<arr.length-1;i++){
      if(arr[i+1]-arr[i]!=def){
          return false;
        }
     }
 return true;
    }
}