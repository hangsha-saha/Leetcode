class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int r = dimensions.length;
        int c = dimensions[0].length;
        double maxD = 0.0;
        int area = -1;

        for(int i = 0; i < r; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double diagonal = Math.sqrt((l * l) + (w * w));
            if (diagonal > maxD) {
                maxD = diagonal;
                area = dimensions[i][0] * dimensions[i][1];
            } else if (maxD == diagonal) {
                int a = dimensions[i][0] * dimensions[i][1];
                area = Math.max(area, a);
            }
        }

        
        return area;
    }
}