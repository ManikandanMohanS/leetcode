class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;
        
        // Step 1: Find the range (1-digit, 2-digit, etc.)
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        
        // Step 2: Find the actual number
        start += (n - 1) / digitLength;
        
        // Step 3: Find the digit in the number
        String numStr = Long.toString(start);
        return numStr.charAt((n - 1) % (int)digitLength) - '0';
    }
}
