class Solution {
    public int distributeCandies(int n, int limit) {
        int count = 0;
        
        for (int x = 0; x <= limit; x++) {
            for (int y = 0; y <= limit; y++) {
                int j = n - (x + y);
                if (j >= 0 && j <= limit) {
                    count++;
                }
            }
        }
        return count;
    }
}
