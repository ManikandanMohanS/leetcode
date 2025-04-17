class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int ans = 1;
        for (int i = 1; i <= x / 2; i++) {
            if (i <= x / i) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}
