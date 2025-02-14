class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0, leftPtr = 0;
        Map<Integer, Integer> diffTypesOfFruits = new HashMap<>();
        for (int rightPtr = 0; rightPtr < fruits.length; rightPtr++) {
            diffTypesOfFruits.put(fruits[rightPtr], diffTypesOfFruits.getOrDefault(fruits[rightPtr], 0) + 1);
            while (diffTypesOfFruits.size() > 2) {
                diffTypesOfFruits.put(fruits[leftPtr], diffTypesOfFruits.get(fruits[leftPtr]) - 1);
                if (diffTypesOfFruits.get(fruits[leftPtr]) == 0)
                    diffTypesOfFruits.remove(fruits[leftPtr]);
                leftPtr++;
            }
            maxFruits = Math.max(maxFruits, rightPtr - leftPtr + 1);
        }
        return maxFruits;
    }
}