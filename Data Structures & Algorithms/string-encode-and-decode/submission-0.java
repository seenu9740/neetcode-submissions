class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
    
    List<String> decodedList = new ArrayList<>();
    int i = 0;
    while(i < s.length()) {
        int j = s.indexOf('#',i);
        int len = Integer.parseInt(s.substring(i, j));
        String str = s.substring(j+1, j+1+len);
        decodedList.add(str);
        i=j+1+len;
    }
return decodedList;
    }
}
