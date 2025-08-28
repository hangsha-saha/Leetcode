class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                if (!diagonals.containsKey(key)) {
                    diagonals.put(key, new ArrayList<>());
                }
                diagonals.get(key).add(grid[i][j]);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : diagonals.entrySet()) {
            List<Integer> list = entry.getValue();
            if (entry.getKey() < 0) {
                list.sort(Collections.reverseOrder());
            } else {
                Collections.sort(list);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                List<Integer> list = diagonals.get(key);
                grid[i][j] = list.remove(list.size() - 1);
            }
        }

        return grid;
    }
}
