class Solution {
    public int characterReplacement(String s, int k) {
    Map<Character, Integer> freq = new HashMap<>();  // fix 1: frequency, not index
    int i = 0, maxLen = 0, maxFreq = 0;

    for (int j = 0; j < s.length(); j++) {           // fix 2+3: start=0, end=length
        char c = s.charAt(j);
        freq.put(c, freq.getOrDefault(c, 0) + 1);    // track frequency
        maxFreq = Math.max(maxFreq, freq.get(c));

        // fix 5: correct validity condition
        while ((j - i + 1) - maxFreq > k) {             // fix 6: shrink one step
            freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
            i++;
        }
        maxLen = Math.max(maxLen, j - i + 1);         // update every step
    }
    return maxLen;
}
}
