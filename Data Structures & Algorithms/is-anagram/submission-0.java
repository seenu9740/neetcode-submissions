class Solution {
    public boolean isAnagram(String s, String t) {
        if(!(s.length() == t.length())) {
            return false;
        }
       char[] sChar = s.toCharArray();
       Arrays.sort(sChar);
       String sortedS= new String(sChar);
       char[] tChar = t.toCharArray();
       Arrays.sort(tChar);
       String sortedT= new String(tChar);
       if(sortedS.equals(sortedT)){
        return true;
       } else return false;
    }
}
