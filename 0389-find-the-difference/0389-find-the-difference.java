class Solution {
    public char findTheDifference(String s, String t) {
        char ans = '\0';
        StringBuilder sb = new StringBuilder(s);
        char[] arr = t.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            int idx = sb.indexOf(String.valueOf(ch));

            if (idx == -1) {
                ans = ch;
                break;
            } else {
                sb.deleteCharAt(idx);
            }
        }
        return ans;
    }
}
