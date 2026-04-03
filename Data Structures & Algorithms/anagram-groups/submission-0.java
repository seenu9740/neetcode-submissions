class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
           char[] charSArr = strs[i].toCharArray();
           Arrays.sort(charSArr);
           String sortedString = new String(charSArr);
           if(anagramsMap.containsKey(sortedString)){
             List<String> innerListOne = anagramsMap.get(sortedString);
             innerListOne.add(strs[i]);
             anagramsMap.put(sortedString,innerListOne);
           } else {
            List<String> innerListTwo = new ArrayList<>();
            innerListTwo.add(strs[i]);
            anagramsMap.put(sortedString, innerListTwo);
           }
        }
        List<List<String>> finalList = new ArrayList<>();
        for(Map.Entry<String, List<String>> entryList : anagramsMap.entrySet()) {
            finalList.add(entryList.getValue());
        }
        return finalList;
    }
}
