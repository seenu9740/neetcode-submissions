class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> charMap = new HashMap<>();

        int i=0, maxLen=0;
        for(int j=0;j<s.length(); j++) {
            char c=s.charAt(j);
            if(charMap.containsKey(c) && charMap.get(c)>=i){
                i=charMap.get(c)+1;
            }
            charMap.put(c, j);
            maxLen = Math.max(maxLen, j-i+1);

        }
        return maxLen;
    }
}
