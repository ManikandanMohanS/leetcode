class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       /* char jew[]=jewels.toCharArray();
        char stone[]=stones.toCharArray();
        int jewCount=0;
        for(int i=0;i<jew.length;i++){
           for(int j=0;j<stone.length;j++){
            if(jew[i]==stone[j]){
           jewCount++;
            }
           }
        }
     return   jewCount;*/

     
        int count = 0;
        Set set = new HashSet<>();
     for(int i: jewels.toCharArray())
         set.add(i);
     for(int j: stones.toCharArray())
         if(set.contains(j)) count++;
        return count;
    
    }
}