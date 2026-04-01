class Solution {
    public int characterReplacement(String s, int k) {
    Map<Character, Integer> freq = new HashMap<>();  
    int i = 0, maxLen = 0, maxFreq = 0;

    for (int j = 0; j < s.length(); j++) {           
        char c = s.charAt(j);
        freq.put(c, freq.getOrDefault(c, 0) + 1);    
        maxFreq = Math.max(maxFreq, freq.get(c));

       
        while ((j - i + 1) - maxFreq > k) {             
            freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
            i++;
        }
        maxLen = Math.max(maxLen, j - i + 1);         
    }
    return maxLen;
}
}
