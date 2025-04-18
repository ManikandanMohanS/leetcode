class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // Check if it's even possible to make m bouquets
        if ((long) m * k > bloomDay.length) return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : bloomDay) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        // Binary search between min day and max day
        while (min < max) {
            int mid = min + (max - min) / 2;
            int possibleBouquets = getPossibleBouquets(bloomDay, mid, k);

            if (possibleBouquets < m) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    private int getPossibleBouquets(int[] bloomDay, int day, int k) {
        int bouquets = 0, flowersCollected = 0;
        for (int value : bloomDay) {
            if (value <= day) {
                flowersCollected++;
                if (flowersCollected == k) {
                    bouquets++;
                    flowersCollected = 0;
                }
            } else {
                flowersCollected = 0;
            }
        }
        return bouquets;
    }
}
