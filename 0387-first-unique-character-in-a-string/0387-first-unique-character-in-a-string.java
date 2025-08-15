class Solution {
    public int firstUniqChar(String s) {
        char res = '\0';

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char tg = s.charAt(i);
            int count = freq[tg - 'a'];
            if (count == 1) {
                res = tg;
                break;
            }
        }

        return s.indexOf(res);
    }
}