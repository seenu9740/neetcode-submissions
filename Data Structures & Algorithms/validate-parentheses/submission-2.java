class Solution {
    public boolean isValid(String s) {

     List<Character> openCharacters = new ArrayList<>();
     openCharacters = Arrays.asList('(','{','[');
     List<Character> closeCharacters = new ArrayList<>();
     closeCharacters = Arrays.asList(')','}',']');
     Map<Character, Character> charMap = new HashMap<>();
     charMap.put(')','(');
     charMap.put('}','{');
     charMap.put(']','[');
     ArrayDeque<Character> stack = new ArrayDeque<>();

     for(char c: s.toCharArray()) {
        if(openCharacters.contains(c)) {
            stack.push(c);
        } else if(closeCharacters.contains(c) && stack.peek() != null && stack.peek().equals(charMap.get(c))){
            stack.pop();
        } else {
            return false;
        }
     }
     if(stack.size() > 0) {
        return false;
     } 
        return true;
    }
}
