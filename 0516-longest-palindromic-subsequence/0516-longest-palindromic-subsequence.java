class Solution {
    int dp[][];
    int n;
    private int solve(int i, int j, String s) {
        if(i == j) {
            return 1;
        }

        if(i > j) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int pick = 0;
        if(s.charAt(i) == s.charAt(j)) {
            pick = 2 + solve(i + 1, j - 1, s);
        }

        int notPick = Math.max(solve(i + 1, j, s), solve(i, j - 1, s));

        dp[i][j] = Math.max(pick, notPick);
        return dp[i][j];
    }

    public int longestPalindromeSubseq(String s) {
        this.n = s.length();
        dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, s.length() - 1, s);
    }
}