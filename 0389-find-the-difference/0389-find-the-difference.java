class Solution {
    public char findTheDifference(String s, String t) {
        int ans[] = new int[26]; // Frequency array for lowercase letters
        
      
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
        }

       
        for (int i = 0; i < t.length(); i++) {
            ans[t.charAt(i) - 'a']--;
        }

        
        for (int i = 0; i < 26; i++) {
            if (ans[i] == -1)
                return (char) (i + 'a');
        }

        return ' '; 
    }
}
