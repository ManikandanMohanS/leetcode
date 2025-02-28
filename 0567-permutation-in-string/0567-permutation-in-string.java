

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        // Populate need map with character frequencies from s1
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int start = 0, count = 0;
        for (int end = 0; end < s2.length(); end++) {
            char c = s2.charAt(end);
            
            // If the character is in s1, update the have map
            if (need.containsKey(c)) {
                have.put(c, have.getOrDefault(c, 0) + 1);
                
                // If we have not exceeded the required count, increment count
                if (have.get(c) <= need.get(c)) {
                    count++;
                }
            }

            // If window size exceeds s1.length(), shrink from left
            if (end - start + 1 > s1.length()) {
                char startChar = s2.charAt(start);
                if (need.containsKey(startChar)) {
                    if (have.get(startChar) <= need.get(startChar)) {
                        count--;
                    }
                    have.put(startChar, have.get(startChar) - 1);
                }
                start++;
            }

            // If count equals s1.length(), we found a valid permutation
            if (count == s1.length()) {
                return true;
            }
        }

        return false;
    }
}
