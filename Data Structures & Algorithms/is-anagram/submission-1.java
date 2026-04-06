class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) {
            return false;
       }
       Map<Character, Integer> charMap = new HashMap<>();
       for(char c : s.toCharArray()) {
        charMap.put(c, charMap.getOrDefault(c, 0)+1);
       }
       for(char a : t.toCharArray()) {
        if(charMap.containsKey(a)) {
            if(charMap.get(a) == 1) {
            charMap.remove(a);
            } else {
               charMap.put(a, charMap.get(a)-1); 
            }
        } else {
            return false;
        }
       }
       return charMap.isEmpty();
    }
}
