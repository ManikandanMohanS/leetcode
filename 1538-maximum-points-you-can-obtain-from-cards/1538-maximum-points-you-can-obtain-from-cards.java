class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum=0,lsum=0,rsum=0;
       for(int i=0;i<k;i++){
        lsum=lsum+cardPoints[i];
       }
       int j=k-1;
      for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--){
        maxsum=Math.max(maxsum,(lsum+rsum));
        lsum=lsum-cardPoints[j];
        j--;
        rsum=rsum+cardPoints[i];
      }
   maxsum=Math.max(maxsum,(lsum+rsum));
    


  return maxsum;
    }
}