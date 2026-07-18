class Solution {
    int m;
    int n;
    int dp[][];

    private int solve(int i, int j, String w1, String w2) {
        if(i == m) {
            return n - j;
        }

        if(j == n) {
            return m - i;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(w1.charAt(i) == w2.charAt(j)) {
            return dp[i][j] = solve(i + 1, j + 1, w1, w2);
        } else {
            return dp[i][j] = Math.min(1 + solve(i + 1, j, w1, w2), 1 + solve(i, j + 1, w1, w2));
        }
    }

    public int minDistance(String word1, String word2) {
        this.m = word1.length();
        this.n = word2.length();

        dp = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, word1, word2);
    }
}