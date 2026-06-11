class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[] = new int[m * n];
        int idx = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        int rem = arr[0] % x;
        for(int num : arr) {
            if(num % x != rem) {
                return -1;
            }
        }

        int op = 0;
        Arrays.sort(arr);
        int med = arr[arr.length / 2];

        for(int num : arr) {
            op += Math.abs(num - med) / x;
        }

        return op;
    }
}