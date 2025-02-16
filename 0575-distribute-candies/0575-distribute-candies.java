class Solution {
    public int distributeCandies(int[] candyType) {
       int candy=1;
       Arrays.sort(candyType);
       for(int i=0;i<candyType.length-1;i++){
        if(candyType[i]!=candyType[i+1])
             candy++;
       }
      if(candy>candyType.length/2) {
        return candyType.length/2;
      }
      return candy;
    }
}