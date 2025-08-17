class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0; i < g.length; i++) {
            int curr = g[i];
            for(int j = 0; j < s.length; j++) {
                if(s[j] >= curr) {
                    res++;
                    s[j] = 0;
                    break;
                }
            }
        }

        return res;
    }
}