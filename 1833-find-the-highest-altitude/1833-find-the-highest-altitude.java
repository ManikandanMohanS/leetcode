class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int maxAltitude=0;

        for(int  i=0;i<gain.length;i++){
             sum=sum+gain[i];
             maxAltitude=Math.max(maxAltitude,sum);
        }
        return maxAltitude;
    }
}