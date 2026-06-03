class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            Arrays.sort(grid[i]);
        }

        int m = grid[0].length;
        int sum = 0;

        for (int j = m - 1; j >= 0; j--) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, grid[i][j]);
            }

            sum += max;
        }

        return sum;
    }
}