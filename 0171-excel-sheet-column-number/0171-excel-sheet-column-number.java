class Solution {
    public int titleToNumber(String columnTitle) {
        int s = 0;
        char[] c = columnTitle.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            int ch = (int)(c[i]) - 64; 
            s = s * 26 + ch;
        }
        
        return s;
    }
}