class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int diagonal = rows + cols - 1;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < diagonal; i++) {
            int m,n;

            if(i < cols) {
                m = 0;
                n = i;
            } else {
                m = i - cols + 1;
                n = cols - 1;
            }

            ArrayList<Integer> temp = new ArrayList<>();
            while (m < rows && n >= 0) {
                temp.add(mat[m][n]);
                m++;
                n--;
            }
            if (i % 2 == 0) Collections.reverse(temp);
            list.addAll(temp);

        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;

    }
}