class Solution {
    int m;
    int n;
    int dp[][];

    private int solve(int i, int j, String word1, String word2) {
        if(i == m) {
            return n - j;
        }

        if(j == n) {
            return m - i;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = solve(i + 1, j + 1, word1, word2);
        }

        int insert = 1 + solve(i, j + 1, word1, word2);
        int delete = 1 + solve(i + 1, j, word1, word2);
        int replace = 1 + solve(i + 1, j + 1, word1, word2);
    
        dp[i][j] = Math.min(insert, Math.min(delete, replace));
        return dp[i][j];
    }

    public int minDistance(String word1, String word2) {
        this.m = word1.length();
        this.n = word2.length();
        dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, word1, word2);
    }
}