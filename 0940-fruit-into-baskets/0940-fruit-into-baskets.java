class Solution {
    public int totalFruit(int[] fruits) {
      
        HashMap<Integer, Integer> fruitCount = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);

            while (fruitCount.size() > 2) { // If more than 2 types of fruit are in baskets
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                left++; // Shrink the window
            }

            maxFruits = Math.max(maxFruits, right - left + 1); // Update max count
        }

        return maxFruits;
    }
    
}