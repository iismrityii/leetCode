class Solution {
    int dp[][];
    private int solve(int i, int prev, int pairs[][]) {
        if(i == pairs.length) {
            return 0;
        }

        if(dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int pick = 0;
        if(prev == -1 || pairs[i][0] > pairs[prev][1]) {
            pick = 1 + solve(i + 1, i, pairs);
        }

        int notPick = solve(i + 1, prev, pairs);
        dp[i][prev + 1] = Math.max(pick, notPick);
        return dp[i][prev + 1];
    }

    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        dp = new int[n][n + 1];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, -1, pairs);
    }
}