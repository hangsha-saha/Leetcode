class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k, n);
            StringBuilder firstK = new StringBuilder(s.substring(i, end)).reverse();
            sb.append(firstK);

            if (i + k < n) {
                int nextEnd = Math.min(i + 2 * k, n);
                sb.append(s.substring(i + k, nextEnd));
            }
        }

        return sb.toString();
    }
}
