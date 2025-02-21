class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char jew[]=jewels.toCharArray();
        char stone[]=stones.toCharArray();
        int jewCount=0;
        for(int i=0;i<jew.length;i++){
           for(int j=0;j<stone.length;j++){
            if(jew[i]==stone[j]){
           jewCount++;
            }
           }
        }
     return   jewCount;
    }
}