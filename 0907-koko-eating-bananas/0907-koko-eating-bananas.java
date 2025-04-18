class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid; // try a smaller speed
            } else {
                low = mid + 1; // need a faster speed
            }
        }

        return low; // low == high
    }

    private int findMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + speed - 1) / speed; // same as Math.ceil(pile/speed)
        }
        return time <= h;
    }
}
