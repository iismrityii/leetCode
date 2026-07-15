class Solution {
    // int dp[][];
    // int m;
    // int n;

    // private int solve(int i, int j, String text1, String text2) {
    //     if(i == m || j == n) {
    //         return 0;
    //     }

    //     if(dp[i][j] != -1) {
    //         return dp[i][j];
    //     }

    //     int pick = 0;
    //     if(text1.charAt(i) == text2.charAt(j)) {
    //         pick = 1 + solve(i + 1, j + 1, text1, text2);
    //     }
        
    //     int notPick = Math.max(solve(i, j + 1, text1, text2), solve(i + 1, j, text1, text2));
    //     dp[i][j] = Math.max(pick, notPick);
    //     return dp[i][j];
    // }

    public int longestCommonSubsequence(String text1, String text2) {
    //     this.m = text1.length();
    //     this.n = text2.length();

    //     dp = new int[m][n];
    //     for(int i = 0; i < m; i++) {
    //         Arrays.fill(dp[i], -1);
    //     }

    //     return solve(0, 0, text1, text2);

        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m + 1][n + 1];
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][0];
    }
}