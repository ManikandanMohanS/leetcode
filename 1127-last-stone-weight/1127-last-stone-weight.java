class Solution {
    public int lastStoneWeight(int[] stones) {
         int n = stones.length;
        
        while (n > 1) {
           
            Arrays.sort(stones, 0, n);
  
            int stone1 = stones[n - 1];
            int stone2 = stones[n - 2];

            if (stone1 != stone2) {
                stones[n - 2] = stone1 - stone2;
                n--; 
            } else {
               
                n -= 2;
            }  
    }
     return n == 1 ? stones[0] : 0;
}}