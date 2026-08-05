class Solution {
    int m;
    int n;
    int dp[][];

    private int solve(String t1, String t2, int i, int j) {
        if(i == m || j == n) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int pick = 0;
        if(t1.charAt(i) == t2.charAt(j)) {
            pick = 1 + solve(t1, t2, i + 1, j + 1);
        }

        int notPick = Math.max(solve(t1, t2, i + 1, j), solve(t1, t2, i, j + 1));
        return dp[i][j] = Math.max(pick, notPick);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        this.m = text1.length();
        this.n = text2.length();
        dp = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(text1, text2, 0, 0);
    }
}