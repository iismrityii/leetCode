class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;
        k = k % total;

        int newGrid[][] = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int idx = i * n + j;
                int newIdx = (idx + k) % total;

                int newRow = newIdx / n;
                int newCol = newIdx % n;

                newGrid[newRow][newCol] = grid[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                row.add(newGrid[i][j]);
            }

            list.add(row);
        }

        return list;
    }
}