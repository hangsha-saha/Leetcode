class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int result = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int maxS = Math.min(r - i, c - j);
                for (int k = 1; k <= maxS; k++) {
                    boolean isSquare = true;
                    for (int x = i; x < i + k; x++) {
                        for (int y = j; y < j + k; y++) {
                            if (matrix[x][y] != 1) {
                                isSquare = false;
                                break;
                            }
                        }
                        if (!isSquare) break;
                    }
                    if (isSquare) {
                        result++;
                    } else {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
