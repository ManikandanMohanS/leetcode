class Solution {
    public int lastStoneWeight(int[] stones) {
         int n = stones.length;
        
        while (n > 1) {
            // Sort stones in descending order
            Arrays.sort(stones, 0, n);
            
            // Get the two heaviest stones
            int stone1 = stones[n - 1];
            int stone2 = stones[n - 2];

            // If they are not equal, replace the second largest stone
            if (stone1 != stone2) {
                stones[n - 2] = stone1 - stone2;
                n--; // Reduce the size of the array by 1
            } else {
                // Both stones are destroyed, reduce array size by 2
                n -= 2;
            }  
    }
     return n == 1 ? stones[0] : 0;
}}