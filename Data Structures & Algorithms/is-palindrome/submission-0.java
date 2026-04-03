class Solution {
    public boolean isPalindrome(String s) {
        
        char[] array = s.toCharArray();
        int j= array.length-1;
        int i=0;
        while(i<j) {
            if(!Character.isLetterOrDigit(array[i])){
               i++;
            } else if(!Character.isLetterOrDigit(array[j])){
                j--;
            } else if(Character.toLowerCase(array[i]) == Character.toLowerCase(array[j])) {
                i++;
                j--;
            } else {
                return false;
            }
        }
       
return true;
    }
}
