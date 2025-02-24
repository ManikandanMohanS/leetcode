
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        
        // Store all characters from allowed in a HashSet
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        int count = 0;
        
        // Check each word
        for (String word : words) {
            boolean isConsistent = true;
            
            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}
