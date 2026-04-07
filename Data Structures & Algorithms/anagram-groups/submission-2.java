class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            anagramsMap.putIfAbsent(s, new ArrayList<>());
            anagramsMap.get(s).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
