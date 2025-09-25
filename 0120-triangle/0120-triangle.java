class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        if (triangle.size() == 1) return triangle.get(0).get(0);

        // start from second-last row and fold minimum path sums upward
        for (int row = triangle.size() - 2; row >= 0; row--) {
            List<Integer> cur = triangle.get(row);
            List<Integer> below = triangle.get(row + 1);
            for (int col = 0; col < cur.size(); col++) {
                int minChild = Math.min(below.get(col), below.get(col + 1));
                cur.set(col, cur.get(col) + minChild);
            }
        }

        return triangle.get(0).get(0);
    }
}
