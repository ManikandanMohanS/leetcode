class Solution {
    private final String[] morseCodes = {
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        final Set<String> codes = new HashSet<>();

        for (String word : words) {
            final StringBuilder morseCode = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                morseCode.append(morseCodes[word.charAt(i) - 'a']);
            }
            codes.add(morseCode.toString());
        }

        return codes.size();
    }
}