class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        int[] need = new int[26];
        for (int i = 0; i < m; i++) need[s1.charAt(i) - 'a']++;

        int[] win = new int[26];
        for (int i = 0; i < m; i++) win[s2.charAt(i) - 'a']++;

        int diff = 0;
        for (int i = 0; i < 26; i++) if (need[i] != win[i]) diff++;

        if (diff == 0) return true;

        for (int i = m; i < n; i++) {
            int add = s2.charAt(i) - 'a';
            int rem = s2.charAt(i - m) - 'a';

            if (win[add] == need[add]) diff++;
            win[add]++;
            if (win[add] == need[add]) diff--;

            if (win[rem] == need[rem]) diff++;
            win[rem]--;
            if (win[rem] == need[rem]) diff--;

            if (diff == 0) return true;
        }

        return false;
    }
}