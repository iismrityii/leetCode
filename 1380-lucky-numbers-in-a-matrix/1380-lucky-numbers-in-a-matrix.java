class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int minArr[] = new int[m];
        int maxArr[] = new int[n];

        for(int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                min = Math.min(matrix[i][j], min);
            }
            minArr[i] = min;
        }

        for(int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++) {
                max = Math.max(matrix[j][i], max);
            }
            maxArr[i] = max;
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == minArr[i] && matrix[i][j] == maxArr[j]) {
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}